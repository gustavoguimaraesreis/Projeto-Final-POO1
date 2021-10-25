package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class CadastroMedico extends JFrame {

	private JPanel contentPane;
	private JButton btnVoltar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	
	public CadastroMedico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(Color.GRAY, 2));
		panel.setBounds(10, 11, 666, 741);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//tratador dos botões
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("Cadastro de M\u00E9dico");
		lblNewLabel.setBounds(245, 11, 119, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(24, 61, 49, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF: ");
		lblNewLabel_3.setBounds(24, 103, 49, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento: ");
		lblNewLabel_4.setBounds(24, 147, 133, 14);
		panel.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Masculino");
		chckbxNewCheckBox.setBounds(58, 193, 99, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Femino");
		chckbxNewCheckBox_1.setBounds(58, 219, 99, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo: ");
		lblNewLabel_5.setBounds(44, 172, 49, 14);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(71, 58, 220, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 100, 220, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 147, 96, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Rua: ");
		lblNewLabel_7.setBounds(382, 83, 49, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("N\u00FAmero: ");
		lblNewLabel_8.setBounds(370, 119, 61, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bairro: ");
		lblNewLabel_9.setBounds(370, 150, 49, 14);
		panel.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBounds(441, 80, 179, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(441, 116, 179, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(441, 150, 179, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(441, 185, 179, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Cidade: ");
		lblNewLabel_12.setBounds(370, 219, 49, 14);
		panel.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(441, 216, 179, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("CEP: ");
		lblNewLabel_13.setBounds(382, 260, 49, 14);
		panel.add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(441, 257, 179, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(301, 33, 342, 267);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Endere\u00E7o");
		lblNewLabel_6.setBounds(134, 11, 65, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_11 = new JLabel("Complemento: ");
		lblNewLabel_11.setBounds(25, 155, 91, 14);
		panel_1.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(44, 707, 89, 23);
		panel.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(441, 707, 89, 23);
		btnVoltar.addActionListener(tratador);
		panel.add(btnVoltar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBounds(301, 352, 342, 191);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Data de admiss\u00E3o na Cl\u00EDnica: ");
		lblNewLabel_14.setBounds(29, 66, 186, 14);
		panel_2.add(lblNewLabel_14);
		
		textField_9 = new JTextField();
		textField_9.setBounds(236, 63, 96, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("N\u00FAmero da Carteira de Trabalho:");
		lblNewLabel_15.setBounds(29, 97, 195, 14);
		panel_2.add(lblNewLabel_15);
		
		textField_10 = new JTextField();
		textField_10.setBounds(236, 94, 96, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Usu\u00E1rio: ");
		lblNewLabel_16.setBounds(125, 128, 72, 14);
		panel_2.add(lblNewLabel_16);
		
		textField_11 = new JTextField();
		textField_11.setBounds(236, 125, 96, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Senha: ");
		lblNewLabel_17.setBounds(135, 159, 72, 14);
		panel_2.add(lblNewLabel_17);
		
		textField_12 = new JTextField();
		textField_12.setBounds(236, 156, 96, 20);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Dados do funcin\u00E1rio");
		lblNewLabel_10.setBounds(111, 23, 127, 14);
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBounds(24, 270, 219, 426);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("Dados da Profiss\u00E3o: ");
		lblNewLabel_18.setBounds(47, 11, 146, 14);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("CRM: ");
		lblNewLabel_19.setBounds(10, 42, 49, 14);
		panel_3.add(lblNewLabel_19);
		
		textField_13 = new JTextField();
		textField_13.setBounds(60, 67, 96, 20);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Valor da consulta (privado): ");
		lblNewLabel_20.setBounds(10, 98, 173, 14);
		panel_3.add(lblNewLabel_20);
		
		textField_14 = new JTextField();
		textField_14.setBounds(60, 131, 96, 20);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Valor da Consulta (plano): ");
		lblNewLabel_21.setBounds(10, 174, 173, 14);
		panel_3.add(lblNewLabel_21);
		
		textField_15 = new JTextField();
		textField_15.setBounds(60, 210, 96, 20);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Especialidade(s): ");
		lblNewLabel_22.setBounds(10, 254, 146, 14);
		panel_3.add(lblNewLabel_22);
		
		textField_16 = new JTextField();
		textField_16.setBounds(60, 290, 96, 20);
		panel_3.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("Planos de Sa\u00FAde atendidos: ");
		lblNewLabel_23.setBounds(10, 340, 183, 14);
		panel_3.add(lblNewLabel_23);
		
		textField_17 = new JTextField();
		textField_17.setBounds(60, 381, 96, 20);
		panel_3.add(textField_17);
		textField_17.setColumns(10);
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnVoltar) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
			}
			CadastroMedico.this.dispose();
		}
	}
}