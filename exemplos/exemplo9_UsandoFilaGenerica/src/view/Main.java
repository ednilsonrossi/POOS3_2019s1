package view;

import model.FilaCircular;
import model.Nada;
import model.QualquerCoisa;

public class Main {

	public static void main(String[] args) {
		//FilaCircular fila = new FilaCircular(5);
		/*
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		
		QualquerCoisa obj;
		while(!fila.estaVazia()) {
			obj = (QualquerCoisa)fila.saiFila();
			System.out.println(obj.toString());
		}
		*/
		/*
		fila.entraFila(new Nada());
		fila.entraFila(new Nada());
		fila.entraFila(new Nada());
		fila.entraFila(new Nada());
		fila.entraFila(new Nada());
		fila.entraFila(new Nada());
		Nada obj;
		while(!fila.estaVazia()) {
			obj = (Nada)fila.saiFila();
			System.out.println(obj.toString());
		}
		*/
		/*
		fila.entraFila(new Nada());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new QualquerCoisa());
		fila.entraFila(new Nada());
		fila.entraFila(new QualquerCoisa());
		
		while(!fila.estaVazia()) {
			System.out.println(fila.saiFila().paraString());
		}
		*/
		
		FilaCircular<Nada> nadas = new FilaCircular<Nada>();
		
		nadas.entraFila(new Nada());
		nadas.entraFila(new Nada());
		nadas.entraFila(new Nada());
		nadas.entraFila(new QualquerCoisa());
		
		
	}

}
