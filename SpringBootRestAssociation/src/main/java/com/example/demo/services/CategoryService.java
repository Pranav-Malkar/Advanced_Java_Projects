package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository crepo;
	
	public List<Category> getall()
	{
		return crepo.findAll();
	}
	
	public  Category getcat(int cid)
	{
		Optional<Category> op= crepo.findById(cid);
		Category c= null;
		try {
			c=op.get();
			
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		return c;
	}
	
	
	public Category savecat(Category cat)
	{
		return crepo.save(cat);
	}
	
}