package com.delivery.app.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RestauranteInputDTO {
	
	@NotBlank
	private String nome;
	
	@NotNull
	@DecimalMin(value = "0.00", inclusive = false)
	@Digits(integer = 15, fraction = 2)
	private BigDecimal taxaFrete;	

}
