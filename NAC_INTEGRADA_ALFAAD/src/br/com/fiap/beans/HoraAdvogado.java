/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see HoraAdvogadoBO
 */

package br.com.fiap.beans;

public class HoraAdvogado {

	private Advogado advogado;
	private int codigoHistorico;
	private String dataVigencia;
	private double valorHora;
	
	public HoraAdvogado(Advogado advogado, int codigoHistorico, String dataVigencia, double valorHora) {
		super();
		this.advogado = advogado;
		this.codigoHistorico = codigoHistorico;
		this.dataVigencia = dataVigencia;
		this.valorHora = valorHora;
	}
	public HoraAdvogado() {
		super();
	}
	public Advogado getAdvogado() {
		return advogado;
	}
	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}
	public int getCodigoHistorico() {
		return codigoHistorico;
	}
	public void setCodigoHistorico(int codigoHistorico) {
		this.codigoHistorico = codigoHistorico;
	}
	public String getDataVigencia() {
		return dataVigencia;
	}
	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
