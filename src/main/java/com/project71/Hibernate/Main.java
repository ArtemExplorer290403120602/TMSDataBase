package com.project71.Hibernate;

import com.project71.Hibernate.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository=new UserRepository();
        System.out.println(userRepository.deleteUser(1L));
    }
}
