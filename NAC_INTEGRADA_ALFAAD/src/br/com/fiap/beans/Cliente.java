/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see ClienteBO
 */

package br.com.fiap.beans;

import java.util.List;

public class Cliente extends Pessoa {

	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String email;
	private String senha;
	
	
	public Cliente() {}
	
	
	public Cliente(int codigo, String nome, List<Endereco> endereco, List<Telefone> telefone, String razaoSocial,
			String cnpj, String inscricaoEstadual, String email, String senha) {
		super(codigo, nome, endereco, telefone);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.email = email;
		this.senha = senha;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
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
	
	
	
}
