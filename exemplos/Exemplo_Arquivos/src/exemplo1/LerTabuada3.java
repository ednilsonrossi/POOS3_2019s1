package exemplo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerTabuada3 {
	public static void main(String[] args) throws IOException{
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        String linha;
        
        inputStream = new FileInputStream("/home/ednilson/Desktop/Saida.txt");
        inputStreamReader = new InputStreamReader(inputStream);
        bufferedReader = new BufferedReader(inputStreamReader);

        while((linha = bufferedReader.readLine()) != null){
        	System.out.println(linha);
        }
        
        bufferedReader.close();
    }
}
