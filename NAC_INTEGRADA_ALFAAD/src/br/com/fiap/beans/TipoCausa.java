/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see TipoCausaBO
 */

package br.com.fiap.beans;

public class TipoCausa {

	private int codigoTipoCausa;
	private String descricaoTipoCausa;
	
	public TipoCausa(int codigoTipoCausa, String descricaoTipoCausa) {
		super();
		this.codigoTipoCausa = codigoTipoCausa;
		this.descricaoTipoCausa = descricaoTipoCausa;
	}

	public TipoCausa() {
		super();
	}

	public int getCodigoTipoCausa() {
		return codigoTipoCausa;
	}

	public void setCodigoTipoCausa(int codigoTipoCausa) {
		this.codigoTipoCausa = codigoTipoCausa;
	}

	public String getDescricaoTipoCausa() {
		return descricaoTipoCausa;
	}

	public void setDescricaoTipoCausa(String descricaoTipoCausa) {
		this.descricaoTipoCausa = descricaoTipoCausa;
	}
	
	
}
