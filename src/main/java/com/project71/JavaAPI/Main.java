package com.project71.JavaAPI;

import com.project71.JavaAPI.model.User;
import com.project71.JavaAPI.repository.UserRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        User user = new User();

        //System.out.println(userRepository.findById(1L));
        System.out.println(userRepository.findALL());
    }
}
