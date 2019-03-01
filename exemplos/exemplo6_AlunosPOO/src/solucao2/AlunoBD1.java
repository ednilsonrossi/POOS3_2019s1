package solucao2;

public class AlunoBD1 extends Aluno{
	
	private float p1;
	private float p2;
	
	public AlunoBD1(int prontuario, String nome, float p1, float p2) {
		super(prontuario, nome);
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public float getNCC() {
		float ncc;
		ncc = (p1 + p2)/2;
		return ncc;
	}
	
	/*
	public boolean faraIfa() {
		boolean emIfa = false;
		float ncc = getNCC();
		if(ncc >= 4.0 && ncc < 6) {
			emIfa = true;
		}
		return emIfa;
	}
	*/
	
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
	
	
	
}
