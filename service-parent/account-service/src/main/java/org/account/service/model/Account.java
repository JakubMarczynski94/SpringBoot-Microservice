package org.account.service.model;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Entity
@Table(name  = "accounts")
public class Account implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;

    @Setter
    @Column(name  = "uname")
    private String username;

    @Setter
    @Column(name  = "name")
    private String name;

    @Setter
    @Column(name  = "surname")
    private String surname;

    @Setter
    @Column(name  = "email")
    private String email;

    @Setter
    @Column(name  = "birth_date")
    private Date birthDate;

    @Setter
    @Column(name  = "pwd")
    private String password;

    @Column(name  = "created_at")
    private Date createdAt;

    @Column(name  = "is_active")
    private Boolean active;
	
}
