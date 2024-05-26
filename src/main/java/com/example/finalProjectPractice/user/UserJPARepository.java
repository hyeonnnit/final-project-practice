package com.example.finalProjectPractice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface UserJPARepository extends JpaRepository<User, Integer> {

    //로그인용
    Optional<User> findByUsernameAndPassword (@Param("username") String username, @Param("password") String password);

    User findByUsername(@PathVariable("username") String username);
}
