package net.proselyte.springsecuritydemo.rest;

import lombok.Data;

@Data
public class AuthentificationRequestDTO {
    private String email;
    private String password;

}
