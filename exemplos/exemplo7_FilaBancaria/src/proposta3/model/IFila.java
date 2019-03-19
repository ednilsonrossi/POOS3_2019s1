package proposta3.model;

public interface IFila {

	public static final int DEFAULT_MAXIMO = 100;
	
	void init();
	
	public abstract boolean estaCheia();
	
	public abstract boolean estaVazia();
	
	public abstract boolean entraFila(Cliente c);
	
	public abstract Cliente saiFila();
	
}
