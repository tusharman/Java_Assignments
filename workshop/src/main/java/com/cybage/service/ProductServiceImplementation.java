package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.ProductDaoImplementation;
import com.cybage.model.Product;

public class ProductServiceImplementation implements ProductServiceInterface {

	private ProductDaoImplementation productDao;
	@Override
	public String addProduct(Product product) throws SQLException {
		productDao.addProduct(product);
		return "product added successfully";
	}

	@Override
	public List<Product> getAllProducts() throws SQLException {
		return productDao.getAllProducts();
	}

	@Override
	public Product getProductById(int productId) throws SQLException {
		
		return productDao.getProductById(productId);
	}

	@Override
	public String deleteProduct(int productId) throws SQLException {
		
		return productDao.deleteProduct(productId);
	}

}
