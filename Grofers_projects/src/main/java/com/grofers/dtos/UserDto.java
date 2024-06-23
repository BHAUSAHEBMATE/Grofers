package com.grofers.dtos;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.grofers.pojos.UserRole;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class UserDto {

	private Integer userId;

	@NotEmpty
	@Size(min = 4, message = "Name cannot be empty or must be min of 4 characters.")
	private String name;

	@NotEmpty(message = "Email address cannot be empty or is not valid.")
	@Email
	private String email;

	@NotEmpty
	@Size(min = 3, max = 20, message = "Password cannot be empty or must be between 3 to 20 characters.")
	private String password;

	private UserRole role;
	
	private Set<OrderDto> orders = new HashSet<>();// to avoid duplication of order.

	@JsonProperty // Instruction to de-serialize password.
	public void setPassword(String password) {
		this.password = password;
	}

	// As we don't want to send the user password to the frontend.
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public Set<OrderDto> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderDto> orders) {
		this.orders = orders;
	}
	
	
}