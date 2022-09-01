package com.example.tcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tcc.cadastro.Cadastro;

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
	
	@PostMapping("/mCadastro")
	public String mCadastro(@ModelAttribute Cadastro usuario, Model model) {
		model.addAttribute("nome", usuario.getNome());
		model.addAttribute("cpf", usuario.getCpf());
		model.addAttribute("endereco", usuario.getEndereco());
		model.addAttribute("numero", usuario.getNumero());
		model.addAttribute("sexo", usuario.getSexo());
		model.addAttribute("idade", usuario.getIdade());
		model.addAttribute("telefone", usuario.getTelefone());
		model.addAttribute("email", usuario.getEmail());
		model.addAttribute("senha", usuario.getSenha());
		return "cad.html";
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
	
	@RequestMapping("/comprar")
	public String comprar() {
		return "pgCompra.html";
	}
	
	@RequestMapping("*")
	public String error() {
		return "error.html";
	}
	
}
