import java.util.Scanner;
public class Exemplo2{
        public static void main(String args[]){
                /*
                 * Instanciar um objeto para leitura de dados.
                 * A Classe Scanner facilita a entrada de dados pois
                 * fornece um conjunto de métodos que permitem a 
                 * leitura de vários tipos de dados.
                 */
                Scanner input = new Scanner(System.in);

                int ano;

                System.out.printf("Ano de nascimento: ");
                /*
                 * Método nextInt() do objeto indica à JVM a leitura
                 * de um valor do tipo inteiro.
                 */
                ano = input.nextInt();

                System.out.printf("Idade: %d \n", 2019-ano);
        }
}