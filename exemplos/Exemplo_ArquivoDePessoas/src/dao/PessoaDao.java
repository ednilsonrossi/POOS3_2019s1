package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class PessoaDao {

	private File arquivo;
	
	public PessoaDao() {
		this.arquivo = new File("/home/ednilson/Desktop/dados.dat");
	}
	
	public void insere(Pessoa p) throws IOException {
		if(p != null) {
			FileWriter fileWriter = null;
			BufferedWriter bufferedWriter = null;
			
			fileWriter = new FileWriter(this.arquivo, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(p.toString());
			bufferedWriter.newLine();
			bufferedWriter.close();
		}
	}
	
	public List<Pessoa> recuperaTodos() throws IOException{
		FileReader fileReader;
		BufferedReader bufferedReader;
		
		List<Pessoa> pessoas = new ArrayList<>();
		String linha;
		
		fileReader = new FileReader(this.arquivo);
		bufferedReader = new BufferedReader(fileReader);
		while( (linha = bufferedReader.readLine()) != null ) {
			pessoas.add(Pessoa.fromString(linha));
		}
		bufferedReader.close();
		return pessoas;
	}
}
