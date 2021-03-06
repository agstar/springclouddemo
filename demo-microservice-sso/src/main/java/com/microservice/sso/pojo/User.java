package com.microservice.sso.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private String id;

    private String username;

    private String password;

    private String name;

    private String email;

    private Date birthday;

    private String sex;

    private Integer state;

    private String code;

    public User(String id, String username, String password, String name, String email, Date birthday, String sex, Integer state, String code) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.state = state;
        this.code = code;
    }

    public User() {
    }
}
