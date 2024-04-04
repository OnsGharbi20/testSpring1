package com.example.croco.user.repository;

import com.example.croco.user.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
}
