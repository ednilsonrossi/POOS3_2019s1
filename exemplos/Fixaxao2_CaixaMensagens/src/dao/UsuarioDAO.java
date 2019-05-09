package dao;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioDAO implements Icrud<Usuario>{
	
	private List<Usuario> usuarios;
	private static UsuarioDAO instance;
	
	private UsuarioDAO() {
		usuarios = new ArrayList<Usuario>(20);
	}
	
	public UsuarioDAO getInstance() {
		if(instance == null) {
			instance = new UsuarioDAO();
		}
		return instance;
	}

	@Override
	public boolean create(Usuario obj) {
		boolean deuCerto = false;
		if(!usuarios.contains(obj)) {
			usuarios.add(obj);
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public Usuario recuperate(String key) {
		Usuario u;
		String login;
		for(Usuario obj : usuarios) {
			login = String.valueOf(obj.getLogin());
			if(login == key) {
				return obj;
			}
		}
		return null;
	}

	@Override
	public Usuario recuperate(int key) {
		Usuario u;
		for(Usuario obj : usuarios) {
			if(obj.getLogin() == key) {
				return obj;
			}
		}
		return null;
	}

	@Override
	public boolean update(Usuario obj) {
		Usuario user;
		boolean deuCerto = false;
		user = recuperate(obj.getLogin());
		if(user != null) {
			user.setNome(obj.getNome());
			user.setSenha(obj.getSenha());
			deuCerto = true;
		}
		return deuCerto;
	}

	@Override
	public boolean delete(Usuario obj) {
		Usuario user;
		boolean deuCerto = false;
		user = recuperate(obj.getLogin());
		if(user != null) {
			usuarios.remove(user);
			deuCerto = true;
		}
		return deuCerto;
	}

	
}
