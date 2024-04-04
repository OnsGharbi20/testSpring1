package com.example.croco.user.service;

import com.example.croco.user.interfaceService.RoleServiceInterface;
import com.example.croco.user.model.RoleModel;
import com.example.croco.user.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RoleService  implements RoleServiceInterface {

    @Autowired
    private RoleRepository roleRepository;


    public List<RoleModel> getRoles() {
        List<RoleModel> roles = new ArrayList<>();
        roleRepository.findAll().forEach(role ->{
            roles.add(role);

        });

        return roles;
    }

    public RoleModel getRole(long id) {
        return roleRepository.findById(id).orElse(null);
    }
    public void deleteRole(long id) {
        roleRepository.deleteById(id);
    }
    public void addRole(RoleModel role) {
        roleRepository.save(role);
    }
    public void updateRole(RoleModel role, long id) {
        roleRepository.save(role);
    }
}
