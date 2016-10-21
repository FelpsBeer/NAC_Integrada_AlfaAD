/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see processoBO
 */

package br.com.fiap.beans;

public class Processo {

	private long numeroProcesso;
	private Advogado advogado;
	private Forum forum;
	private Cliente cliente;
	private String descricaoProcesso;
	private String dataAbertura;
	private String dataFechamento;
	private String dataDiaVencimento;
	private byte resultado;
	private byte situacao;
	private String observacao;
	
	public Processo(long numeroProcesso, Advogado advogado, Forum forum, Cliente cliente, String descricaoProcesso,
			String dataAbertura, String dataFechamento, String dataDiaVencimento, byte resultado, byte situacao,
			String observacao) {
		super();
		this.numeroProcesso = numeroProcesso;
		this.advogado = advogado;
		this.forum = forum;
		this.cliente = cliente;
		this.descricaoProcesso = descricaoProcesso;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.dataDiaVencimento = dataDiaVencimento;
		this.resultado = resultado;
		this.situacao = situacao;
		this.observacao = observacao;
	}

	public Processo() {
		super();
	}

	public long getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(long numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescricaoProcesso() {
		return descricaoProcesso;
	}

	public void setDescricaoProcesso(String descricaoProcesso) {
		this.descricaoProcesso = descricaoProcesso;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public String getDataDiaVencimento() {
		return dataDiaVencimento;
	}

	public void setDataDiaVencimento(String dataDiaVencimento) {
		this.dataDiaVencimento = dataDiaVencimento;
	}

	public byte getResultado() {
		return resultado;
	}

	public void setResultado(byte resultado) {
		this.resultado = resultado;
	}

	public byte getSituacao() {
		return situacao;
	}

	public void setSituacao(byte situacao) {
		this.situacao = situacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
	
	
	
}
