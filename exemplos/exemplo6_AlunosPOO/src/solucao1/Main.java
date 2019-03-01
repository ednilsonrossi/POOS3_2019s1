package solucao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		AlunoPOO sala[];
		int total, contador;
		
		System.out.println("Quantidade de alunos: ");
		total = entrada.nextInt();
		
		if(total > 0) {
			sala = new AlunoPOO[total];
			
			contador = 0;
			while(contador < total) {
				sala[contador] = lerAluno();
				contador += 1;
			}
			
			for(contador=0; contador < total; contador++) {
				if(sala[contador].faraIfa()) {
					System.out.printf("%s(%d) fará IFA pois tem NCC = %.2f \n", sala[contador].getNome(), sala[contador].getProntuario(), sala[contador].getNCC());
				}
			}
		}
		
		

	}

	public static AlunoPOO lerAluno() {
		Scanner input;
		AlunoPOO novo;
		String nome;
		int prontuario;
		float n1, n2, n3, n4, n5;
		
		input = new Scanner(System.in);
		System.out.println("Nome.......: ");
		nome = input.nextLine();
		System.out.println("Prontuário.: ");
		prontuario = input.nextInt();
		System.out.println("Prova 1....: ");
		n1 = input.nextFloat();
		System.out.println("Prova 2....: ");
		n2 = input.nextFloat();
		System.out.println("Laboratório: ");
		n3 = input.nextFloat();
		System.out.println("Exercícios.: ");
		n4 = input.nextFloat();
		System.out.println("Projeto....: ");
		n5 = input.nextFloat();
		
		novo = new AlunoPOO(prontuario, nome, n1, n2, n3, n4, n5);
		
		return novo;
	}
}
