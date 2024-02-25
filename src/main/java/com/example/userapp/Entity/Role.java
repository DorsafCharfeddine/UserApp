package com.example.userapp.Entity;
import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "roles", schema = "public")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private ERole name;

    public Role() {

    }

    public Role(ERole name) {
        this.name = name;
    }

    // getters and setters
}