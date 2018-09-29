package example.controller;

import example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public String allUser(){
        return userService.findAllUsers();
    }

}
