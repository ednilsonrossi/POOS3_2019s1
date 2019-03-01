package proposta1;

import java.util.Scanner;

import proposta1.AlunoPOO;

public class Main {

	public static void main(String[] args) {
		final int MAXIMO = 3; 
		AlunoPOO alunos[];
		
		alunos = new AlunoPOO[MAXIMO];
		
		for(int i=0; i<MAXIMO; i++) {
			alunos[i] = lerAluno();
		}
		
		System.out.println("Alunos de IFA: ");
		for(int i=0; i < MAXIMO; i++) {
			if(alunos[i].faraIfa()) {
				System.out.printf("Aluno: %s - NCC: %.2f\n", 
						alunos[i].getNome(),
						alunos[i].getNcc());
				
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
