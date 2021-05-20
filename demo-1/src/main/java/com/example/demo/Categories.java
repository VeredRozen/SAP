package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Categories")
@Entity
public class Categories {
	@Id
	public int _id;
	public String _name;
	public int _productId;
}
