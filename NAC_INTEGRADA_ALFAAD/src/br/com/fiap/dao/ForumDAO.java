 /**
* 
* @author Felipe Moita Vieira 
* @author João Miguel Souza Martins
* @author Marcelo Pereira Marco Peres
* 
* @see    		   Forum
*/

package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.beans.Forum;

public class ForumDAO extends PessoaDAO{
	
	/**
	 * Método que <b>adiciona</b> uma tupla nas tabelas
	 * T_AAD_PESSOA
	 * T_AAD_FORUM
	 * @param f um objeto do tipo Forum
	 * @param conexao um objeto do tipo Connection
	 * @throws Exception
	 */

	public void gravar (Forum f, Connection conexao ) throws Exception{
		 
    	PreparedStatement strt = conexao.prepareStatement("insert into T_AAD_PESSOA "
				+ "(CD_PESSOA, NM_NOME) "
				+ "values (SQ_AM_PESSOA.nextval,?)");
    	
    	strt.setString(1, f.getNome());
    	strt.execute();
    	strt.close();
    	
        PreparedStatement estrutura = conexao.prepareStatement("insert into T_AAD_FORUM "
        		+ "(DS_FORUM,CD_FORUM) "
        		+ "values (?,SQ_AM_PESSOA.currval)");
 	
        estrutura.setString(1, f.getDescricao());
        estrutura.execute();
        estrutura.close();
 
       System.out.println("Gravado");
 
    }
	
}
