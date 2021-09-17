package com.iftm.models.embedded;

import org.springframework.data.annotation.Id;

import com.iftm.models.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
	
	@Id
	private String id; 
	private String name;
	
	public Author(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
}
