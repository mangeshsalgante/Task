package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@PostMapping(value = "/add")
	public ResponseEntity<Product> m1(@RequestBody Product p)
	{
		ResponseEntity<Product> re=null;
		
		Product p1=ps.addProduct(p);
		if(p1!=null)
		{
			re=new ResponseEntity<Product>(p1,HttpStatus.ACCEPTED);
		}
		else
		{
			re=new ResponseEntity<Product>(p1,HttpStatus.BAD_REQUEST);
		}
		return re;
		
	}
	
	@DeleteMapping(value = "/deleteById/{id}")
	public ResponseEntity<Integer> m2(@PathVariable("id")int pid)
	{
		ResponseEntity<Integer> re=null;
		
		int check= ps.deleteProduct(pid);
		if(check!=0)
		{
			re=new ResponseEntity<Integer>(check,HttpStatus.ACCEPTED);
		}
		else
		{
			re=new ResponseEntity<Integer>(check,HttpStatus.BAD_REQUEST);
		}
		return re;
	}
	
	@GetMapping(value = "/displayByPid/{id}")
	public ResponseEntity<Product> m3(@PathVariable("id")int pid)
	{
		ResponseEntity<Product> re=null;
		
		Product p1=ps.displayProductByPid(pid );
		if(p1!=null)
		{
			re=new ResponseEntity<Product>(p1,HttpStatus.ACCEPTED);
		}
		else
		{
			re=new ResponseEntity<Product>(p1,HttpStatus.BAD_REQUEST);
		}
		return re;
		
	}
	@GetMapping(value = "/displayByPname/{name}")
	public ResponseEntity<List<Product>> m3(@PathVariable("name")String pname)
	{
		ResponseEntity<List<Product>> re=null;
		
		List<Product> list=ps.displayProductByPname(pname);
		if(list.size()!=0)
		{
			re=new ResponseEntity<List<Product>>(list,HttpStatus.ACCEPTED);
		}
		else
		{
			re=new ResponseEntity<List<Product>>(list,HttpStatus.BAD_REQUEST);
		}
		return re;
		
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Product> m4(@RequestBody Product p)
	{
		ResponseEntity<Product> re=null;
		
		Product p1=ps.addProduct(p);
		if(p1!=null)
		{
			re=new ResponseEntity<Product>(p1,HttpStatus.ACCEPTED);
		}
		else
		{
			re=new ResponseEntity<Product>(p1,HttpStatus.BAD_REQUEST);
		}
		return re;
		
	}
}
