package com.unir.products.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unir.products.model.pojo.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findAllByDescripcion(String descripcion);
}
