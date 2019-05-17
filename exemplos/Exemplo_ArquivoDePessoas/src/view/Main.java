package view;

import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.PessoaDao;
import model.Pessoa;

public class Main {

	public static void main(String[] args) throws IOException{
		Pessoa pessoa;
		PessoaDao pessoaDao = new PessoaDao();
		String name;
		int document;
		
		do {
			name = JOptionPane.showInputDialog("Nome: ");
			document = Integer.parseInt(JOptionPane.showInputDialog("Documento"));
			pessoa = new Pessoa(name, document);
			pessoaDao.insere(pessoa);
		}while(JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "POOS3", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION);

		List<Pessoa> lista = pessoaDao.recuperaTodos();
		
		for(Pessoa p : lista) {
			System.out.println(p.toString());
		}
	}

}
