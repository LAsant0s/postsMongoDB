package com.iftm.models.dto;

import com.iftm.models.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO(User entity) {
		this.id = entity.getId();	
		this.name = entity.getName();
		this.email = entity.getEmail();
	}
}
