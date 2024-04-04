package com.example.croco.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


    @Entity
    @Table(name = "role_model")
    public class RoleModel {




        @Id
        @GeneratedValue
        private Long id;

        private String libele;
        private String code;

    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private List<UserModel> users;


    public RoleModel(){}

        public RoleModel(String libele, String code) {
            this.libele = libele;
            this.code = code;
        }

        public Long getId() {
            return id;
        }



        public String getLibele() {
            return libele;
        }

        public void setLibele(String libele) {
            this.libele = libele;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }


    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    }
