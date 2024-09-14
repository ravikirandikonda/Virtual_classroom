package com.example.virtualclassroom.controllers;

import com.example.virtualclassroom.models.User;
import com.example.virtualclassroom.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String role,
                               Model model) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(userService.encodePassword(password));
        user.setRole(role);
        userService.saveUser(user);
        return "redirect:/login";
    }
}
