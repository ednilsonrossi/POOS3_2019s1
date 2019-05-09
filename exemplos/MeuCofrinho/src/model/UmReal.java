package model;

public class UmReal extends Moeda{
	
	@Override
	public String toString() {
		return "R$ 1.00";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguais = false;
		if(obj != null) {
			if(obj instanceof UmReal) {
				iguais = true;
			}
		}
		return iguais;
	}
	
}
