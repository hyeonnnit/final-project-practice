package com.example.finalProjectPractice.order;

import com.example.finalProjectPractice.cart.CartResponse;
import com.example.finalProjectPractice.user.User;
import com.example.finalProjectPractice.user.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;
    private final HttpSession session;

    // 관리자 확인 용
    @GetMapping("/admin-list")
    public String adminList(HttpServletRequest request) {

        List<OrderResponse.orderItemDTO> orderItemList = orderService.adminList();
        request.setAttribute("orderItemList", orderItemList);
        return "/admin/list";
    }

    // 주문 목록
    @GetMapping({"/order-list"})
    public String list(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userService.findUserId(sessionUser.getId());

        List<OrderResponse.orderItemDTO> orderItemList = orderService.orderList(user.getId());
        request.setAttribute("orderItemList", orderItemList);
        return "/order/list";
    }


    @GetMapping("/order/save-form")
    public String saveForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userService.findUserId(sessionUser.getId());

        List<CartResponse.ListDTO> cartList = orderService.orderCartList(user.getId());
        System.out.println("잘나오나 " + cartList);

        //totalSum 계산용
        Integer totalSum = cartList.stream().mapToInt(value -> value.getSum()).sum();

        request.setAttribute("user", user);
        request.setAttribute("cartList", cartList);
        request.setAttribute("totalSum", totalSum);
        return "/order/save-form";
    }


    // 주문하기
    @PostMapping("/order/save")
    public String order(OrderRequest.SaveDTO requestDTO) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userService.findUserId(sessionUser.getId());

        //Enum 쓰기!!
        requestDTO.setStatus(OrderStatus.ORDER_COMPLETE);
        //구매하기 로직
        orderService.saveOrder(requestDTO, user);

        return "redirect:/order-list";
    }

    // 삭제하기 <- order는 삭제하지 않고 update로 상태값만 바꿔서 합니다
    @PostMapping("/order/cancel")
    public @ResponseBody String cancel(@RequestBody List<OrderRequest.CancelDTO> requestDTO) {
        orderService.orderCancel(requestDTO);
        return "redirect:/order-list";
    }
}
