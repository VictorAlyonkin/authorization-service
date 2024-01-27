package com.authorizationservice.repository;

import com.authorizationservice.service.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public List<Authorities> getUserAuthorities(User user) {
        if (USER.equals(user.getUser()) && PASSWORD.equals(user.getPassword()))
            return List.of(Authorities.values());
        return null;
    }
}
