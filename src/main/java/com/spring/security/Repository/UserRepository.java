package com.spring.security.Repository;

import com.spring.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author nawaz
 */


public interface UserRepository extends JpaRepository<User, String> {

    public Optional<User> findByEmail(String email);

}