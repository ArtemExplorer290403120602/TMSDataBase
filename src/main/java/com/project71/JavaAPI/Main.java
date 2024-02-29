package com.project71.JavaAPI;

import com.project71.JavaAPI.model.User;
import com.project71.JavaAPI.repository.UserRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        user.setId(2L);
        user.setUsername("Polina");
        user.setPassword("1");
        user.setEmail("2");
        user.setFirstname("1");
        user.setLastname("2");
        user.setGender("m");
        user.setAge(17);
        user.setCity("b");
        System.out.println(userRepository.updateUser(user));

        //System.out.println(userRepository.deleteUser(2L));
    }
}
