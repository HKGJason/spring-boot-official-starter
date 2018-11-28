package com.oocl.web.sampleWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.logging.Logger;

@RestController
public class Controller {
    UserService userService;
    private final Logger log = Logger.getLogger(this.getClass().getName());
    @Autowired
    public Controller(UserService userService){
        this.userService= userService;
    }
    @PostMapping(value = "/users", produces = "application/json")
    public ResponseEntity<String> addNewUser(@RequestBody User user)
    {
        userService.addNewUser(user);
        URI location = URI.create("/users/"+userService.getUserID(user));
        return ResponseEntity.created(location).header("UserCreated").body("");
    }

}
