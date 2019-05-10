package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Cofrinho implements ICofrinho{
	private Collection<Moeda> moedas;
	
	public Cofrinho() {
		super();
		moedas = new LinkedList<Moeda>();
	}

	@Override
	public void insereMoeda(Moeda moeda) {
		if(moeda != null) {
			moedas.add(moeda);
		}
	}

	@Override
	public int quantasMoedas(Moeda moeda) {
		int contador=0;
		if(moeda != null) {
			for(Moeda coin : moedas) {
				if(coin.equals(moeda)) {
					contador += 1;
				}
			}
		}
		return contador;
	}

	@Override
	public double valorMoeda(Moeda moeda) {
		int coins = quantasMoedas(moeda);
		return coins * moedaValue(moeda);
	}

	@Override
	public double totalNoCofrinho() {
		double soma=0;
		soma += valorMoeda(new UmReal());
		soma += valorMoeda(new Cinquenta());
		soma += valorMoeda(new VinteCinco());
		soma += valorMoeda(new Dez());
		soma += valorMoeda(new Cinco());
		soma += valorMoeda(new Um());
		return soma;
	}

	@Override
	public Map<Moeda, Integer> quebrarCofrinho() {
		Map<Moeda, Integer> retorno = new HashMap<Moeda, Integer>();
		
		retorno.put(new UmReal(), quantasMoedas(new UmReal()));
		retorno.put(new Cinquenta(), quantasMoedas(new Cinquenta()));
		retorno.put(new VinteCinco(), quantasMoedas(new VinteCinco()));
		retorno.put(new Dez(), quantasMoedas(new Dez()));
		retorno.put(new Cinco(), quantasMoedas(new Cinco()));
		retorno.put(new Um(), quantasMoedas(new Um()));
		
		moedas.clear();
		
		return retorno;
	}
	
	private double moedaValue(Moeda moeda) {
		
		if(moeda instanceof UmReal)
			return 1.0;
		else
			if(moeda instanceof Cinquenta)
				return 0.50;
			else
				if(moeda instanceof VinteCinco)
					return 0.25;
				else
					if(moeda instanceof Dez)
						return 0.10;
					else
						if (moeda instanceof Cinco)
							return 0.05;
						else
							if(moeda instanceof Um)
								return 0.01;
		
		return 0;
	}
}
