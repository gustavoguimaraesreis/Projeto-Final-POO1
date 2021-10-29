package InterfaceGrafica;

import Codigo.ServicosExtras;
import Codigo.DadosServicosExtras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class CadastroServicoExtra extends JFrame {

	private JPanel contentPane;
	private JTextField textField_nome;
	private JTextField textField_tipo;
	private JTextField textField_valor;
	private JButton btnEnviar;
	private JButton btnVoltar;

	
	public CadastroServicoExtra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//tratador dos botoes:
		TrataBotoes tratador = new TrataBotoes();
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(10, 40, 400, 216);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do servi\u00E7o: ");
		lblNewLabel_1.setBounds(77, 11, 110, 14);
		panel.add(lblNewLabel_1);
		
		textField_nome = new JTextField();
		textField_nome.setBounds(197, 8, 96, 20);
		panel.add(textField_nome);
		textField_nome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo: ");
		lblNewLabel_2.setBounds(77, 50, 64, 14);
		panel.add(lblNewLabel_2);
		
		textField_tipo = new JTextField();
		textField_tipo.setBounds(197, 47, 96, 20);
		panel.add(textField_tipo);
		textField_tipo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Valor Cobrado pela Cl\u00EDnica: ");
		lblNewLabel_3.setBounds(25, 98, 162, 14);
		panel.add(lblNewLabel_3);
		
		textField_valor = new JTextField();
		textField_valor.setBounds(197, 95, 96, 20);
		panel.add(textField_valor);
		textField_valor.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(79, 267, 89, 23);
		btnEnviar.addActionListener(tratador);
		contentPane.add(btnEnviar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setBounds(292, 267, 89, 23);
        btnVoltar.addActionListener(tratador);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("Adicicionar Servi\u00E7o Extra");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(126, 4, 167, 25);
		contentPane.add(lblNewLabel);
	}
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnVoltar) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
				dispose();
			}
			if(e.getSource() == btnEnviar) {
				String nome = textField_nome.getText();
				String tipo = textField_tipo.getText();
				float valor = Float.parseFloat(textField_valor.getText());
				
				ServicosExtras se = new ServicosExtras(nome, tipo, valor);
				DadosServicosExtras.cadastrar(se);
				
                JOptionPane.showMessageDialog(null, "Serviço Extra Cadastrado com Sucesso!", "Cadastro", JOptionPane.PLAIN_MESSAGE);

				PaginaInicial frame = new PaginaInicial();
				frame.setVisible(true);
				dispose();
			}
		}
	}
}
