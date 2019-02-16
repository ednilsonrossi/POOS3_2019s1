import java.util.Scanner;

public class Exemplo3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char sexo;
        System.out.printf("Informe sexo (M, F ou I): ");
        sexo = input.nextLine().charAt(0);
        System.out.printf("Sexo digitado: %c \n", sexo);
    }
}