/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see TipoTarefaBO
 */

package br.com.fiap.beans;

public class TipoTarefa {

	private int codigoTipoTarefa;
	private String descricaoTipoTarefa;
	
	public TipoTarefa(int codigoTipoTarefa, String descricaoTipoTarefa) {
		super();
		this.codigoTipoTarefa = codigoTipoTarefa;
		this.descricaoTipoTarefa = descricaoTipoTarefa;
	}
	public TipoTarefa() {
		super();
	}
	public int getCodigoTipoTarefa() {
		return codigoTipoTarefa;
	}
	public void setCodigoTipoTarefa(int codigoTipoTarefa) {
		this.codigoTipoTarefa = codigoTipoTarefa;
	}
	public String getDescricaoTipoTarefa() {
		return descricaoTipoTarefa;
	}
	public void setDescricaoTipoTarefa(String descricaoTipoTarefa) {
		this.descricaoTipoTarefa = descricaoTipoTarefa;
	}
	
	
	
	
	
}
