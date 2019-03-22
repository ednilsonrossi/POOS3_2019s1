package model;

public interface IFila<T> {

	public static final int DEFAULT_MAXIMO = 100;
	
	void init();
	
	public abstract boolean estaCheia();
	
	public abstract boolean estaVazia();
	
	public abstract boolean entraFila(T c);
	
	public abstract T saiFila();
	
}
