package proposta2.model;

public class Cliente {
	private int senha;
	private boolean ehPrioritario;
	
	public Cliente (int senha) {
		setSenha(senha);
		ehPrioritario = false;
	}
	
	public Cliente (int senha, boolean ehPrioritario) {
		setSenha(senha);
		this.ehPrioritario = ehPrioritario;
	}
	
	private void setSenha(int senha) {
		this.senha = senha > 0 ? senha : 1;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public boolean isPrioritario() {
		return ehPrioritario;
	}
}
