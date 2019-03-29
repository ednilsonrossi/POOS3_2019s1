package model.Entidades;

public class Nada {

	public static int numero_nada = 0;
	
	private int numero;
	
	public Nada() {
		numero_nada += 1;
		this.numero = numero_nada;
	}
	
	public Nada(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		
		return String.format("Sou o nada número %d!!!", this.numero);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		Nada outro;
		if(obj instanceof Nada) {
			outro = (Nada) obj;
			if(outro.numero == this.numero) {
				iguais = true;
			}
		}
		return iguais;
	}
	
	
}
