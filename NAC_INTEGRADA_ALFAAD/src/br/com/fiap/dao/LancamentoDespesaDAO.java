 /**
* 
* @author Felipe Moita Vieira 
* @author João Miguel Souza Martins
* @author Marcelo Pereira Marco Peres
* 
* @see    		   LancamentoDespesa
*/

package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.LancamentoDespesa;
import br.com.fiap.beans.Processo;
import br.com.fiap.beans.TipoDespesa;

public class LancamentoDespesaDAO {
	
	 /**
	  * 
	 * Método que <b>adiciona</b> uma tupla na tabela
	 * T_AAD_LANCA_DESPESA
	 * @param ld Um objeto do tipo LancamentoDespesa
	 * @param conexao Um objeto do tipo Connection
	 * @throws Exception
	 */

	public void gravar(LancamentoDespesa ld, Connection conexao) throws Exception{
		
		PreparedStatement estrutura = conexao.prepareStatement("insert into T_AAD_LANCA_DESPESA "
				+ "(CD_LANCAMENTO, CD_TIPO_DESPESA,NR_PROCESSO,DT_DESPESA,VL_DESPESA,DS_OBSERVACAO) "
				+ "values (SQ_AM_LANCA_DESPESA.nextval,?,?,?,?,?)");
		
		
		estrutura.setInt(1, ld.getTipoDespesa().getCodigoTipoDespesa());
		estrutura.setLong(2, ld.getProcesso().getNumeroProcesso());
		estrutura.setString(3, ld.getDataDespesa());
		estrutura.setDouble(4, ld.getValorDespesa());
		estrutura.setString(5, ld.getObservacao());
		estrutura.execute();
		estrutura.close();
		
		System.out.println("Gravado");
		
	}
	
	 /**
	  * 
	 * Método que <b>apaga</b> uma tupla nas tabelas
	 * T_AAD_LANCA_DESPESA
	 * @param pCodigoDespesa Um parametro do tipo int
	 * @param conexao Um objeto do tipo Conexao
	 * @throws Exception
	 */
	public void deletar(int pCodigoDespesa, Connection conexao) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement("DELETE FROM T_AAD_LANCA_DESPESA WHERE CD_LANCAMENTO = ?");
		stmt.setInt(1, pCodigoDespesa);
		stmt.execute();
		stmt.close();
		
		System.out.println("Excluído!!");
		
	}
	
	 /**
	  * 
	 * Método que <b>atualiza</b> uma tupla na tabela
	 * T_AAD_LANCA_DESPESA
	 * @param ld Um objeto do tipo LancamentoDespesa
	 * @param conexao Um objeto do tipo Connection
	 * @throws Exception
	 */
	public void atualizar (LancamentoDespesa ld, Connection conexao) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement("UPDATE T_AAD_LANCA_DESPESA SET CD_TIPO_DESPESA = ?,"
				+ "NR_PROCESSO = ?, DT_DESPESA = ?, VL_DESPESA = ?, DS_OBSERVACAO = ? WHERE CD_LANCAMENTO = ?");
		
		stmt.setInt(1, ld.getTipoDespesa().getCodigoTipoDespesa());
		stmt.setLong(2, ld.getProcesso().getNumeroProcesso());
		stmt.setString(3, ld.getDataDespesa());
		stmt.setDouble(4, ld.getValorDespesa());
		stmt.setString(5, ld.getObservacao());
		stmt.setInt(6, ld.getCodigo());
		stmt.execute();
		stmt.close();
		
		
		 System.out.println("Atualizado!");
		
		
	}
	/**
	 * Método que <b>recupera uma lista de despesas</b> na tabela
	 * T_AAD_LANCA_DESPESA 
	 * @param conexao Um objeto do tipo Connection
	 * @return List<LancamentoDespesa>
	 * @throws Exception
	 */
	public List<LancamentoDespesa> getLista(Connection conexao) throws Exception{
		List<LancamentoDespesa> lstDespesa = new ArrayList<LancamentoDespesa>();
		
		PreparedStatement stmt = conexao.prepareStatement("SELECT LD.CD_LANCAMENTO, TD.CD_TIPO_DESPESA, TD.DS_TIPO_DESPESA, P.NR_PROCESSO, "
				+ "P.DS_PROCESSO, LD.DT_DESPESA, LD.VL_DESPESA, LD.DS_OBSERVACAO "
				+ "FROM T_AAD_LANCA_DESPESA LD INNER JOIN T_AAD_PROCESSO P ON (LD.NR_PROCESSO = P.NR_PROCESSO) "
				+ "INNER JOIN T_AAD_TIPO_DESPESA TD ON (LD.CD_TIPO_DESPESA = TD.CD_TIPO_DESPESA)");
		ResultSet resultadoDados = stmt.executeQuery();
		
		while(resultadoDados.next()){
			LancamentoDespesa lancaDespesa = new LancamentoDespesa();
			TipoDespesa tipoDespesa = new TipoDespesa();
			Processo processo = new Processo();
			
			processo.setNumeroProcesso(resultadoDados.getInt("NR_PROCESSO"));
			processo.setDescricaoProcesso(resultadoDados.getString("DS_PROCESSO"));
			
			tipoDespesa.setCodigoTipoDespesa(resultadoDados.getInt("CD_TIPO_DESPESA"));
			tipoDespesa.setDescricaoTipoDespesa(resultadoDados.getString("DS_TIPO_DESPESA"));
			
			lancaDespesa.setCodigo(resultadoDados.getInt("CD_LANCAMENTO"));
			lancaDespesa.setDataDespesa(resultadoDados.getString("DT_DESPESA"));
			lancaDespesa.setObservacao(resultadoDados.getString("DS_OBSERVACAO"));
			lancaDespesa.setValorDespesa(resultadoDados.getDouble("VL_DESPESA"));
			lancaDespesa.setProcesso(processo);
			lancaDespesa.setTipoDespesa(tipoDespesa);
			lstDespesa.add(lancaDespesa);
			
			
		}
		resultadoDados.close();
		stmt.close();
				
		return lstDespesa;
	}
	
}
