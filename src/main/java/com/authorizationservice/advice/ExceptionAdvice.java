package com.authorizationservice.advice;

import com.authorizationservice.exception.InvalidCredentials;
import com.authorizationservice.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public ResponseEntity<String> icHandler(InvalidCredentials invalidCredentials) {
        return new ResponseEntity<>(invalidCredentials.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<String> uuHandler(UnauthorizedUser unauthorizedUser) {
        return new ResponseEntity<>(unauthorizedUser.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
