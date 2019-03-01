package program;

import model.Dinheiro;

public class Main {

	public static void main(String[] args) {

		Dinheiro a = new Dinheiro(100, 99, Dinheiro.NEGATIVO);
		Dinheiro b = new Dinheiro(50, 16);
		Dinheiro c;
		Dinheiro d;
		
		System.out.println("A: " + a.toString());
		System.out.println("B: " + b.toString());

		c = a.soma(b);
		System.out.println("C: " + c.toString());
		
		d = a.subtrai(b);
		System.out.println("D: " + d.toString());
	}

}
