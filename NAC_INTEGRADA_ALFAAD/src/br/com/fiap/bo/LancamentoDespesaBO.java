/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see LancamentoDespesaDAO.java
 */

package br.com.fiap.bo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LancamentoDespesa;
import br.com.fiap.dao.LancamentoDespesaDAO;
import br.com.fiap.excecao.Excecao;

public abstract class LancamentoDespesaBO {
	
	/**
	 * Método que <b>adiciona</b> uma tupla na tabela
	 * T_AAD_LANCA_DESPESA
	 * @param ld Um objeto do tipo LancamentoDespesa
	 * @param conexao Um objeto do tipo Connection
	 * @throws Exception
	 */

	public static void gravar(LancamentoDespesa ld, Connection conexao) throws Exception{
		if(ld.getDataDespesa().length() < 10){
			throw new Excecao("Data Inválida");
		}
		if(ld.getValorDespesa() <= 0){
			throw new Excecao("Valor da Despesa Inválido");
		}		
		new LancamentoDespesaDAO().gravar(ld, conexao);
	
	}// fecha gravar
	
	 /**
	  * 
	 * Método que <b>apaga</b> uma tupla nas tabelas
	 * T_AAD_LANCA_DESPESA
	 * @param pCodigoDespesa Um parametro do tipo int
	 * @param conexao Um objeto do tipo Conexao
	 * @throws Exception
	 */
	
	public static void deletar(int pCodigoDespesa, Connection conexao) throws Exception{
		new LancamentoDespesaDAO().deletar(pCodigoDespesa, conexao);
	}
	
	 /**
	  * 
	 * Método que <b>atualiza</b> uma tupla na tabela
	 * T_AAD_LANCA_DESPESA
	 * @param ld Um objeto do tipo LancamentoDespesa
	 * @param conexao Um objeto do tipo Connection
	 * @throws Exception
	 */
	
	public static void atualizar(LancamentoDespesa ld, Connection conexao) throws Exception{
		new LancamentoDespesaDAO().atualizar(ld, conexao);
	}
	
	/**
	 * Método que <b>recupera uma lista de despesas</b> na tabela
	 * T_AAD_LANCA_DESPESA 
	 * @param conexao Um objeto do tipo Connection
	 * @return List<LancamentoDespesa>
	 * @throws Exception
	 */
	public static List<LancamentoDespesa> getLista(Connection conexao) throws Exception{
		List<LancamentoDespesa> lstDespesa = new ArrayList<LancamentoDespesa>();		
		return new LancamentoDespesaDAO().getLista(conexao) ;
		
	}
	
}
