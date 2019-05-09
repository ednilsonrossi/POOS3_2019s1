package model;

public class Um extends Moeda {
	
	@Override
	public String toString() {
		return "R$ 0.01";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj != null) {
			if(obj instanceof Um) {
				iguais = true;
			}
		}
		return iguais;
	}
}
