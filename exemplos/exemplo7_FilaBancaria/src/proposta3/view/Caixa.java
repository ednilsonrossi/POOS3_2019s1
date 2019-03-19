package proposta3.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import proposta3.model.Cliente;
import proposta3.model.IFila;
import proposta3.model.IFilaPrioritaria;



public class Caixa extends JFrame {
	private JPanel painel;
	private JButton btnChamarCliente;
	private JLabel labelSenha;
	
	private IFilaPrioritaria myFila;
	private boolean ehPrioritario;
	
	public Caixa(IFilaPrioritaria fila, boolean prioritario) {
		criarComponentes();
		this.myFila = fila;
		this.ehPrioritario = prioritario;
		ajuste();
	}
	
	private void criarComponentes() {
		painel = new JPanel();
		labelSenha = new JLabel("Chame o próximo cliente");	
		btnChamarCliente = new JButton("Chamar Próximo");
		btnChamarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chamarProximo();
			}
		});
		
		painel.add(labelSenha);
		painel.add(btnChamarCliente);
		add(painel);
	}
	
	private void ajuste() {
		setVisible(true);
		if(ehPrioritario) {
			setTitle("Caixa Prioritário");
		}else {
			setTitle("Caixa Normal");
		}
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private void chamarProximo() {
		Cliente c;
		if(ehPrioritario) {
			c = myFila.saiFilaComPrioridade();
		}else {
			c = myFila.saiFila();
		}
		if(c != null)
			labelSenha.setText("Próximo: " + c.getSenha());
		else
			labelSenha.setText("Fila vazia");
	}
}
