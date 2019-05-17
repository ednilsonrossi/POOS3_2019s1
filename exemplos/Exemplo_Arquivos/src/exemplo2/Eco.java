package exemplo2;

import java.io.*;

public class Eco {
	public static void main(String[] args) throws IOException{
		InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        String linha;

        inputStream = System.in;
        inputStreamReader = new InputStreamReader(inputStream);
        bufferedReader = new BufferedReader(inputStreamReader);

        do{
            linha = bufferedReader.readLine();
            if(linha != null) {
            	linha = "Disse: " + linha;
                System.out.println(linha);
            }
        }while (linha != null);
	}
}
