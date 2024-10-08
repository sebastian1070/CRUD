package com.mycompany.springbootrestapi.repository;

import com.mycompany.springbootrestapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}