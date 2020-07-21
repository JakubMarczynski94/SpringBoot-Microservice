package org.account.service.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.account.service.model.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
public class AccountDto implements Serializable {
	@Setter 
	private Long  id ;

    @Setter 
    private String username;

    @Setter 
    private String name;

    @Setter 
    private String surname;

    @Setter 
    private String email;

    @Setter 
    private Date birthDate;

    @Setter 
    private String password;
 
    private Date createdAt;
 
    private Boolean active;
}
