package com.beginner.entity.po;

import lombok.Data;

@Data
public class UserPassword {
    private Integer id;

    private Integer userId;

    private String password;
}