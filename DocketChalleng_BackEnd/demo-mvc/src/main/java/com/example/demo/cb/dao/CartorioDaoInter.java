package com.example.demo.cb.dao;

import java.util.List;

import com.example.demo.cb.domain.Cartorio;

public interface CartorioDaoInter {
	
	void save(Cartorio cartorio);
	
	void update(Cartorio cartorio);
	
	void delete(Long id);
	
	Cartorio findById(Long id);
	
	List<Cartorio> findAll();	

}
