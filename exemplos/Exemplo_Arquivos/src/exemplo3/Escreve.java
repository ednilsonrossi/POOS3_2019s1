package exemplo3;

import java.io.*;

public class Escreve {
	public static void main(String[] args) throws IOException{
        OutputStream outputStream;
        OutputStreamWriter outputStreamWriter;
        String frase;

        frase = "Prova de POOS3 em 07/06/2019";
        
        outputStream = new FileOutputStream("/home/ednilson/Desktop/mensagem.txt");
        outputStreamWriter = new OutputStreamWriter(outputStream);
        for(char c : frase.toCharArray()){
            outputStream.write(c);
        }
        outputStreamWriter.close();
        outputStream.close();
    }
}
