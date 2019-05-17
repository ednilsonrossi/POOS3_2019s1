package exemplo1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GerarTabuada {

	public static void main(String[] args) throws IOException {
		int i, n;
		n = 6;
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;
		
		fileWriter = new FileWriter("/home/ednilson/Desktop/Saida.txt");
		printWriter = new PrintWriter(fileWriter);
		
		printWriter.printf("Tabuada do número %d\n", n);
		for(i = 0; i <= 10; i++) {
			printWriter.printf("%d x %d = %d \n", n, i, n*i);
		}

		printWriter.close();
		fileWriter.close();
	}
}
