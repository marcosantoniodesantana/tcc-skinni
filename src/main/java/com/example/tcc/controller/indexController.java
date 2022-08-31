package com.example.tcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login.html";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "cadastro.html";
	}
	
	@RequestMapping("/feminino")
	public String feminino() {
		return "feminino.html";
	}
	
	@RequestMapping("/masculino")
	public String masculino() {
		return "masculino.html";
	}
	
	@RequestMapping("/infantil")
	public String infantil() {
		return "infantil.html";
	}
	
	@RequestMapping("/moletons")
	public String moletons() {
		return "moletons.html";
	}
	
	@RequestMapping("/acessorios")
	public String acessorios() {
		return "acessorios.html";
	}

	@RequestMapping("/quadros")
	public String quadros() {
		return "quadros.html";
	}

	@RequestMapping("/camisetas")
	public String camisetas() {
		return "camisetas.html";
	}
	
	@RequestMapping("*")
	public String error() {
		return "error.html";
	}
	
}
