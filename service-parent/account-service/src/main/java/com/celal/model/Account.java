package com.celal.model;

import java.util.Date;

import lombok.Data;


import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name  = "accounts")
public class Account implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;

    @Column(name  = "uname")
    private String username;

    @Column(name  = "name")
    private String name;

    @Column(name  = "surname")
    private String surname;

    @Column(name  = "email")
    private String email;

    @Column(name  = "birth_date")
    private Date birthDate;

    @Column(name  = "pwd")
    private String password;

    @Column(name  = "created_at")
    private Date createdAt;

    @Column(name  = "status")
    private int status;
    
    @Column(name  = "is_active")
    private Boolean active;
	
}
