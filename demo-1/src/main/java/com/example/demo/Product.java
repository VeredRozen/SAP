package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sun.istack.NotNull;


@Table(name="Products")
@Entity
public class Product {
	@Id
	public int _id;
	public String _name;
	@NotNull
	public int _productId;
}
