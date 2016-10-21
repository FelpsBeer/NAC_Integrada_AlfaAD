/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see AdvogadoBO
 */

package br.com.fiap.beans;

import java.util.List;

public class Advogado extends Pessoa{

	private String numeroOAB;
	private String cpf;
	private String rg;
	private String email;
	private String senha;
	private TipoCausa especialidade;
	
	public Advogado() {}

	public Advogado(int codigo, String nome, List<Endereco> endereco, List<Telefone> telefone, String numeroOAB,
			String cpf, String rg, String email, String senha, TipoCausa especialidade) {
		super(codigo, nome, endereco, telefone);
		this.numeroOAB = numeroOAB;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.senha = senha;
		this.especialidade = especialidade;
	}



	public String getNumeroOAB() {
		return numeroOAB;
	}



	public void setNumeroOAB(String numeroOAB) {
		this.numeroOAB = numeroOAB;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
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



	public TipoCausa getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(TipoCausa especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
