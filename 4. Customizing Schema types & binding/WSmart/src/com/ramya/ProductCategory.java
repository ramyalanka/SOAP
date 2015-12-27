package com.ramya;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ramya.service.ProductServiceImpl;

@WebService(serviceName="WSMartService", name="WSMart", portName="WSMartPort", targetNamespace="www.wsmart.com" )
public class ProductCategory {
	ProductServiceImpl productServiceImpl = new ProductServiceImpl(); 
	
	@WebMethod(action="WSMartGetCategoriesAction", operationName="getWSMartCategories")
	public List<String> getProductCategories() {
		return productServiceImpl.getProductCategories();
	}
	
	@WebMethod(exclude=true)
	public List<String> getProductsByCategory(String category) {
		return productServiceImpl.getProductByCategory(category);
	}
	
	@WebMethod(exclude=true)
	public boolean addProductsByCategory(String category, String product) {
		return productServiceImpl.addProductToCategory(category, product);
	}
}