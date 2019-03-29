package usandoStatic;

public class Main {

	public static void main(String[] args) {
		ClienteAtendimento cli;
		
		for(int i=0; i < 1000; i++) {
			cli = new ClienteAtendimento();
			System.out.printf("%3d\n", cli.getSenha());
		}
	}

}
