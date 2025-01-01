package com.devstudios.store.app.commons.entities.users;

import java.util.List;

import jakarta.persistence.Entity;




@Entity
public class User {
    private Long id;

    private String email;
    private String password;

    private List<Role> roles;



}

