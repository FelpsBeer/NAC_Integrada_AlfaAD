/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see TipoDespesaBO.java
 */

package br.com.fiap.beans;

public class TipoDespesa {

	private int codigoTipoDespesa;
	private String descricaoTipoDespesa;
	
	public TipoDespesa(int codigoTipoDespesa, String descricaoTipoDespesa) {
		super();
		this.codigoTipoDespesa = codigoTipoDespesa;
		this.descricaoTipoDespesa = descricaoTipoDespesa;
	}
	
	public TipoDespesa(){}

	public int getCodigoTipoDespesa() {
		return codigoTipoDespesa;
	}

	public void setCodigoTipoDespesa(int codigoTipoDespesa) {
		this.codigoTipoDespesa = codigoTipoDespesa;
	}

	public String getDescricaoTipoDespesa() {
		return descricaoTipoDespesa;
	}

	public void setDescricaoTipoDespesa(String descricaoTipoDespesa) {
		this.descricaoTipoDespesa = descricaoTipoDespesa;
	}
	
	
}
