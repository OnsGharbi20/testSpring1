package com.example.croco.user.controller;

import com.example.croco.user.interfaceService.RoleServiceInterface;
import com.example.croco.user.model.RoleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins="*")
@RestController
public class RoleController {

    @Autowired
    private RoleServiceInterface roleServiceInterface;
    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<RoleModel> getRole() {

        return roleServiceInterface.getRoles();
    }
    @RequestMapping("/role/{id}")
    public RoleModel getRole(@PathVariable long id) {
        return roleServiceInterface.getRole(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/role/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleServiceInterface.deleteRole(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/roles")
    public void addRole(@RequestBody RoleModel role) {
        roleServiceInterface.addRole(role);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/role/{id}")
    public void updateRole(@RequestBody RoleModel role, @PathVariable long id) {
        roleServiceInterface.updateRole(role, id);
    }
}
