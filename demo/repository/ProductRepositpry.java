package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductRepositpry extends JpaRepository<Product, Integer> {
	int deleteByPid(int pid);
	Product findByPid(int pid);
	List<Product> findByPnameContains(String pname);
	
	
	
}
