package com.example.tcc.cadastro;

public class Cadastro {
	
	//Informações do cadastro
	private String nome;
	private String cpf;
	private String endereco;
	private int numero;
	private String sexo;
	private String idade;
	private String telefone;
	private String email;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", numero=" + numero + ", sexo="
				+ sexo + ", idade=" + idade + ", telefone=" + telefone + ", email=" + email + ", senha=" + senha
				+ ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getEndereco()=" + getEndereco()
				+ ", getNumero()=" + getNumero() + ", getSexo()=" + getSexo() + ", getIdade()=" + getIdade()
				+ ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
