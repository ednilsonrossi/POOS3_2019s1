package proposta2;

public class AlunoBD1 extends Aluno{

	private float n1, n2;

	public AlunoBD1() {
		super();
		setN1(0);
		setN2(0);
	}
	
	public AlunoBD1(int prontuario, String nome, float n1, float n2) {
		super(prontuario, nome);
		setN1(n1);
		setN2(n2);
	}

	
	
	@Override
	public float getNcc() {
		float ncc;
		ncc = (n1 + n2) / 2;
		return ncc;
	}
	

	public float getN1() {
		return n1;
	}



	public void setN1(float n1) {
		this.n1 = n1 >= 0 && n1 <= 10 ? n1 : 0;
	}



	public float getN2() {
		return n2;
	}



	public void setN2(float n2) {
		this.n2 = n2 >= 0 && n2 <= 10 ? n2 : 0;
	}
	
	
	
	
}
