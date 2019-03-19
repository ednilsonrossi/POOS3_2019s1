package proposta3.view;

import proposta3.model.FilaEstatica;
import proposta3.model.IFilaPrioritaria;

public class Principal {

	public static void main(String[] args) {
		IFilaPrioritaria fila = new FilaEstatica(10);
		
		Caixa cx1 = new Caixa(fila, false);
		Caixa cx2 = new Caixa(fila, false);
		Caixa cx3 = new Caixa(fila, false);
		Caixa cx4 = new Caixa(fila, true);
		
		RetiraSenha senha = new RetiraSenha(fila);

	}

}
