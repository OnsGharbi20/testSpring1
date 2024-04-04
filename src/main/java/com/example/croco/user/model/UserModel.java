package com.example.croco.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;



@Entity
@Table(name = "user_model")
public class UserModel {




    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private String prenom;
    private Integer age;
    private String email;

    @Column(name = "role_libele")  // Ajoutez une colonne pour stocker le libele du role
    private String roleLibele;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleModel role;



    public UserModel(){}

    public UserModel(String nom, String prenom, Integer age, String email, RoleModel role) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
        this.role= role;
        this.roleLibele= role.getLibele();


    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }
}
