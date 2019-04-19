package dao;


import java.util.ArrayList;
import java.util.List;

import model.Operador;

public class OperadorDAO implements Icrud<Operador>{

	private static OperadorDAO instance;
	private List<Operador> operadores;
	
	private OperadorDAO() {
		operadores = new ArrayList<>(10);
	}
	
	public static OperadorDAO getInstance() {
		if(instance == null) {
			instance = new OperadorDAO();
		}
		return instance;
	}
	
	@Override
	public boolean create(Operador obj) {
		boolean deuCerto = false;
		if(obj != null) {
			if( !operadores.contains(obj) ) {
				operadores.add(obj);
				deuCerto = true;
			}
		}
		return deuCerto;
	}
	
	@Override
	public Operador recuperate(String key) {
		
		for(Operador obj : operadores) {
			if(obj.getUsername().equals(key)) {
				return obj;
			}
		}
		return null;
	}
	
	@Override
	public Operador recuperate(int key) {
		if(key >= 0 && key < operadores.size()) {
			return operadores.get(key);
		}
		return null;
	}
	
	@Override
	public boolean update(Operador obj) {
		Operador antigo;
		boolean deuCerto = false;
		if(obj != null) {
			antigo = recuperate(obj.getUsername());
			if(antigo != null) {
				antigo.setPermissao(obj.getPermissao());
				antigo.setSenha(obj.getSenha());
				antigo.setUsername(obj.getUsername());
				deuCerto = true;
			}
		}
		return deuCerto;
	}
	
	@Override
	public boolean delete(Operador obj) {
		boolean deuCerto = false;
		if(obj != null) {
			return operadores.remove(obj);
		}
		return deuCerto;
	}
	
	public int size() {
		return operadores.size();
	}
	
	
	
}
