package com.example.demo;

@org.springframework.stereotype.Controller
public class Controller {

	public String GetProduct() {
		return "";
	}
	
	public void GetProductByID(int productId) {
		
	}
	
	public void AddProduct(Product p) {
		
	}
	
	public void RemoveProduct(int productId) {
		
	}
	
	public void ChangeDetails(Product p) {
		RemoveProduct(p._id);
		AddProduct(p);
	}
}
