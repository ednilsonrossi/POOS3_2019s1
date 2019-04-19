package model;

public class Produto {
	private int codigo;
	private String descricao;
	
	public Produto(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return codigo + " | " + descricao.toUpperCase();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Produto) {
			if(this.codigo == ((Produto) obj).codigo) {
				return true;
			}
		}
		return false;
	}
}
