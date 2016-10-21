/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see HistoricoTaxaBO
 */

package br.com.fiap.beans;

public class HistoricoTaxa {

	private int codigo;
	private String dataVigencia;
	private double taxaJuros;
	private double taxaAdm;
	private double moraDiaria;
	
	public HistoricoTaxa(int codigo, String dataVigencia, double taxaJuros, double taxaAdm, double moraDiaria) {
		super();
		this.codigo = codigo;
		this.dataVigencia = dataVigencia;
		this.taxaJuros = taxaJuros;
		this.taxaAdm = taxaAdm;
		this.moraDiaria = moraDiaria;
	}

	public HistoricoTaxa() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataVigencia() {
		return dataVigencia;
	}

	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaAdm() {
		return taxaAdm;
	}

	public void setTaxaAdm(double taxaAdm) {
		this.taxaAdm = taxaAdm;
	}

	public double getMoraDiaria() {
		return moraDiaria;
	}

	public void setMoraDiaria(double moraDiaria) {
		this.moraDiaria = moraDiaria;
	}
	
	
	
}
