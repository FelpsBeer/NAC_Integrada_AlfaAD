 /**
* 
* @author Felipe Moita Vieira 
* @author João Miguel Souza Martins
* @author Marcelo Pereira Marco Peres
* 
* @see    		   HoraAdvogado
*/

package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.beans.HoraAdvogado;

public class HoraAdvogadoDAO {
	
	/**
	 * Método que <b>adiciona</b> uma tupla na tabela
	 * T_AAD_HORA_ADVOGADO
	 * @param ha
	 * @param conexao
	 * @throws Exception
	 */
	
public void gravar(HoraAdvogado ha, Connection conexao) throws Exception{
		
		PreparedStatement estrutura = conexao.prepareStatement("insert into T_AAD_HORA_ADVOGADO "
				+ "(CD_ADVOGADO, CD_HIST_HORA, DT_VIGENCIA, VL_HORA) "
				+ "values (?,?,?,?)");
		
		
		estrutura.setLong(1, ha.getAdvogado().getCodigo());
		estrutura.setInt(2, ha.getCodigoHistorico());
		estrutura.setString(3, ha.getDataVigencia());
		estrutura.setDouble(4, ha.getValorHora());
		estrutura.execute();
		estrutura.close();
		
		System.out.println("Gravado");
		
	}

}
