package com.project71.JDBC;

import com.project71.JDBC.model.User;
import com.project71.JDBC.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository= new UserRepository();
        User user=new User();
        System.out.println(userRepository.readUser(1L));
        System.out.println("-----------------------------");
        System.out.println(userRepository.findALL());
    }
}
