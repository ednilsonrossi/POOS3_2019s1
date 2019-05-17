package exemplo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LerTabuada {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		InputStream inputStream = null;
        int lido;
        
        inputStream = new FileInputStream("/home/ednilson/Desktop/Saida.txt");
        do{
        	lido = inputStream.read();
            if(lido != -1){
            	System.out.print((char) lido);
            }
        }while (lido != -1);
        inputStream.close();
	}
}
