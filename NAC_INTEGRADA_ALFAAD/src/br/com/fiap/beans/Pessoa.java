/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see PessoaBO
 */

package br.com.fiap.beans;

import java.util.List;

public abstract class Pessoa {

	private long codigo;
	private String nome;
	private List <Endereco> endereco;
	private List <Telefone> telefone;
	
	public Pessoa(long codigo, String nome, List<Endereco> endereco, List<Telefone> telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Pessoa() {}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
	
	
	
}
