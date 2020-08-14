package com.mb.jwtauthentication.repository;

import java.util.Optional;

import com.mb.jwtauthentication.model.Role;
import com.mb.jwtauthentication.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}