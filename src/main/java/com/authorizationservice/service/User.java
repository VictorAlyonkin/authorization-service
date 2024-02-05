package com.authorizationservice.service;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    @NotBlank
//    @Min(value = 1)
//    @Max(10)
    private String user;

    @NotBlank
    private String password;
}
