package exemplo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerTabuada2 {
	public static void main(String[] args) throws IOException{
		InputStream inputStream = null;
        InputStreamReader reader = null;
		int lido;
        
        inputStream = new FileInputStream("/home/ednilson/Desktop/Saida.txt");
        reader = new InputStreamReader(inputStream);
        
        while ((lido = reader.read()) != -1){
            System.out.print((char) lido);
        }
        
        reader.close();
        inputStream.close();
	}
}
