package com.bootcamp.springboot.repo;

import com.bootcamp.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposistory extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
