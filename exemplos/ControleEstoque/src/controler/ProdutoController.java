package controler;

import java.util.List;

import dao.ProdutoDAO;
import model.Operador;
import model.Produto;

public final class ProdutoController {

	public static boolean salvaProduto(int code, String description, String username, String senha) {
		Operador op = OperadorController.autenticar(username, senha);
		if(op != null) {
			ProdutoDAO dao = ProdutoDAO.getInstance();
			Produto product = new Produto(code, description);
			return dao.create(product);
		}
		return false;
	}
	
	public static String[] todosProdutos() {
		ProdutoDAO dao = ProdutoDAO.getInstance();
		String[] saida = new String[dao.size()];
		List<Produto> lista = dao.getProdutos();
		int i = 0;
		for(Produto p : lista) {
			saida[i++] = p.toString();
		}
		return saida;
	}
}
