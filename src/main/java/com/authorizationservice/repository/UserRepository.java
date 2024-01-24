package com.authorizationservice.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private static final String USER = "user";
    private static final String PASSWORD = "password";


    public List<Authorities> getUserAuthorities(String user, String password) {
        if (USER.equals(user) && PASSWORD.equals(password))
            return List.of(Authorities.values());
        return null;
    }
}
