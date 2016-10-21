/**
 * @author Felipe Moita Vieira 
 * @author João Miguel Souza Martins
 * @author Marcelo Pereira Marco Peres
 * 
 * @see TelefoneBO
 */

package br.com.fiap.beans;

public class Telefone {

	private long codigo;
	private String tipoFone;
	private String fone;
	private String ddd;
	private String ramal;
	
	public Telefone(long codigo, String tipoFone, String fone, String ddd, String ramal) {
		super();
		this.codigo = codigo;
		this.tipoFone = tipoFone;
		this.fone = fone;
		this.ddd = ddd;
		this.ramal = ramal;
	}

	public Telefone() {
		super();
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getTipoFone() {
		return tipoFone;
	}

	public void setTipoFone(String tipoFone) {
		this.tipoFone = tipoFone;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	

	
	
}
