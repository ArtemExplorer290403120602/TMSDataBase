package com.project71.JDBC;

import com.project71.JDBC.model.User;
import com.project71.JDBC.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository= new UserRepository();
        User user=new User();

        user.setUsername("artiom12082");
        user.setPassword("12345");
        user.setEmail("artem@mail.ru");
        user.setFirstname("Artem");
        user.setLastname("Mekhanikov");
        user.setGender("boy");
        user.setAge(20);
        user.setCity("Minsk");
        System.out.println(userRepository.createUser(user));
    }
}
