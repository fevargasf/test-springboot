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
	private String proveedorid;
	private String categoriaid;
	private String descripcion;
	private Float preciounit;
    private Integer stock;
}
