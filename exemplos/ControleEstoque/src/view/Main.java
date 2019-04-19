package view;

import java.util.Scanner;

import controler.OperadorController;
import controler.ProdutoController;

public class Main {
	private static final int qtdade_opcoes = 4;
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcao;
		do {
			opcao = menuGeral();
			
			switch (opcao) {
			case 1:
				cadastraOperador();
				break;
			case 2:
				apresentarOperadores();
				break;
			case 3:
				cadastraProduto();
				break;
			case 4:
				listaProdutos();
				break;
			default:
				break;
			}
		}while(opcao != 0);
	}
	
	public static void listaProdutos() {
		String dados[] = ProdutoController.todosProdutos();
		System.out.println("*** Produtos cadastrados ***");
		for(String s : dados) {
			System.out.println("\t " + s);
		}
	}
	
	public static void cadastraProduto() {
		int codigo;
		String desc;
		String operator[] = lerOperador();
		
		System.out.println("*** Cadastro de Produto ***");
		System.out.print("Código.....: ");
		codigo = input.nextInt();
		input.nextLine();
		System.out.print("Descrição..:");
		desc = input.nextLine();
		
		if(ProdutoController.salvaProduto(codigo, desc, operator[0], operator[1])) {
			System.out.println("\n\t *** Produto cadastrado *** \n");
		}else {
			System.out.println("\n\t *** Produto não cadastrado *** \n");
		}
		
	}
	
	public static String[] lerOperador() {
		String dados[] = new String[2];
		System.out.println("Dados operador |----");
		System.out.print("Username.: ");
		dados[0] = input.nextLine();
		System.out.print("Senha....: ");
		dados[1] = input.nextLine();
		return dados;
	}
	
	public static void apresentarOperadores() {
		String operadores[] = OperadorController.todosOperadores();
		System.out.println("*** Operadores cadastrados *** ");
		for(String s : operadores) {
			System.out.println("\t " + s);
		}
	}
	
	public static void cadastraOperador() {
		String username;
		String senha;
		int permissao;
		
		System.out.println("*** Cadastro de Operador de Sistema ***");
		System.out.print("Username...: ");
		username = input.nextLine();
		System.out.print("Senha......: ");
		senha = input.nextLine();
		System.out.println("\t\t Permissões: 0 - Entrada e Saída | 1 - Entrada | 2 - Saída");
		System.out.print("Permissão..:");
		permissao = input.nextInt();
		
		if(OperadorController.novoOperador(username, senha, permissao)) {
			System.out.println("\n\t*** Operador cadastrado ***\n");
		}else {
			System.out.println("\n\t*** Operador não cadastrado ***\n");
		}
		
	}
	
	public static int menuGeral() {
		
		int op = 0;
		String msg = "1. Novo operador\n"
				+ "2. Apresentar operadores\n"
				+ "3. Novo produto\n"
				+ "4. Lista de produtos cadastrados\n"
				+ "0. Encerrar o sistema\n\n"
				+ "Opção desejada: ";
		
		System.out.print(msg);
		try {
			op = input.nextInt();
			input.nextLine();
			if(op < 0 || op > qtdade_opcoes) {
				op = 0;
			}
		}catch (Exception e) {
			op = 0;
		}
		
		return op;
	}

}
