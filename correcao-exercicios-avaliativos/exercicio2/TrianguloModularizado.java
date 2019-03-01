import java.util.Scanner;

/**
 *  Elaborado por Ednilson Rossi
 *
 * Classe Triangulo é um exercício proposto na primeira aula envolvendo programação.
 * Aqui utiliza-se muito o conceito de programação estrutura, pode-se observar que
 * todas as funcionalidades foram implementadas no método main(). Contudo, inclui-se
 * o conceito de modularização. Porém não estamos desenvolvendo uma solução OO.
 */
public class TrianguloModularizado {

     public static void main(String[] args) {
		/*
           * Abaixo a definição e instância do objeto da classe Scanner.
           */
		Scanner input = new Scanner(System.in);
		int lado1, lado2, lado3;
		int contador;
		boolean ehTriangulo;
		String tipo;

		contador = 1;
		do {
			System.out.println("Digite três lados do triangulo:");
			lado1 = input.nextInt();
			lado2 = input.nextInt();
			lado3 = input.nextInt();

			ehTriangulo = formaTriangulo(lado1, lado2, lado3);

			if(ehTriangulo) {
				tipo = tipoTriangulo(lado1, lado2, lado3);
				System.out.println("DADOS FORMAM " + tipo);
			}else {
				System.out.println("DADOS NÃO FORMAM TRIANGULO");
			}
			contador += 1;

		}while(contador <= 5);


	}

     /*
      * Assim como em programação estruturada, pode-se criar funções/métodos para
      * modularizar a solução. Abaixo está o método formaTriangulo() que retorna
      * true ou false se os dados formam ou não formam um triângulo.
      * Observa-se a mesma lógica da solução anterior, contudo com o conceito de
      * modularização.
      */
	public static boolean formaTriangulo(int a, int b, int c) {
		boolean ehTriangulo = false;

		if(a+b > c) {
			if(a+c > b) {
				if(b+c > a) {
					ehTriangulo = true;
				}
			}
		}

		return ehTriangulo;
	}

     /*
      * A função/método tipoTriangulo() informa qual o tipo do triângulo.
      *
      * É importante observar que os métodos formaTriangulo() e tipoTriangulo()
      * não fazem parte do contexto da classe TrianguloModularizado, mas estão,
      * assim como o main(), hospedados na classe.
      */
	public static String tipoTriangulo(int a, int b, int c) {
		String retorno;
		if(!formaTriangulo(a, b, c)) {
			retorno = "NÃO É TRIANGULO";
		}else {
			retorno = "TRIANGULO ";
			if(a == b && b == c) {
				retorno += "EQUILÁTERO";
			}else {
				if(a != b && a != c && b != c) {
					retorno += "ESCALENO";
				}else {
					retorno += "ISÓSCELES";
				}
			}
		}
		return retorno;
	}
}
