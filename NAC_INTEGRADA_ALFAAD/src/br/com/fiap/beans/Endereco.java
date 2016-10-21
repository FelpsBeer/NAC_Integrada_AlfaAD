/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see EnderecoBO
 */

package br.com.fiap.beans;

public class Endereco {

	private long codigo;
	private String estado;
	private String siglaEstado;
	private String cidade;
	private String bairro;
	private String tipoLogradouro;
	private String cep;
	private String logradouro;
	private String numeroEndereco;
	private String complemento;
	
	public Endereco(long codigo, String estado, String siglaEstado, String cidade, String bairro, String tipoLogradouro,
			String cep, String logradouro, String numeroEndereco, String complemento) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.siglaEstado = siglaEstado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.tipoLogradouro = tipoLogradouro;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numeroEndereco = numeroEndereco;
		this.complemento = complemento;
	}
	
	
	public Endereco() {
		super();
	}

	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSiglaEstado() {
		return siglaEstado;
	}
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
