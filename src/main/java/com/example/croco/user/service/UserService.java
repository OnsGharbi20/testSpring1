package com.example.croco.user.service;


import com.example.croco.user.interfaceService.UserServiceInterface;
import com.example.croco.user.model.UserModel;
import com.example.croco.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService  implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;


    public List<UserModel> getUsers() {
        List<UserModel> users = new ArrayList<>();
        userRepository.findAll().forEach(user ->{
            users.add(user);

        });

        return users;
    }

    public UserModel getUser(long id) {
        return userRepository.findById(id).orElse(null);
    }
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
    public void addUser(UserModel user) {
        userRepository.save(user);
    }
    public void updateUser(UserModel user, long id) {
        userRepository.save(user);
    }
}
