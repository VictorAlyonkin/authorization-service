package com.authorizationservice.service;

import com.authorizationservice.exception.UnauthorizedUser;
import com.authorizationservice.repository.Authorities;
import com.authorizationservice.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorizationService {

    private final UserRepository userRepository;

    public List<Authorities> getAuthorities(@Valid User user) {
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
