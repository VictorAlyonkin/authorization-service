package com.authorizationservice.controller;

import com.authorizationservice.repository.Authorities;
import com.authorizationservice.service.AuthorizationService;
import com.authorizationservice.service.User;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorizationController {

    private final AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user);
    }
}
