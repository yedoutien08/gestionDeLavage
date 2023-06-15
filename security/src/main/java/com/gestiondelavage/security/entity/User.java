package com.gestiondelavage.security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "USERS")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id", nullable = false )
    private Long id;

    @Column(name = "FULLNAME" , nullable = false)
    private String fullname;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "ADDRESS" )
    private String address;

    @Column(name = "PHONENUMBER", nullable = false)
    private String phonenumber;
    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "PASSWORD" , nullable = false)
    private String password;

    @Column(name = "ROLE")
    private String role;


}
