
public class Main {

	public static void main(String[] args) {
		
		Classe a = new Classe("Doce Pudim");
		/*
		Classe b = new Classe ("Impossível");
		chamar();
		Classe c;
		
		for(int i = 0; i < 1000; i++) {
			c = new Classe ("Só Isso!");
			chamar();
		}
		*/
		chamar();

	}
	
	public static void chamar() {
		System.out.println(Classe.getQtdade());
	}

}
