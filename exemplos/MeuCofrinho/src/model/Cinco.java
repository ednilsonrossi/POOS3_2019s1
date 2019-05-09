package model;

public class Cinco extends Moeda {

	@Override
	public String toString() {
		return "R$ 0.05";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj != null) {
			if(obj instanceof Cinco) {
				iguais = true;
			}
		}
		return iguais;
	}
	
}
