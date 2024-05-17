package com.example.finalprojectdtomarket.order;

import com.example.finalprojectdtomarket.user.User;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class OrderController {
    private final OrderService orderService;
    private final HttpSession session;

    // 주문 목록
    @GetMapping({"/order-list"})
    public String list() {
        return "";
    }

    // 주문하기
    @GetMapping("/order/save-form")
    public String orderSaveForm() {
        return "order/save-form";
    }

    // 주문하기
    @PostMapping("/order/save")
    public String orderSave(OrderRequest.SaveDTO saveDTO) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        OrderResponse.OrderSaveDTO order = orderService.saveOrder(saveDTO,sessionUser);
        System.out.println("test::" + order);
        return "redirect:/order/save-form";
    }

    // 삭제하기
    @PostMapping("/order/{id}/delete")
    public String delete() {
        return "";
    }
}
