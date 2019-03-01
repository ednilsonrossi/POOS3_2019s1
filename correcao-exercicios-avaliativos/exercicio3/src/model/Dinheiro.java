package model;

public class Dinheiro {
	public static final int POSITIVO = 1;
	public static final int NEGATIVO = 0;
	private long valor;
	private boolean positivo;
	
	
	public Dinheiro(int inteiro, int decimal) {
		init(inteiro, decimal);
		positivo = true;
	}
	
	public Dinheiro(int inteiro, int decimal, int sinal) {
		init(inteiro, decimal);
		positivo = sinal == NEGATIVO ? false : true;
	}
	
	private void init(int inteiro, int decimal) {
		inteiro = Math.abs(inteiro);
		decimal = Math.abs(decimal);
		this.valor = inteiro * 100;
		
		if(decimal > 99) {
			decimal = decimal % 100;
		}
		this.valor += decimal;
	}
	
	public double getValor() {
		double value;
		value = getDecimal() / 100.0;
		value += getInteiro();
		return value;
	}
	
	private int getInteiro() {
		return (int) valor / 100;
	}
	
	private int getDecimal() {
		return (int) valor % 100;
	}
	
	@Override
	public String toString() {
		return positivo ? toStringPositivo() : toStringNegativo();
	}
	
	public String toStringPositivo() {
		StringBuilder sb = new StringBuilder();
		sb.append(getInteiro());
		sb.append(".");
		if(getDecimal() < 10) {
			sb.append("0");
		}
		sb.append(getDecimal());
		return sb.toString();
	}
	
	public String toStringNegativo() {
		StringBuilder sb = new StringBuilder();
		sb.append("(-");
		sb.append(toStringPositivo());
		sb.append(")");
		return sb.toString();
	}
	
	public Dinheiro soma(Dinheiro o) {
		long somatorio;
		Dinheiro retorno;
		
		if(this.positivo == o.positivo) {
			somatorio = this.valor + o.valor;
			retorno = new Dinheiro((int)somatorio/100, (int)somatorio%100, this.positivo?POSITIVO:NEGATIVO);
		}else {
			somatorio = this.valor - o.valor;
			int sinal;
			if(this.valor > o.valor) {
				sinal = this.positivo ? POSITIVO : NEGATIVO;
			}else {
				sinal = o.positivo ? POSITIVO : NEGATIVO;
			}
			retorno = new Dinheiro((int)somatorio/100, (int)somatorio%100, sinal);
		}
			
		
		return retorno;
	}
	
	public Dinheiro subtrai(Dinheiro o) {
		if(o.positivo) {
			o.positivo = false;
		}else {
			o.positivo = true;
		}
		return this.soma(o);
	}
}
