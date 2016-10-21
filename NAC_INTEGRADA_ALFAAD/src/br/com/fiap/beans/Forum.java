/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see ForumBO
 */

package br.com.fiap.beans;

import java.util.List;

public class Forum extends Pessoa{

	private String descricao;


	
	

	public Forum(int codigo, String nome, List<Endereco> endereco, List<Telefone> telefone, String descricao) {
		super(codigo, nome, endereco, telefone);
		this.descricao = descricao;
	}



	public Forum() {}



	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
