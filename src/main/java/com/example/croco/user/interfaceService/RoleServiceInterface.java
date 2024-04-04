package com.example.croco.user.interfaceService;

import com.example.croco.user.model.RoleModel;

import java.util.List;

public interface RoleServiceInterface {

    public List<RoleModel> getRoles() ;

    public RoleModel getRole(long id);
    public void deleteRole(long id);
    public void addRole(RoleModel role);
    public void updateRole(RoleModel role, long id);
}
