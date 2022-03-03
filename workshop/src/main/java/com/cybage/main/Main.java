package com.cybage.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.cybage.dao.ProductDaoImplementation;
import com.cybage.model.Product;
import com.cybage.service.ProductServiceImplementation;

public class Main {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductServiceImplementation service = new ProductServiceImplementation();
		ProductDaoImplementation dao = new ProductDaoImplementation();
		Scanner sc =new Scanner(System.in);
		
		try(sc) {
			
			boolean flag=true;
			
			while(true)
			{
				System.out.println("1. Add product");
				System.out.println("2. Get product by Id");
				System.out.println("3. Get all product");
				System.out.println("4. Delete product");
				
				try {
					
					switch(sc.nextInt())
					{
					case 1 :
						System.out.println("Enter product Id Name price : ");
						Product product= new Product(sc.nextInt(), sc.next(), sc.nextInt());
						 dao.addProduct(product);
						 if(product!=null)
						 {
							 System.out.println("Product added with id : "+product.getId());
						 }
						break;
					case 2:
						System.out.println("Enter product id : ");
						Product productById = dao.getProductById(sc.nextInt());
						System.out.println(productById);
						
						break;
					case 3 :
						List<Product> allProducts = dao.getAllProducts();
						System.out.println(allProducts);
						break;
						
					case 4 :
						System.out.println("Enter id to delete product :");
						String deleteProduct = dao.deleteProduct(sc.nextInt());
						System.out.println(deleteProduct);
						break;
					default :
						System.out.println("Invalid option");
						
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
