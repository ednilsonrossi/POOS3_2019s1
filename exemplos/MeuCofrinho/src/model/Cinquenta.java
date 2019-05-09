package model;

public class Cinquenta extends Moeda {
	
	@Override
	public String toString() {
		return "R$ 0.50";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj != null) {
			if(obj instanceof Cinquenta) {
				iguais = true;
			}
		}
		return iguais;
	}
}
