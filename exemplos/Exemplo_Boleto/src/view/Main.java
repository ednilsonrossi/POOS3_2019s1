package view;

import java.util.Scanner;

import model.Boleto;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long barras;
		Boleto boleto;

		//System.out.println("Informe a última sequencia numérica do boleto: ");
		//barras = input.nextLong();
		//barras = 79670000002000L;
		barras = 56760000015075L;
		
		boleto = new Boleto(barras);
		
		System.out.println("Data de vencimento: " + boleto.getVencimento());
		System.out.println("Valor: R$ " + boleto.getValor());
		System.out.printf("Vencido a %d dias.\n", boleto.diasAtraso());
	}

}
