package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService pservice;
	
	@GetMapping("/getallprod")
	public List<Product> getAll()
	{
		return pservice.getall();
	}
}