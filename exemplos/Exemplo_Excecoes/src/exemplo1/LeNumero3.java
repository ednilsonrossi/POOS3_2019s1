package exemplo1;

import java.io.IOException;

public class LeNumero3 {
	public static void main(String[] args) {
        byte[] dados = new byte[10];
        int nro=0;
        System.out.println("Digite um número: ");
        try {
            System.in.read(dados);
            nro = Integer.parseInt(new String(dados).trim());
        } catch (IOException e) {
            System.out.println("Ocorreu um erro e o número não pode ser lido.");
            System.out.println("Mensagem: " + e.getMessage());
            nro = -1;
        } catch (NumberFormatException nfe){
            System.out.println("Erro ao converter o número");
            nro = -1;
        }
        finally{
            System.out.println("Nro lido: " + nro);
        }
    }
}
