package solucao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Aluno alunos[];
		int total, escolha, continuar = 0;
		
		alunos = new Aluno[100];
		
		total = 0;
		do {
			System.out.printf("(1) POOS3\n(2) BD1S3\n");
			System.out.print("Escolha a disciplina: ");
			escolha = entrada.nextInt();
			switch (escolha) {
				case 1:
					alunos[total] = lerAlunoPOO();
					total += 1;
					break;
				case 2:
					alunos[total] = lerAlunoBD1();
					total += 1;
				default:
					System.out.println("Disciplina indisponível.");
					break;
			}
			
			System.out.println("Deseja continuar? (1. Sim / 0. Não");
			continuar = entrada.nextInt();
			
		}while(continuar == 1);
		
		System.out.println("Alunos de IFA em POOS3");
		for(int i=0; i < total; i++) {
			if(alunos[i] instanceof AlunoPOO) {
				if(alunos[i].faraIfa()) {
					System.out.printf("%s(%d) fará IFA pois tem NCC = %.2f \n", alunos[i].getNome(), alunos[i].getProntuario(), alunos[i].getNCC());
				}
			}
		}
		
		System.out.println("Alunos de IFA em BD1S3");
		for(int i=0; i < total; i++) {
			if(alunos[i] instanceof AlunoBD1) {
				if(alunos[i].faraIfa()) {
					System.out.printf("%s(%d) fará IFA pois tem NCC = %.2f \n", alunos[i].getNome(), alunos[i].getProntuario(), alunos[i].getNCC());
				}
			}
		}

		
	}

	public static AlunoPOO lerAlunoPOO() {
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
	
	public static AlunoBD1 lerAlunoBD1() {
		Scanner input;
		AlunoBD1 novo;
		String nome;
		int prontuario;
		float n1, n2;
		
		input = new Scanner(System.in);
		System.out.println("Nome.......: ");
		nome = input.nextLine();
		System.out.println("Prontuário.: ");
		prontuario = input.nextInt();
		System.out.println("Prova 1....: ");
		n1 = input.nextFloat();
		System.out.println("Prova 2....: ");
		n2 = input.nextFloat();
		
		
		novo = new AlunoBD1(prontuario, nome, n1, n2);
		
		return novo;
	}
}
