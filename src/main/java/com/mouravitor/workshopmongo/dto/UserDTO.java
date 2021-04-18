package com.mouravitor.workshopmongo.dto;

import com.mouravitor.workshopmongo.domain.User;

public class UserDTO {
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
		
		
	}
	
	public UserDTO(User obj) {
		
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
		
	}

}
