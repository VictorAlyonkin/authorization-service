package com.authorizationservice.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("user".equals(user) && "password".equals(password))
            return List.of(Authorities.values());
        return null;
    }
}
