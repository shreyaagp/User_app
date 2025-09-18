package com.demoApi.Controllers;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demoApi.Models.User;
import com.demoApi.Services.UserService;

@RestController
@RequestMapping("/user") // Base URL: http://localhost:8081/user
public class UserController {

    @Autowired
    private UserService userService;

    // =======================
    // GET: All Users
    // =======================
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // =======================
    // POST: Add New User
    // =======================
    @PostMapping
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
