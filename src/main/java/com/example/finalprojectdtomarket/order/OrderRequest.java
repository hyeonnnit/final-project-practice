package com.example.finalprojectdtomarket.order;

import com.example.finalprojectdtomarket.cart.Cart;
import com.example.finalprojectdtomarket.user.User;
import lombok.Data;

public class OrderRequest {
    @Data
    public static class SaveDTO {
        private User user;
        private Integer sum;
        private OrderStatus status;
        private String address;


        public Order toEntity(User user) {
            return Order.builder()
                    .user(user)
                    .sum(sum)
                    .address(address)
                    .status(status)
                    .build();
        }
    }
}
