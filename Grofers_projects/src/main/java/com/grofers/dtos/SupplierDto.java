
package com.grofers.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDto {
	
	private Integer supplierId;

	@NotEmpty(message = "Supplier name cannot be empty.")
	private String name;

	@NotEmpty(message = "Supplier email cannot be empty.")
	private String email;
	
	
	
	public SupplierDto() {
		// TODO Auto-generated constructor stub
	}



	public Integer getSupplierId() {
		return supplierId;
	}



	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
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
}
