package com.unir.products.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

	private Integer productoid;
	private String nombre;
	private String categoriaid;
	private String descripcion;
	private Double preciounit;
    private Integer stock;
	private Boolean visible;
}
