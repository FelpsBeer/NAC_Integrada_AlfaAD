/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see AdvogadoDAO.java
 */

package br.com.fiap.bo;

import java.sql.Connection;

import br.com.fiap.beans.Advogado;
import br.com.fiap.dao.AdvogadoDAO;

public class AdvogadoBO extends PessoaBO{
	
	/**
	 * Método que <b>adiciona</b> uma tupla nas tabelas
     * T_AAD_PESSOA. 
 	 * T_AAD_ADVOGADO.
 	 * T_AAD_ESPECIALIDADE.
	 * @param a Um objeto do tipo Advogado
	 * @param conexao Um objeto do tipo Connection
	 * @return Um mensagem do tipo String
	 * @throws Exception
	 */
	
	public static String gravar(Advogado a, Connection conexao ) throws Exception{
	
		new AdvogadoDAO().gravar(a, conexao);
		return "Gravado com sucesso no BO";
	}

}
