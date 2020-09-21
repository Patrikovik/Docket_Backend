package com.example.demo.cb.dao;

import java.util.List;

import com.example.demo.cb.domain.RelacCartCert;

public interface RelacCarCertInter {
	
	void save(RelacCartCert relaccartcert);
	
	void update(RelacCartCert relaccartcert);
	
	void delete(Long id);
	
	RelacCartCert findById(Long id);
	
	List<RelacCartCert> findAll();	

}
