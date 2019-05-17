package exemplo1;

import java.io.IOException;

public class LeNumero {

	public static void main(String[] args) {
		byte[] dados = new byte[10];
        System.out.println("Digite um número: ");
        try {
			System.in.read(dados);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(new String(dados));
	}
}
