package proposta2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import proposta2.model.Cliente;
import proposta2.model.Fila;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RetiraSenha extends JFrame{

	private JPanel painel;
	private JLabel labelSenha;
	private JButton btnNormal;
	private JButton btnPrioridade;
	
	private Fila myFila;
	
	public RetiraSenha(Fila fila) {
		this.myFila = fila;
		criarComponentes();
		ajustes();
	}
	
	private void criarComponentes() {
		painel = new JPanel();
		labelSenha = new JLabel("Senha: ");
		btnNormal = new JButton("Normal");
		btnNormal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gerarSenha(false);
			}
		});
		
		btnPrioridade = new JButton("Prioritário");
		btnPrioridade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gerarSenha(true);
			}
		});
		
		painel.add(labelSenha);
		painel.add(btnNormal);
		painel.add(btnPrioridade);
		add(painel);
	}
	
	private void ajustes() {
		setVisible(true);
		setTitle("Retirada de senha");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private void gerarSenha(boolean prioridade) {
		Cliente c = new Cliente(myFila.proximaSenha(), prioridade);
        
		if(myFila.entraFila(c))
			labelSenha.setText(String.valueOf(c.getSenha()));
		else 
			labelSenha.setText("Senha não gerada");
	}
}
