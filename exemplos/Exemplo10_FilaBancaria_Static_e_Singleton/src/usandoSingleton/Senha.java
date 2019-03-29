package usandoSingleton;

import java.util.Random;

public class Senha {
	private final int MAXIMO = 1000;
	private boolean senhas[];
	private static Senha instancia;
	private int senhasAtivas;
	
	private Senha() {
		senhas = new boolean[MAXIMO];
		senhasAtivas = 0;
	}
	
	public static Senha getInstance() {
		if(instancia == null) {
			instancia = new Senha();
		}
		return instancia;
	}
	
	public int geraSenha() {
		Random rand = new Random();
		int posicao=0;
		if(temSenha()) {
			while(senhas[posicao]) {
				posicao = rand.nextInt(999) + 1;
			}
			senhas[posicao] = true;
			senhasAtivas += 1;
		}else {
			posicao = -1;
		}
		return posicao;
	}
	
	private boolean temSenha() {
		return senhasAtivas < MAXIMO;
	}
	
	public void liberaSenha(int senha) {
		if(senha > 0 && senha < MAXIMO) {
			if(!senhas[senha]) {
				senhas[senha] = false;
				senhasAtivas -= 1;
			}
		}
	}
}
