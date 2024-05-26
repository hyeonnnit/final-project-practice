package com.example.finalProjectPractice.cart;


import com.example.finalProjectPractice.product.Product;
import com.example.finalProjectPractice.user.User;
import lombok.Data;

public class CartRequest {

    //장바구니 업데이트
    @Data
    public static class UpdateDTO{
        private Integer cartId;
        private Integer orderQty;
        private Boolean isChecked;
    }

    @Data
    public static class saveDTO {
//        private Integer userId;
        private Integer productId;
        private Integer orderQty;
        private Boolean isChecked;

        public Cart toEntity(User sessionUser, Product product) {
            return Cart.builder()
                    .product(product)
                    .orderQty(orderQty)
                    .isChecked(isChecked)
                    .user(sessionUser)
                    .build();
        }

    }


}
