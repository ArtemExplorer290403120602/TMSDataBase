package com.project71.JDBC.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private  String firstname;
    private  String lastname;
    private  String gender;
    private Integer age;
    private String city;
}
