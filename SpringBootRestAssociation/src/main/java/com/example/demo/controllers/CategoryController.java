package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CategoryService;
import com.example.demo.entities.*;

@RestController
public class CategoryController {

	@Autowired
	CategoryService cservice;
	
	@GetMapping("/getallcat")
	public List<Category> getall()
	{
		return cservice.getall();
	}
	@GetMapping("/getonecat")
	public  Category getCat(@RequestParam("cid") int catid)
	{
		return cservice.getcat(catid);
	}
	
	@PostMapping("/savecat")
	public Category savecat(@RequestBody Category cat)
	{
		return cservice.savecat(cat);
	}
	
}