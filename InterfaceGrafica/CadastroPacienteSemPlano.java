package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.PacienteSemPlano;


public class CadastroPacienteSemPlano extends JFrame {

	private JPanel contentPane;
	private JButton btnEnviar;
	private JButton btnVoltar;
	private static JTextField textField_name;
	private static JTextField textField_CPF;
	private static JTextField textField_RG;
	private static JTextField textField_dtNasc;
	private JCheckBox checkBox_masculino;
	private JCheckBox checkBox_feminino;
	private JCheckBox checkBox_solteiro;
	private JCheckBox checkBox_casado;
	private JCheckBox checkBox_divorciado;
	private static JTextField textField_rua;
	private static JTextField textField_numero;
	private static JTextField textField_bairro;
	private static JTextField textField_comp;
	private static JTextField textField_cidade;
	private static JTextField textField_CEP;
	private static JTextField textField_desconto;

	private String CheckBox;
	private String CheckBox_EstadoCivil;
	private String dtCadastro = "hoje";
	private String dtUltimaConsulta = "ainda não fez nenhuma consulta";
	private JLabel lblNewLabel_14;
	

	public CadastroPacienteSemPlano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(Color.GRAY, 2));
		panel.setBounds(10, 11, 581, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//tratador dos botões
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("Cadastro de Paciente sem Plano de Sa\u00FAde");
		lblNewLabel.setBounds(173, 7, 258, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(24, 80, 49, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF: ");
		lblNewLabel_3.setBounds(24, 118, 49, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento: ");
		lblNewLabel_4.setBounds(24, 200, 133, 14);
		panel.add(lblNewLabel_4);
		
		checkBox_masculino = new JCheckBox("Masculino");
		checkBox_masculino.setBounds(58, 251, 99, 23);
		panel.add(checkBox_masculino);
		
		checkBox_feminino = new JCheckBox("Femino");
		checkBox_feminino.setBounds(58, 277, 99, 23);
		panel.add(checkBox_feminino);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo: ");
		lblNewLabel_5.setBounds(24, 230, 49, 14);
		panel.add(lblNewLabel_5);
		
		textField_name = new JTextField();
		textField_name.setBounds(117, 77, 146, 20);
		panel.add(textField_name);
		textField_name.setColumns(10);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(117, 115, 146, 20);
		panel.add(textField_CPF);
		textField_CPF.setColumns(10);
		
		textField_dtNasc = new JTextField();
		textField_dtNasc.setBounds(167, 197, 96, 20);
		panel.add(textField_dtNasc);
		textField_dtNasc.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Rua: ");
		lblNewLabel_7.setBounds(382, 83, 49, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("N\u00FAmero: ");
		lblNewLabel_8.setBounds(370, 119, 61, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Bairro: ");
		lblNewLabel_9.setBounds(370, 150, 49, 14);
		panel.add(lblNewLabel_9);
		
		textField_rua = new JTextField();
		textField_rua.setBounds(441, 80, 96, 20);
		panel.add(textField_rua);
		textField_rua.setColumns(10);
		
		textField_numero = new JTextField();
		textField_numero.setBounds(441, 116, 96, 20);
		panel.add(textField_numero);
		textField_numero.setColumns(10);
		
		textField_bairro = new JTextField();
		textField_bairro.setBounds(441, 150, 96, 20);
		panel.add(textField_bairro);
		textField_bairro.setColumns(10);
		
		textField_comp = new JTextField();
		textField_comp.setBounds(441, 185, 96, 20);
		panel.add(textField_comp);
		textField_comp.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Cidade: ");
		lblNewLabel_12.setBounds(370, 219, 49, 14);
		panel.add(lblNewLabel_12);
		
		textField_cidade = new JTextField();
		textField_cidade.setBounds(441, 216, 96, 20);
		panel.add(textField_cidade);
		textField_cidade.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("CEP: ");
		lblNewLabel_13.setBounds(382, 260, 49, 14);
		panel.add(lblNewLabel_13);
		
		textField_CEP = new JTextField();
		textField_CEP.setBounds(441, 257, 96, 20);
		panel.add(textField_CEP);
		textField_CEP.setColumns(10);
		
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
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(36, 465, 89, 23);
		panel.add(btnEnviar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(441, 440, 89, 23);
		btnVoltar.addActionListener(tratador);
		panel.add(btnVoltar);
		
		JLabel lblNewLabel_10 = new JLabel("Desconto: ");
		lblNewLabel_10.setBounds(334, 329, 72, 14);
		panel.add(lblNewLabel_10);
		
		textField_desconto = new JTextField();
		textField_desconto.setBounds(441, 326, 96, 20);
		panel.add(textField_desconto);
		textField_desconto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Estado Civil: ");
		lblNewLabel_1.setBounds(24, 329, 87, 14);
		panel.add(lblNewLabel_1);
		
		checkBox_solteiro = new JCheckBox("Solteiro");
		checkBox_solteiro.setBounds(58, 358, 99, 23);
		panel.add(checkBox_solteiro);
		
		checkBox_casado = new JCheckBox("Casado");
		checkBox_casado.setBounds(58, 396, 99, 23);
		panel.add(checkBox_casado);
		
		checkBox_divorciado = new JCheckBox("Divorciado");
		checkBox_divorciado.setBounds(58, 422, 99, 23);
		panel.add(checkBox_divorciado);
		
		lblNewLabel_14 = new JLabel("RG: ");
		lblNewLabel_14.setBounds(24, 163, 49, 14);
		panel.add(lblNewLabel_14);
		
		textField_RG = new JTextField();
		textField_RG.setBounds(117, 160, 146, 20);
		panel.add(textField_RG);
		textField_RG.setColumns(10);
	}
	private class TrataCheckBox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(checkBox_masculino.isSelected())
				CheckBox = "Masculino";
			if(checkBox_feminino.isSelected())
				CheckBox = "Feminino";
			if(checkBox_solteiro.isSelected())
				CheckBox_EstadoCivil = "Solteiro";
			if(checkBox_casado.isSelected())
				CheckBox_EstadoCivil = "Casado";
			if(checkBox_divorciado.isSelected())
				CheckBox_EstadoCivil = "Divorciado";	
		}
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnVoltar) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
			}
			if(e.getSource() == btnEnviar) {
				String nome = CadastroPacienteSemPlano.textField_name.getText();
				String cpf = CadastroPacienteSemPlano.textField_CPF.getText();
				String rg = CadastroPacienteSemPlano.textField_RG.getText();
				String dtNasc = CadastroPacienteSemPlano.textField_dtNasc.getText();
				String desconto = CadastroPacienteSemPlano.textField_desconto.getText();
				String rua = CadastroPacienteSemPlano.textField_rua.getText();
				String numero = CadastroPacienteSemPlano.textField_numero.getText();
				String bairro = CadastroPacienteSemPlano.textField_bairro.getText();
				String comp = CadastroPacienteSemPlano.textField_comp.getText();
				String cidade = CadastroPacienteSemPlano.textField_cidade.getText();
				String cep = CadastroPacienteSemPlano.textField_CEP.getText();
				
				PacienteSemPlano p = new PacienteSemPlano(nome, cpf, rg, CheckBox, CheckBox_EstadoCivil,
										dtNasc, dtCadastro, dtUltimaConsulta, desconto, 0.00f);
				
				Codigo.DadosPacientes.cadastrar(p);
				
				
			}
			CadastroPacienteSemPlano.this.dispose();
		}
	}
}

