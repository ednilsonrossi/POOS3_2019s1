
public class Classe {
	private static int qtdade = 0;
	private String qqCoisa;
	
	public Classe(String qqCoisa) {
		this.qqCoisa = qqCoisa;
		this.qtdade += 1;
	}
	
	public static String getQqCoisa() {
		return qqCoisa;
	}
	
	public static int getQtdade() {
		return qtdade;
	}

}
