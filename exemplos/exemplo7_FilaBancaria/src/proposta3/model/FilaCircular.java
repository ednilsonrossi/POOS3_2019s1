package proposta3.model;

public class FilaCircular implements IFilaPrioritaria {

	private Cliente[] elementos;
	private int inicio;
	private int fim;
	private int tamanho;
	private int tamanhoMaximo;
	
	public FilaCircular() {
		super();
		this.tamanhoMaximo = DEFAULT_MAXIMO;
		init();
	}
	
	public FilaCircular(int tamanhoMaximo) {
		super();
		this.tamanhoMaximo = tamanhoMaximo > 0 ? tamanhoMaximo : DEFAULT_MAXIMO;
		init();
	}
	
	@Override
	public void init() {
		inicio = 0;
		fim = -1;
		tamanho = 0;
		elementos = new Cliente[tamanhoMaximo];
	}

	@Override
	public boolean estaCheia() {
		boolean cheia = false;
		if(tamanho == tamanhoMaximo) {
			cheia = true;
		}
		return cheia;
	}

	@Override
	public boolean estaVazia() {
		return tamanho == 0;
	}

	@Override
	public boolean entraFila(Cliente c) {
		boolean deuCerto = false;
		if(c != null && !estaCheia()) {
			if(fim == tamanhoMaximo - 1) {
				fim = 0;
			}else {
				fim += 1;
			}
			elementos[fim] = c;
			tamanho += 1;
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public Cliente saiFila() {
		Cliente c = null;
		if(!estaVazia()) {
			c = elementos[inicio];
			if(inicio == tamanhoMaximo - 1) {
				inicio = 0;
			}else {
				inicio += 1;
			}
			tamanho -= 1;
		}
		return c;
	}

	@Override
	public Cliente saiFilaComPrioridade() {
		Cliente c = null;
		int size;
		if(!estaVazia()) {
			size = tamanho;
			while(c == null && size != 0) {
				c = saiFila();
				if(!c.isPrioritario()) {
					entraFila(c);
					c = null;
				}
				size--;
			}
			while(size > 0) {
				entraFila(saiFila());
				size--;
			}
			if(c == null) {
				c = saiFila();
			}
		}
		return c;
	}

}
