package model;

public class Dez extends Moeda {
	
	@Override
	public String toString() {
		return "R$ 0.10";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj != null) {
			if(obj instanceof Dez) {
				iguais = true;
			}
		}
		return iguais;
	}
}
