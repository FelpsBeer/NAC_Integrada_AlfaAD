/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see LancamentoHonoriaioDAO.java
 */

package br.com.fiap.bo;

import java.sql.Connection;

import br.com.fiap.beans.LancamentoHonorario;
import br.com.fiap.dao.LancamentoHonorarioDAO;
import br.com.fiap.excecao.Excecao;

public abstract class LancamentoHonoriaioBO {
	
		public static void gravar(LancamentoHonorario lh, Connection conexao) throws Exception{
			if(lh.getDataHonorario().length() < 10){
				throw new Excecao("Data Inválida");
			}
			
			if(lh.getQtdeHora() <= 0){
				throw new Excecao("Quantidade de Horas Inválidas");
			}
		
		new LancamentoHonorarioDAO().gravar(lh, conexao);		
	}		
}