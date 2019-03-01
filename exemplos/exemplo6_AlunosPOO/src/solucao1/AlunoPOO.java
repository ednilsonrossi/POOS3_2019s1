package solucao1;

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
	
	public AlunoPOO(int prontuario, String nome, float p1, float p2, float lp, float ex, float pf) {
		this.prontuario = prontuario;
		this.nome = nome;
		this.p1 = p1;
		this.p2 = p2;
		this.lp = lp;
		this.ex = ex;
		this.pf = pf;
		initPesos();
	}
	
	private void initPesos() {
		pesoP1 = 25;
		pesoP2 = 20;
		pesoLp = 10;
		pesoEx = 25;
		pesoPf = 20;
	}
	
	public float getNCC() {
		float ncc;
		ncc = p1 * pesoP1 / 100.0f;
		ncc += p2 * pesoP2 / 100.0f;
		ncc += lp * pesoLp / 100.0f;
		ncc += ex * pesoEx / 100.0f;
		ncc += pf * pesoPf / 100.0f;
		return ncc;
	}
	
	public boolean faraIfa() {
		boolean emIfa = false;
		float ncc = getNCC();
		if(ncc >= 4.0 && ncc < 6) {
			emIfa = true;
		}
		return emIfa;
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
		this.nome = nome;
	}
	public float getP1() {
		return p1;
	}
	public void setP1(float p1) {
		this.p1 = p1;
	}
	public float getP2() {
		return p2;
	}
	public void setP2(float p2) {
		this.p2 = p2;
	}
	public float getLp() {
		return lp;
	}
	public void setLp(float lp) {
		this.lp = lp;
	}
	public float getEx() {
		return ex;
	}
	public void setEx(float ex) {
		this.ex = ex;
	}
	public float getPf() {
		return pf;
	}
	public void setPf(float pf) {
		this.pf = pf;
	}
	public int getPesoP1() {
		return pesoP1;
	}
	public int getPesoP2() {
		return pesoP2;
	}

	public int getPesoLp() {
		return pesoLp;
	}

	public int getPesoEx() {
		return pesoEx;
	}

	public int getPesoPf() {
		return pesoPf;
	}

	
	
}
