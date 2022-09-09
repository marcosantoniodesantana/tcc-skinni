package com.example.tcc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tcc.cadastro.Cadastro;
import com.example.tcc.login.Login;

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
	
	@PostMapping("/login/teste")
	public String loginTeste(@ModelAttribute Login user, Model model) {
		model.addAttribute("email", user.getEmail());
		model.addAttribute("senha", user.getSenha());
		return "lTeste";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "cadastro.html";
	}
	
	@GetMapping("/pesquisa")
	public String pesquisa() {
		return "pesquisa.html";
	}
	
	@PostMapping("/mCadastro")
	public String mCadastro(@ModelAttribute Cadastro usuario, Model model) {
		model.addAttribute("nome", "Nome do cliente: " + usuario.getNome());
		model.addAttribute("cpf", "CPF: " + usuario.getCpf());
		model.addAttribute("endereco", "Endereço: " +  usuario.getEndereco());
		model.addAttribute("numero", "Número da rua: " + usuario.getNumero());
		model.addAttribute("sexo", "Sexo: " + usuario.getSexo());
		model.addAttribute("idade", "Data de nascimento: " + usuario.getIdade());
		model.addAttribute("telefone", "Número do celular: " + usuario.getTelefone());
		model.addAttribute("email", "Email: " + usuario.getEmail());
		model.addAttribute("senha", "Senha:" + usuario.getSenha());
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
