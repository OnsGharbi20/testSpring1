package com.example.croco.user.controller;

import com.example.croco.user.model.UserModel;
import com.example.croco.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
   @RequestMapping("/users")
    public List<UserModel> getUser() {

        return userService.getUsers();
    }
    @RequestMapping("/user/{id}")
    public UserModel getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/users")
    public void addUser(@RequestBody UserModel user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/user/{id}")
    public void updateUser(@RequestBody UserModel user, @PathVariable long id) {
        userService.updateUser(user, id);
    }
}
