package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PaginaInicial extends JFrame {

	private JPanel contentPane;
	private JButton cadastro, btnBuscar, btnRemover;

	public PaginaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//tratador dos botões;
		TrataBotoes tratador = new TrataBotoes();

		cadastro = new JButton("Cadastrar");
		cadastro.addActionListener(tratador);
		cadastro.setBounds(33, 129, 89, 23);
		contentPane.add(cadastro);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(155, 129, 89, 23);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(tratador);

		btnRemover = new JButton("Remover");
		btnRemover.setBounds(294, 129, 89, 23);
		contentPane.add(btnRemover);
		btnBuscar.addActionListener(tratador);

		JLabel lblNewLabel = new JLabel("Opções do Sistema");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(126, 24, 189, 32);
		contentPane.add(lblNewLabel);
	}
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//if(e.getSource() == cadastro) {
			//	Cadastro frame = new Cadastro();
			//	frame.setVisible(true);
			if(e.getSource() == btnBuscar){
				Buscar page = new Buscar();
				page.setVisible(true);
			}
			dispose();
		}
	}

}
