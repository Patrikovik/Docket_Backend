package com.example.demo.cb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.cb.domain.Certidao;
import com.example.demo.cb.domain.RelacCartCert;
import com.example.demo.cb.service.CertidaoServiceImpl;
import com.example.demo.cb.service.RelacCartCertService;

@Controller
@RequestMapping("relations")
public class RelacCartCertController {

	@Autowired
	private RelacCartCertService relacservice;
	
	@Autowired
	private CertidaoServiceImpl certservice;
	
	@GetMapping("/cadastrar")
	public String cadastrar(RelacCartCert relac) {
		return "/RelacCartCert/cadastro";
	}
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("relacaocartcerts", relacservice.buscarTodos());
		return "/RelacCartCert/lista";
	}
//	@PostMapping("/salvar")
//	public String salvar(Certidao relaccc) {
//		relacservice.salvar(relaccc);
//		return"";		
//	}
	
	@ModelAttribute("certidao")
	public List<Certidao> listaDeCertidao(){
		return certservice.buscarTodos();
	}
	
	
	
	
}
