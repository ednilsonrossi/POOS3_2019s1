package model;

import java.security.MessageDigest;

public class Usuario {
	//private final String ALGORITMO = "MD2";
	//private final String ALGORITMO = "SHA-1";
	//private final String ALGORITMO = "SHA-256";
	//private final String ALGORITMO = "SHA-512";
	private final String ALGORITMO = "MD5";
	
	private int login;
	private String senha;
	private String nome;
	
	public Usuario(int login, String senha, String nome) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		Usuario u;
		boolean iguais = false;
		if(obj != null && obj instanceof Usuario) {
			u = (Usuario) obj;
			if(this.login == u.login) {
				iguais = true;
			}
		}
		return iguais;
	}

	public boolean autenticar(int login, String senha) {
		boolean autenticado = false;
		
		if(this.login == login && this.senha == senha) {
			autenticado = true;
		}
		
		return autenticado;
	}
	
	private final String criptografia(String txt) {
		 
		try {
		  final MessageDigest md = MessageDigest.getInstance("MD5");
		  final byte[] hash = md.digest(toBeHashed.getBytes());
		  return hash;
		} catch (NoSuchAlgorithmException e) {
		  e.printStackTrace();
		}
	}
	
	public int getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
