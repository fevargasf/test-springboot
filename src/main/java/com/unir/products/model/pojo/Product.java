package com.unir.products.model.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {


	@Id
	private Integer productoid;


	@Column(name = "categoriaid")
	private Integer categoriaid;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "preciounit")
	private Double preciounit;

	@Column(name = "stock")
	private Integer stock;

	@Column(name = "visible")
	private Boolean visible;

}
