package com.oocl.web.sampleWebApp.controller;

public class User {
    private String id;
    private String username;
    public User(){}
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id= id;
    }
    public User(String id, String name){
        this.username = name;
        this.id = id;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String name){
        this.username = name;
    }
}
