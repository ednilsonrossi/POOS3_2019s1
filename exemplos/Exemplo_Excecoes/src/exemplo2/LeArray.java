package exemplo2;

import java.util.Scanner;

public class LeArray {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int[] nros = new int[10];

        i=0;
        do{
            nros[i] = input.nextInt();
            i++;
        }while(true);
    }
}
