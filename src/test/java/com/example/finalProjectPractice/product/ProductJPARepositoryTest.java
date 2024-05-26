package com.example.finalProjectPractice.product;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProductJPARepositoryTest {
    @Autowired
    private ProductJPARepository applyJPARepository;
    @Autowired
    private EntityManager em;
}
