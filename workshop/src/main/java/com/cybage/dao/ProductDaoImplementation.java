package com.cybage.dao;

import static com.cybage.Utils.ConnectionDB.fetchDBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;

public class ProductDaoImplementation implements ProductDaoInterface {
    private Connection connection;
    private PreparedStatement pst1,pst2,pst3,pst4;
    
    public ProductDaoImplementation() throws ClassNotFoundException, SQLException {
		connection=fetchDBConnection();
		pst1=connection.prepareStatement("select * from products");
		pst2=connection.prepareStatement("select * from products where id=?");
		pst3=connection.prepareStatement("insert into products values (?,?,?)");
		pst4=connection.prepareStatement("delete from products where id=?");
	}
    
	public String addProduct(Product product) throws SQLException {
		pst3.setInt(1, product.getId());
		pst3.setString(2, product.getName());
		pst3.setInt(3, product.getPrice());
      
		int updateCount=pst3.executeUpdate();
		if(updateCount==1)
		return "Product inserted successfuly";
		return "Failed to insert Product";
		
	}

	public List<Product> getAllProducts() throws SQLException {
		List<Product> products=new ArrayList<Product>();
		
		
		try(ResultSet rst=pst1.executeQuery()){
			while(rst.next())
				products.add(new Product(rst.getInt(1),rst.getString(2),rst.getInt(3)));
		}
		return products;
	}


	public Product getProductById(int productId) throws SQLException {
         //Product product = new Product();
		
		pst2.setInt(1, productId);
		try(ResultSet rst=pst2.executeQuery()){
			while(rst.next())
				return new Product(rst.getInt(1),rst.getString(2), rst.getInt(3));
		}
		return null;
		
	}

	public String deleteProduct(int productId) throws SQLException {
		pst4.setInt(1, productId);
		int updateCount=pst4.executeUpdate();
		if(updateCount==1)
		return "Product Deleted successfuly";
		return "Failed to Delete Product";

	}

}
