package com.javaee.springjpamysql.api.v1.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.javaee.springjpamysql.domain.FuelType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDTO {

	private Long id;
	
	@NotBlank
	private String name;
	
	@Min(1970)
	@Max(9999)
	private Integer year;
	
	private FuelType fuelType;
}
