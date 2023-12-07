package com.be.marketplace.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    private Integer userId;

    private String username;

    private String email;
}
