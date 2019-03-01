import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        MinhaData data;
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite dia: ");
        a = input.nextInt();
        System.out.println("Digite mês: ");
        b = input.nextInt();
        System.out.println("Digite ano: ");
        c = input.nextInt();

        data = new MinhaData(a, b, c);
        data = new MinhaData(c, b, a);

        System.out.println("Brazil: " + data.dataBrazil());
        System.out.println("Internacional: " + data.dataUSA());

        data.setDia(900);
        data.setMes(10);

        System.out.println("Brazil: " + data.dataBrazil());
        System.out.println("Internacional: " + data.dataUSA());
    }

}