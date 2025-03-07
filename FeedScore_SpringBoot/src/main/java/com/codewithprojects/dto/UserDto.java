package com.codewithprojects.dto;

import com.codewithprojects.enums.UserRole;

import lombok.Data;

@Data
public class UserDto {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String mobile;
	
	private String password;
	
	private UserRole userRole;
}
