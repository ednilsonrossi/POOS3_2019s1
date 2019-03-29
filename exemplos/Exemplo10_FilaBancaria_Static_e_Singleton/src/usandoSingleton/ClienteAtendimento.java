package usandoSingleton;

import model.Cliente;

public class ClienteAtendimento extends Cliente{
	private Senha objSenha;

	@Override
	protected int gerarNovaSenha() {
		objSenha = Senha.getInstance();
		return objSenha.geraSenha();
	}
	
	public void atenderCliente() {
		objSenha = Senha.getInstance();
		objSenha.liberaSenha(getSenha());
	}
	
}
