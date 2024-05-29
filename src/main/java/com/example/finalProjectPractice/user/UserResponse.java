package com.example.finalProjectPractice.user;

import lombok.Data;

import java.sql.Date;

public class UserResponse {

    //로그인 용
    @Data
    public static class LoginDTO {
        //        private String username;
//        //패스워드가 있어도 되나...
//        private String password;
        private User user;
        private Boolean isCheck;

        public LoginDTO(User user, Boolean isCheck) {
            this.user = user;
            this.isCheck = isCheck;
        }
    }


    @Data
    public static class JoinDTO {
        private String password;
        private String username;
        private String phone;
        private String email;
        private Date birth;
        private Integer role;
        private UserGender gender;

        public JoinDTO(User user) {
            this.password = user.getPassword();
            this.username = user.getUsername();
            this.phone = user.getPhone();
            this.email = user.getEmail();
            this.birth = user.getBirth();
            this.gender = user.getGender();
            this.role = user.getRole();
        }
    }
}
