package com.bootcamp.springboot.service.Interface;

import com.bootcamp.springboot.dto.UserRegistrationDto;
import com.bootcamp.springboot.model.User;
import com.bootcamp.springboot.repo.UserReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}