package com.example.croco.user.interfaceService;

import com.example.croco.user.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public interface UserServiceInterface {


    public List<UserModel> getUsers();
    public UserModel getUser(long id) ;
    public void deleteUser(long id) ;

    public void addUser(UserModel user);
    public void updateUser(UserModel user, long id);
}
