package proposta2.model;


public abstract class Fila {
	protected final int DEFAULT_MAXIMO = 100;
	protected int tamanhoMaximo;
	
	protected abstract void init();
	
	public abstract boolean estaCheia();
	
	public abstract boolean estaVazia();
	
	public abstract boolean entraFila(Cliente c);
	
	public abstract Cliente saiFila();
	
	public abstract Cliente saiFilaComPrioridade();
	
	public abstract int proximaSenha();
}
