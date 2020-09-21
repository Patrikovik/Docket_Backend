package com.example.demo.cb.dao;

import java.util.List;


import com.example.demo.cb.domain.Certidao;

public interface CertidaoDaoInter {
	
	void save(Certidao certidao);
	
	void update(Certidao certidao);
	
	void delete(Long id);
	
	Certidao findById(Long id);
	
	List<Certidao> findAll();
	

}
