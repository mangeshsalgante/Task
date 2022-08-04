package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Product;
import com.demo.repository.ProductRepositpry;

@Service
@Transactional
public class ProductService {

	@Autowired
	private  ProductRepositpry pr;
	
	public Product addProduct(Product p)
	{
		return pr.save(p);
	}
	
	public int deleteProduct(int pid)
	{
		return pr.deleteByPid(pid);
	}
	
	public Product displayProductByPid(int pid)
	{
		return pr.findByPid(pid);
	}
	public List<Product> displayProductByPname(String pname)
	{
		return pr.findByPnameContains(pname);
	}
	
	
}
