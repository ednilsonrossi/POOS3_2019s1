package proposta1.view;

import proposta1.model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila(10);
		
		Caixa cx1 = new Caixa(fila, false);
		Caixa cx2 = new Caixa(fila, false);
		Caixa cx3 = new Caixa(fila, false);
		Caixa cx4 = new Caixa(fila, true);
		
		RetiraSenha senha = new RetiraSenha(fila);

	}

}
