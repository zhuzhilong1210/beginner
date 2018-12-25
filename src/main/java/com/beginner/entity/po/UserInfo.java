package com.beginner.entity.po;

import lombok.Data;

@Data
public class UserInfo {
    private Integer id;

    private String name;

    private Byte gender;

    private Byte age;

    private String telephone;

    private Byte registerMode;

    private String thirdPartyId;

}