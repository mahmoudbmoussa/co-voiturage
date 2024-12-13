package com.example.projet_jee_covoiturage.Controller;

import com.example.projet_jee_covoiturage.Service.UserService;

public class UserController {

    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }


}
