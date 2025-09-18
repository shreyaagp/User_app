package com.demoApi.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demoApi.Models.User;
import com.demoApi.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public String addUser(User user) {
        userRepository.save(user);
        return "User added successfully with ID: " + user.getUserId();
    }
}

