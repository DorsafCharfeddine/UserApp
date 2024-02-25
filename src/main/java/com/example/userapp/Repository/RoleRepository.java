package com.example.userapp.Repository;

import java.util.Optional;

import com.example.userapp.Entity.ERole;
import com.example.userapp.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}