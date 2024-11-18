package com.ewflorencio.SpringBootWebLearn.service;

import com.ewflorencio.SpringBootWebLearn.model.User;
import com.ewflorencio.SpringBootWebLearn.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return  userRepository.findAll();
    }

}
