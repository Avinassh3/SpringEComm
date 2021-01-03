package com.lti.project.repository;

import com.lti.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    public boolean existsByEmail(String email);
    public User findByEmail(String email);
}
