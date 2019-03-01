import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
          Scanner objScanner = new Scanner(System.in);
          MeuTriangulo meuTriangulo;
          int lado1, lado2, lado3, contador;

          for(contador=0; contador < 5; contador++){
               System.out.println("Digite os três lados do triângulo");
               lado1 = objScanner.nextInt();
               lado2 = objScanner.nextInt();
               lado3 = objScanner.nextInt();

               meuTriangulo = new MeuTriangulo(lado1, lado2, lado3);
               System.out.println("Os dados foram: " + meuTriangulo.getTipo());
          }
     }

}