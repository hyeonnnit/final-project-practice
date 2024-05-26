package com.example.finalProjectPractice.user;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserJPARepositoryTest {
    @Autowired
    private UserJPARepository userJPARepository;
    @Autowired
    private EntityManager em;


    // 로그인 테스트
//    @Test
//    public void findByUsernameAndPassword_test(){
//        // given
//        String username = "ssar";
//        String password = "1234";
//
//        // when
//        userJPARepository.findByUsernameAndPassword(username, password);
//
//        // then
//
//    }


}
