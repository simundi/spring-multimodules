package com.simundi.multimodules.api.controllers;

import com.simundi.multimodules.business.UserService;
import com.simundi.multimodules.repositories.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public Collection<User> getAllusers() {
        return userService.getAll();
    }

}


