package controler;

import dao.OperadorDAO;
import model.Operador;

public final class OperadorController {

	public static boolean novoOperador(String username, String senha, int permissao) {
		OperadorDAO dao = OperadorDAO.getInstance();
		Operador novo = new Operador(username, senha, permissao);
		return dao.create(novo);
	}
	
	public static String[] todosOperadores() {
		OperadorDAO dao = OperadorDAO.getInstance();
		String[] usernames = new String[dao.size()];
		for(int i=0; i < dao.size(); i++) {
			usernames[i] = dao.recuperate(i).toString();
		}
		return usernames;
	}
	
	public static Operador autenticar(String username, String senha) {
		Operador op, another;
		op = OperadorDAO.getInstance().recuperate(username);
		if(op != null) {
			another = new Operador(username, senha, 0);
			if(op.autenticar(another)) {
				return op;
			}
		}
		return null;
	}
}
