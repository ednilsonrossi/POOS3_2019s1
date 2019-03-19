package proposta3.model;

public class Cliente {
	private static int lastPasswd = 1;
	
	private int senha;
	private boolean ehPrioritario;
	
	public Cliente () {
		this.senha = gerarNovaSenha();
		ehPrioritario = false;
	}
	
	public Cliente (boolean ehPrioritario) {
		this.senha = gerarNovaSenha();
		this.ehPrioritario = ehPrioritario;
	}
	
	private int gerarNovaSenha() {
		lastPasswd += 1;
		return lastPasswd;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public boolean isPrioritario() {
		return ehPrioritario;
	}
}
