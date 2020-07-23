package org.account.service.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.account.service.model.Account;

import lombok.AllArgsConstructor;
import lombok.Data; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto implements Serializable {
	@Setter 
	private Long  id ;

    private String username;

    private String name;

    private String surname;

    private String email;

    private Date birthDate;
    
    private int status;
    
}
