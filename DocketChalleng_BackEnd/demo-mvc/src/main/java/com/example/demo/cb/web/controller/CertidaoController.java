package com.example.demo.cb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.cb.domain.Certidao;
import com.example.demo.cb.service.CertidaoServiceImpl;
import com.example.demo.cb.service.RelacCartCertService;

@Controller
@RequestMapping("/certidaos")
public class CertidaoController {
	
	@Autowired
	private CertidaoServiceImpl service;
	@Autowired
	private RelacCartCertService relacserice;
	
	@GetMapping("/cadastrar")
	public String Cadastrar(Certidao certidao) {
		return "/certidao/cadastro";
	}
	@GetMapping("/listar")
	public String Lista(ModelMap model) {
		model.addAttribute("certidoes",service.buscarTodos());
		return "/certidao/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Certidao certidao) {
		service.salvar(certidao);
		return"redirect:/certidaos/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id,ModelMap model) {
		model.addAttribute("certidao", service.buscarporId(id));
		return "/certidao/cadastro";		
	}
	
	@PostMapping("/editar")
	public String editar(Certidao certidao) {
		service.editar(certidao);
		return"redirect:/certidaos/cadastrar";
	}
	
	@GetMapping ("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		if (!relacserice.certidaoTemVinculo(id)) {
			service.excluir(id);
		}
		return"redirect:/certidaos/listar";
	}
	

}	