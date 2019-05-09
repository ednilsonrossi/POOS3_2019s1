package model;

public class VinteCinco extends Moeda {

	@Override
	public String toString() {
		return "R$ 0.25";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj != null) {
			if(obj instanceof VinteCinco) {
				iguais = true;
			}
		}
		return iguais;
	}
	
	
}
