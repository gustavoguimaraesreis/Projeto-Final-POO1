package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PaginaInicial extends JFrame {

	private JPanel contentPane;
	private JButton cadastro, btnBuscar, btnRemover;

	public PaginaInicial() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TrataBotoes tratador = new TrataBotoes();

		cadastro = new JButton("Cadastrar");
		cadastro.setBounds(29, 66, 133, 23);
		contentPane.add(cadastro);
		cadastro.addActionListener(tratador);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(197, 66, 89, 23);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(tratador);

		btnRemover = new JButton("Remover");
		btnRemover.setBounds(328, 66, 119, 23);
		contentPane.add(btnRemover);
		btnRemover.addActionListener(tratador);

		JLabel lblNewLabel = new JLabel("Opções do Sistema");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(134, 12, 232, 23);
		contentPane.add(lblNewLabel);
	}
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastro) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
			}else if(e.getSource() == btnBuscar){
				Buscar page = new Buscar();
				page.setVisible(true);
			}
			dispose();
		}
	}
}