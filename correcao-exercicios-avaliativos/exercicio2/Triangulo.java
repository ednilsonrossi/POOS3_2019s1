import java.util.Scanner;

/**
 *  Elaborado por Ednilson Rossi
 *
 * Classe Triangulo é um exercício proposto na primeira aula envolvendo programação.
 * Aqui utiliza-se muito o conceito de programação estrutura, pode-se observar que
 * todas as funcionalidades foram implementadas no método main().
 */
public class Triangulo{
    public static void main(String[] args) {

        /*
         * Definição das variáveis. Observe que foi definido um objeto da classe
         * Scanner "objScanner" que não foi instanciado, assim, não é possível utilizá-lo.
         * somente após a criação do objeto é que ele terá pode de execução.
         */
        Scanner objScanner;
        int lado1, lado2, lado3;
        int contador;
        boolean ehTriangulo;
        String tipo;

        // Abaixo está sendo instanciado o objeto da classe objScanner
        objScanner = new Scanner(System.in);

        contador = 0;
        while(contador < 5){

            /* Leitura dos dados que podem formar um triângulo. */
            System.out.println("Digite os três lados do triângulo");
            lado1 = objScanner.nextInt();
            lado2 = objScanner.nextInt();
            lado3 = objScanner.nextInt();

            /* Aqui verica-se se os dados lidos formam ou não um triângulo. */
            ehTriangulo = false;
            if (lado1 + lado2 > lado3){
                if(lado1 + lado3 > lado2){
                    if(lado2 + lado3 > lado1){
                        ehTriangulo = true;
                        /* Só se chega aqui se todas as condições forem verdadeiras. */
                    }
                }
            }

            if(ehTriangulo){
                /* Se formam triângulo, verifica-se qual o tipo de triângulo. */
                if(lado1 == lado2 && lado1 == lado3){
                    tipo = "equilátero";
                }else{
                    if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                        tipo = "escaleno";
                    }else{
                        tipo = "isósceles";
                    }
                }
                /* Apresentação do resultado. */
                System.out.println("Dados forma um triângulo " + tipo);
            }else{
                /* Já se sabe que os dados não formam triângulo. */
                System.out.println("Dados não forma triângulo");
            }

            /* Para garantir a parada após 5 execuções o contador é incrementadi. */
            contador += 1;
        }

        /*
         * O objeto da classe Scanner é um stream, assim, é recomendado que ele seja
         * fechado após o uso. Na prática, neste programa, é desnecessário fechar
         * o Scanner.
         */
        objScanner.close();
    }

}
