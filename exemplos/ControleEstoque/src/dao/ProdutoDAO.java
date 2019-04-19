package dao;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDAO implements Icrud<Produto>{

	private static ProdutoDAO instance;
	private List<Produto> produtos;
	
	private ProdutoDAO() {
		produtos = new ArrayList<Produto>(1000);
	}
	
	public static ProdutoDAO getInstance() {
		if(instance == null) {
			instance = new ProdutoDAO();
		}
		return instance;
	}

	@Override
	public boolean create(Produto obj) {
		if(obj != null) {
			if(!produtos.contains(obj)) {
				produtos.add(obj);
				return true;
			}
		}
		return false;
	}

	@Override
	public Produto recuperate(String key) {
		if(key != null) {
			for(Produto p : produtos) {
				if(p.getDescricao().equals(key)) {
					return p;
				}
			}
		}
		return null;
	}

	@Override
	public Produto recuperate(int key) {
		for(Produto p : produtos) {
			if(p.getCodigo() == key) {
				return p;
			}
		}
		return null;
	}

	@Override
	public boolean update(Produto obj) {
		Produto p;
		if(obj != null) {
			p = recuperate(obj.getCodigo());
			if(p != null) {
				p.setDescricao(obj.getDescricao());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean delete(Produto obj) {
		if(obj != null) {
			return produtos.remove(obj);
		}
		return false;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public int size() {
		return produtos.size();
	}
	
}
