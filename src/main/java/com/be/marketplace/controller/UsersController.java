package com.be.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.be.marketplace.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
    
    @Autowired
    private UsersService usersService;

    @GetMapping()
    public ResponseEntity<?> getListUser(){
        return ResponseEntity.ok().body(usersService.getListUser());
    }
}
