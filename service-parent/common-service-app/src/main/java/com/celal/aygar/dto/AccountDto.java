package com.celal.aygar.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	private Long  id ;

    private String username;

    private String name;

    private String surname;

    private String email;

    private Date birthDate;
    
    private int status;
    
    public String getFullName() {
    	return this.name+" "+this.surname;
    }
}
