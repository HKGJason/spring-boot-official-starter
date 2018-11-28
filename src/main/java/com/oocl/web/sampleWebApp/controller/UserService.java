package com.oocl.web.sampleWebApp.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users= new ArrayList<>();

    public UserService(){}
    public UserService(List<User> user)
    {
        this.users = user;
    }
    public void addNewUser(User user){
        this.users.add(user);
    }
    public int getUserID(User user){
        int id = 0;
        for (User u: users){
            if (u.equals(user)){
               id = users.indexOf(u);
               break;
            }

        }
        return id + 1;
    }
}
