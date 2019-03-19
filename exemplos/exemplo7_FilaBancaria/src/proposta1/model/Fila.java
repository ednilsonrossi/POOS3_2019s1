package proposta1.model;

public class Fila {
	private final int DEFAULT_MAXIMO = 100;
	private Cliente elementos[];
	private int inicio;
	private int fim;
	private int tamanhoMaximo;
	
	public Fila() {
		tamanhoMaximo = DEFAULT_MAXIMO;
		init();
	}
	
	public Fila(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo > 0 ? tamanhoMaximo : DEFAULT_MAXIMO;
		init();
	}
	
	private void init() {
		elementos = new Cliente[tamanhoMaximo];
		inicio = 0;
		fim = -1;
	}
	
	public boolean estaCheia() {
		return fim == tamanhoMaximo-1;
	}
	
	public boolean estaVazia() {
		return fim < inicio;
	}
	
	public boolean entraFila(Cliente c) {
		boolean deuCerto = false;
		if(c != null && !estaCheia()) {
			fim += 1;
			elementos[fim] = c; 
			deuCerto = true;
		}
		return deuCerto;
	}
	
	public Cliente saiFila() {
		Cliente c = null;
		if(!estaVazia()) {
			c = elementos[inicio];
			inicio += 1;
		}
		return c;
	}
	
	public Cliente saiFilaComPrioridade() {
		Cliente c = null;
		int i;
		if(!estaVazia()) {
			i = inicio;
			do {
				if(elementos[i].isPrioritario()) {
					c = elementos[i];
					inicio += 1;
					while(i > inicio-1) {
						elementos[i] = elementos[i-1];
						i -= 1;
					}
				}else {
					i++;
					if(elementos[i] == null) {
						i = tamanhoMaximo;
					}
				}
			}while(c == null && i < tamanhoMaximo);
			if(c == null) {
				c = saiFila();
			}
		}
		return c;
	}
	
	public int proximaSenha() {
		int i;
		if(estaVazia()) {
			i = 1;
		}else {
			i = elementos[fim].getSenha() + 1;
		}
		return i;
	}
}
