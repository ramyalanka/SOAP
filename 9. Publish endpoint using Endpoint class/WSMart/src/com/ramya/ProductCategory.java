package com.ramya;

import java.util.List;

import javax.jws.WebService;

import com.ramya.model.Product;
import com.ramya.service.ProductServiceImpl;

@WebService(endpointInterface="com.ramya.ProductCatalogSEI", serviceName="WSMartService", name="WSMart", portName="WSMartPort",
targetNamespace="www.wsmart.com")
public class ProductCategory implements ProductCatalogSEI {
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProductByCategory(String category) {
		return productService.getProductByCategory(category);
	}
	
	@Override
	public boolean addProductToCategory(String category, String product) {
		return productService.addProductToCategory(category, product);
	}
	
	@Override
	public List<Product> getProducts() {
		return productService.getProducts();
	}
}