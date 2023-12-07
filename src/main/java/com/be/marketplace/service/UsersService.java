package com.be.marketplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.be.marketplace.dto.UserResponse;
import com.be.marketplace.model.Users;
import com.be.marketplace.repository.UsersRepository;

@Service
public class UsersService {
    
    @Autowired
    private UsersRepository usersRepository;

    public List<UserResponse> getListUser(){
        List<Users> users = usersRepository.findAll();
        List<UserResponse> userResponses = users.stream().map((u) -> {
            return UserResponse.builder()
                    .email(u.getEmail())
                    .userId(u.getUserId())
                    .username(u.getUsername())
                    .build();
        }).toList();

        return userResponses;
    }
}
