package net.proselyte.springsecuritydemo.security;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;

@Getter
public class JwtAuthentificationException extends AuthenticationException {

    private HttpStatus httpStatus;


    public JwtAuthentificationException(String msg) {
        super(msg);
    }


    public JwtAuthentificationException(String msg, HttpStatus httpStatus) {
        super(msg);
        this.httpStatus = httpStatus;
    }
}