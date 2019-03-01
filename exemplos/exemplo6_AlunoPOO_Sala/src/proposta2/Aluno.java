package proposta2;

public abstract class Aluno {
	private int prontuario;
	private String nome;
	

	public Aluno() {
	
	}
	
	public Aluno(int prontuario, String nome) {
		this.prontuario = prontuario;
		this.nome = nome;
	}

	public abstract float getNcc();
	
	public final boolean faraIfa() {
		boolean saida = false;
		float ncc = getNcc();
		if( ncc >= 4 && ncc < 6 ) {
			saida = true;
		}
		return saida;
	}
	
	public int getProntuario() {
		return prontuario;
	}

	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
