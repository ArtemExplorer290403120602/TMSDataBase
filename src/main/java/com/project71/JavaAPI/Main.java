package com.project71.JavaAPI;

import com.project71.JavaAPI.model.User;
import com.project71.JavaAPI.repository.UserRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = new User();

        user.setUsername("anna1234");
        user.setPassword("12345");
        user.setEmail("anna@mail.ru");
        user.setFirstname("Anna");
        user.setLastname("Bariluk");
        user.setGender("woman");
        user.setAge(21);
        user.setCity("Moscow");
        user.setCreate(Timestamp.valueOf(LocalDateTime.now()));
        System.out.println(userRepository.createUser(user));

        System.out.println(userRepository.deleteUser(2L));
    }
}
