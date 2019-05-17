package exemplo2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeArray2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int[] nros = new int[10];
        boolean continua = true;
        
        input.close();
        i = 0;
        do {
        	try {
        		nros[i] = input.nextInt();
        		i++;
        	} catch (IllegalStateException isEx) {
        		System.out.println("Instanciado novo input");
            	input = new Scanner(System.in);
        	} catch (ArrayIndexOutOfBoundsException aiobEx){
                System.out.println("Vetor está cheio, impossível inserir mais dados");
                continua = false;
            } catch (InputMismatchException imEx){
                System.out.println("Erro na entrada de dados");
            }catch (NoSuchElementException nsEx) {
        		System.out.println("Não lido");
        		input = new Scanner(System.in);
        	} catch (Exception ex){
                System.out.println("Outro erro desconhecido!");
                ex.printStackTrace();
            }
        } while (continua);
        

        for(i=0; i<nros.length; i++){
            System.out.println(nros[i]);
        }
    }
}
