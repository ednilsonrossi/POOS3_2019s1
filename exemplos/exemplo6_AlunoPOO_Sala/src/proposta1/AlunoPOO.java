package proposta1;

public class AlunoPOO {
	private int prontuario;
	private String nome;
	
	private float p1;
	private float p2; 
	private float lp;
	private float ex;
	private float pf;
	
	private int pesoP1;
	private int pesoP2;
	private int pesoLp;
	private int pesoEx;
	private int pesoPf;
	
	public AlunoPOO() {
		setP1(0);
		setP2(0);
		setLp(0);
		setEx(0);
		setPf(0);
		inicializaPesos();
	}
	
	public AlunoPOO(int prontuario, String nome, float p1, float p2, float lp, float ex, float pf) {
		this.prontuario = prontuario;
		this.nome = nome;
		
		setP1(p1);
		setP2(p2);
		setLp(lp);
		setEx(ex);
		setPf(pf);
		
		inicializaPesos();
	}
	
	private void inicializaPesos() {
		pesoP1 = 25;
		pesoP2 = 20;
		pesoLp = 10;
		pesoEx = 25;
		pesoPf = 20;
	}

	public float getNcc() {
		float ncc;
		ncc = p1 * pesoP1 / 100;
		ncc += p2 * pesoP2 / 100;
		ncc += lp * pesoLp / 100;
		ncc += ex * pesoEx / 100;
		ncc += pf * pesoPf / 100;
		return ncc;
	}
	
	public boolean faraIfa() {
		boolean saida = false;
		float ncc = getNcc();
		if( ncc >= 4 && ncc < 6 ) {
			saida = true;
		}
		return saida;
	}
	
	public int getProntuario() {
		return prontuario;
	}

	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public float getP1() {
		return p1;
	}

	public void setP1(float p1) {
		this.p1 = validaNota(p1);
	}

	public float getP2() {
		return p2;
	}

	public void setP2(float p2) {
		this.p2 = validaNota(p2);
	}

	public float getLp() {
		return lp;
	}

	public void setLp(float lp) {
		this.lp = validaNota(lp);
	}

	public float getEx() {
		return ex;
	}

	public void setEx(float ex) {
		this.ex = validaNota(ex);
	}

	public float getPf() {
		return pf;
	}

	public void setPf(float pf) {
		this.pf = validaNota(pf);
	}

	public int getPesoP1() {
		return pesoP1;
	}

	public void setPesoP1(int pesoP1) {
		this.pesoP1 = pesoP1;
	}

	public int getPesoP2() {
		return pesoP2;
	}

	public void setPesoP2(int pesoP2) {
		this.pesoP2 = pesoP2;
	}

	public int getPesoLp() {
		return pesoLp;
	}

	public void setPesoLp(int pesoLp) {
		this.pesoLp = pesoLp;
	}

	public int getPesoEx() {
		return pesoEx;
	}

	public void setPesoEx(int pesoEx) {
		this.pesoEx = pesoEx;
	}

	public int getPesoPf() {
		return pesoPf;
	}

	public void setPesoPf(int pesoPf) {
		this.pesoPf = pesoPf;
	}
	
	private float validaNota(float n) {
		return n >= 0 && n <= 10 ? n : 0;
	}
	
}
