package model;

public class Pessoa {
	
	
	private String nome;
	private int nroDocumento;
	
	public Pessoa(String nome, int nroDocumento) {
		super();
		this.nome = nome;
		this.nroDocumento = nroDocumento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nroDocumento=" + nroDocumento + "]";
	}
	
	public static Pessoa fromString(String txt) {
		String partes[] = txt.split(",");
		return new Pessoa(partes[0].substring(13), Integer.parseInt(partes[1].substring(14, partes[1].length()-1)));
	}

}
