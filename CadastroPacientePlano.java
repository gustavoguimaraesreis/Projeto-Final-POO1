package InterfaceGrafica;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPacientePlano extends JFrame {

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

	public CadastroPacientePlano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(Color.GRAY, 2));
		panel.setBounds(10, 11, 581, 475);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//tratador dos botões
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("Cadastro de Paciente com Plano De Sa\u00FAde");
		lblNewLabel.setBounds(173, 7, 258, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Formul\u00E1rio de Cadastro");
		lblNewLabel_1.setBounds(133, 31, 179, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(24, 61, 49, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF: ");
		lblNewLabel_3.setBounds(24, 83, 49, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento: ");
		lblNewLabel_4.setBounds(24, 119, 133, 14);
		panel.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Masculino");
		chckbxNewCheckBox.setBounds(58, 171, 99, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Femino");
		chckbxNewCheckBox_1.setBounds(58, 196, 99, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo: ");
		lblNewLabel_5.setBounds(35, 150, 49, 14);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(71, 58, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 80, 96, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 116, 96, 20);
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
		textField_3.setBounds(441, 80, 96, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(441, 116, 96, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(441, 150, 96, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(441, 185, 96, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Cidade: ");
		lblNewLabel_12.setBounds(370, 219, 49, 14);
		panel.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(441, 216, 96, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("CEP: ");
		lblNewLabel_13.setBounds(382, 260, 49, 14);
		panel.add(lblNewLabel_13);
		
		textField_8 = new JTextField();
		textField_8.setBounds(441, 257, 96, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(334, 33, 227, 267);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Endere\u00E7o");
		lblNewLabel_6.setBounds(90, 5, 65, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_11 = new JLabel("Complemento: ");
		lblNewLabel_11.setBounds(10, 156, 91, 14);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_14 = new JLabel("Data de Ingresso: ");
		lblNewLabel_14.setBounds(24, 322, 120, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Per\u00EDodo de Car\u00EAncia: ");
		lblNewLabel_15.setBounds(24, 360, 133, 14);
		panel.add(lblNewLabel_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBounds(12, 245, 300, 150);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Dados do Plano");
		lblNewLabel_16.setBounds(111, 5, 92, 14);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_10 = new JLabel("N\u00FAmero da Carteirinha: ");
		lblNewLabel_10.setBounds(10, 35, 143, 14);
		panel_2.add(lblNewLabel_10);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(152, 112, 30, 23);
		panel_2.add(chckbxNewCheckBox_2);
		
		textField_9 = new JTextField();
		textField_9.setBounds(152, 32, 96, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(152, 76, 96, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(90, 425, 89, 23);
		panel.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(382, 425, 89, 23);
		btnVoltar.addActionListener(tratador);
		panel.add(btnVoltar);
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnVoltar) {
				PaginaInicial frame = new PaginaInicial();
				frame.setVisible(true);
			}
			CadastroPacientePlano.this.dispose();
		}
	}
}
