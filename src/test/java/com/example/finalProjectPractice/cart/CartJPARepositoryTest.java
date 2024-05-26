package com.example.finalProjectPractice.cart;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CartJPARepositoryTest {
    @Autowired
    private CartJPARepository applyJPARepository;
    @Autowired
    private EntityManager em;
}
