package proposta2.view;

import proposta2.model.Fila;
import proposta2.model.FilaCircular;
import proposta2.model.FilaEstatica;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new FilaCircular(10);
		
		Caixa cx1 = new Caixa(fila, false);
		Caixa cx2 = new Caixa(fila, false);
		Caixa cx3 = new Caixa(fila, false);
		Caixa cx4 = new Caixa(fila, true);
		
		RetiraSenha senha = new RetiraSenha(fila);

	}

}
