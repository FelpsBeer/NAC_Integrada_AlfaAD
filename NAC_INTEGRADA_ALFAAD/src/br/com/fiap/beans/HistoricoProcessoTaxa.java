/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see HistoricoProcessoTaxaBO
 */

package br.com.fiap.beans;

public class HistoricoProcessoTaxa {

	private HistoricoTaxa historicoTaxa;
	private String dataValidade;
	private Processo processo;
	
	public HistoricoProcessoTaxa(HistoricoTaxa historicoTaxa, String dataValidade, Processo processo) {
		super();
		this.historicoTaxa = historicoTaxa;
		this.dataValidade = dataValidade;
		this.processo = processo;
	}

	public HistoricoProcessoTaxa() {
		super();
	}

	public HistoricoTaxa getHistoricoTaxa() {
		return historicoTaxa;
	}

	public void setHistoricoTaxa(HistoricoTaxa historicoTaxa) {
		this.historicoTaxa = historicoTaxa;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	
	
	
}
