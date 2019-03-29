package usandoStatic;

import java.util.Random;

import model.Cliente;

public class ClienteAtendimento extends Cliente{
	
	private static boolean senhas[]; 

	public ClienteAtendimento() {
		super();
		init();
	}

	public ClienteAtendimento(boolean ehPrioritario) {
		super(ehPrioritario);
		init();
	}

	protected void init() {
		senhas = new boolean[1000];
		senhas[0] = true;
	}

	@Override
	protected int gerarNovaSenha() {
		int retorno;
		if(senhas != null) {
			Random rand = new Random();
			int posicao=0;
			if(temSenha()) {
				while(senhas[posicao]) {
					posicao = rand.nextInt(999) + 1;
				}
				senhas[posicao] = true;
			}else {
				posicao = -1;
			}
			retorno = posicao;
		}else {
			retorno = super.gerarNovaSenha();
		}
		return retorno;
	}
	
	protected boolean temSenha() {
		int i=0;
		while(i < 1000 && senhas[i]) {
			i++;
		}
		return i == 1000 ? false : true;
	}
	
}
