package com.project71.JDBC;

import com.project71.JDBC.model.User;
import com.project71.JDBC.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository= new UserRepository();
        User user=new User();
        user.setUsername("Dima");
        user.setPassword("4321");
        user.setEmail("dima@mail.ru");
        user.setAge(24);
        user.setId(2L);
        System.out.println(userRepository.updateUser(user));
    }
}
