package com.example.finalProjectPractice.orderItem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderItemService {
    private final OrderItemJPARepository orderItemJPARepository;

}
