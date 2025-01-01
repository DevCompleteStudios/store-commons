package com.devstudios.store.app.commons.entities.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity(name = "roles")
public class Role {

    @Id
    private Long id;
    private String role;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
