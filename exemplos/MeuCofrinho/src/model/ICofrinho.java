package model;

import java.util.Map;

public interface ICofrinho {

	/**
	 * Método insere uma moeda no cofrinho.
	 * @param moeda
	 */
	public abstract void insereMoeda(Moeda moeda);
	
	/**
	 * Método informa a quantidade de moedas do tipo passado como argumento que estão
	 * no cofrinho no momento.
	 * 
	 * @param moeda -> Moeda que será contada no cofrinho
	 * @return quantidade de moedas iguais as passadas por argumento. Se não houver moeda retorna zero.
	 */
	public abstract int quantasMoedas(Moeda moeda);
	
	/**
	 * Método retorna o valor em Reais do cofrinho de uma moeda passada como argumento.
	 * @param moeda
	 * @return
	 */
	public abstract double valorMoeda(Moeda moeda);
	
	/**
	 * Retorna o valor em Reais armazenado no cofrinho.
	 * @return
	 */
	public abstract double totalNoCofrinho();
	
	/**
	 * Quebrar o cofrinho é jogar todas as moedas para fora e destruir os valores armazenados. 
	 * O Cofrinho volta ao valor inicial, ou seja, fica zerado sem moedas.
	 * Método retorna um Map com as Moedas armazenadas e a quantidade de cada Moeda. 
	 * @return
	 */
	public abstract Map<Moeda, Integer> quebrarCofrinho();
	
	
}
