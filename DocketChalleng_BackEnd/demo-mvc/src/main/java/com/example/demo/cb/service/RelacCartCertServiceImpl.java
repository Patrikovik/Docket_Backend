package com.example.demo.cb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.cb.dao.RelacCartCertDaoImpl;
import com.example.demo.cb.domain.RelacCartCert;
@Service @Transactional(readOnly = false)
public class RelacCartCertServiceImpl implements RelacCartCertService {
	
	@Autowired
	private RelacCartCertDaoImpl dao;
	
	
	
	

	@Override
	public void salvar(RelacCartCert relaccc) {
		dao.save(relaccc);
		
	}

	@Override
	public void editar(RelacCartCert relaccc) {
		dao.update(relaccc);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public RelacCartCert buscarporId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<RelacCartCert> buscarTodos() {
		return dao.findAll();
	}

	
	public boolean certidaoTemVinculo(Long id) { //Verifica se existe vínculo com algum cartório
		if(buscarporId(id)== null) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean cartidaoTemVinculo(Long id) { //Verifica se existe vínculo com alguma certidao
		if(buscarporId(id)== null) {
			return false;
		}
		
		return true;
	}
	
	

}
