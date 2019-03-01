package solucao2;

public abstract class Aluno {
	private int prontuario;
	private String nome;
	
	public Aluno(int prontuario, String nome) {
		this.prontuario = prontuario;
		this.nome = nome;
	}
	
	public abstract float getNCC();
	
	public boolean faraIfa() {
		boolean emIfa = false;
		float ncc = getNCC();
		if(ncc >= 4.0 && ncc < 6) {
			emIfa = true;
		}
		return emIfa;
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
