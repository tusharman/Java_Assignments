package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Product;

public interface ProductServiceInterface {

	public String addProduct(Product product) throws SQLException ;
	List<Product> getAllProducts() throws SQLException;
	Product getProductById(int productId) throws SQLException;
	public String deleteProduct(int productId) throws SQLException;
}
