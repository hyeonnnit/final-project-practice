package com.example.finalProjectPractice.order;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class OrderJPARepositoryTest {
    @Autowired
    private OrderJPARepository applyJPARepository;
    @Autowired
    private EntityManager em;
}
