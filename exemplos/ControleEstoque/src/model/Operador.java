package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Operador{
	private static final int INPUT_OUTPUT 	= 0;
	private static final int INPUT 			= 1;
	private static final int OUTPUT			= 2;
	private final String ALGORITMO 			= "MD5";
	
	private String username;
	private String senha;
	private int permissao;
	
	public Operador(String username, String senha, int permissao){
		super();
		this.setUsername(username);
		this.setSenha(senha);
		this.setPermissao(permissao);
	}
	
	@Override
	public boolean equals(Object obj) {
		Operador op;
		boolean iguais = false;
		if(obj != null && obj instanceof Operador) {
			op = (Operador) obj;
			if(this.username.equals(op.username)) {
				iguais = true;
			}
		}
		return iguais;
	}

	private String geraSenha(String input){
		StringBuilder sb = new StringBuilder();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());
			byte[] digest = md.digest();
			for(byte b : digest){
				sb.append(String.format("%02x", b & 0xff));
			}
		}catch (Exception e){
			sb = new StringBuilder();
		}
		return sb.toString();
	}
	/*
	private final String geraSenha(String txt) {
		String retorno = "";
		try {
			final MessageDigest md = MessageDigest.getInstance(ALGORITMO);
			final byte[] hash = md.digest(txt.getBytes());
			retorno =  hash.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return retorno;
	}
	*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username.toLowerCase();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = geraSenha(senha);
	}

	public int getPermissao() {
		return permissao;
	}

	public void setPermissao(int permissao) {
		if(permissao >= INPUT_OUTPUT && permissao < OUTPUT) {
			this.permissao = permissao;
		}else {
			this.permissao = INPUT;
		}
	}

	@Override
	public String toString() {
		String txt = username + " | ";
		switch (permissao) {
		case 0:
			txt += "I/O";
			break;
		case 1:
			txt += "I";
			break;
		case 2: 
			txt += "O";
			break;
		}
		return txt;
	}
	
	public boolean autenticar(Operador another) {
		boolean autenticated = false;
		if(this.username.equals(another.username) && this.senha.equals(another.senha) ) {
			autenticated = true;
		}
		return autenticated;
	}
	
	
}
