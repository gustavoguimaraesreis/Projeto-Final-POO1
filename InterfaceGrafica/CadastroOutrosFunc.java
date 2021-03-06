package InterfaceGrafica;

import Codigo.DemaisFuncionarios;
import Codigo.Endereco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class CadastroOutrosFunc extends JFrame {

	private JPanel contentPane;
	private JButton btnVoltar;
	private JButton btnEnviar;
	private JTextField textField_name;
	private JTextField textField_CPF;
	private JTextField textField_dtNasc;
	private JCheckBox checkBox_masculino;
	private JCheckBox checkBox_feminino;
	private JTextField textField_rua;
	private JTextField textField_numero;
	private JTextField textField_bairro;
	private JTextField textField_comp;
	private JTextField textField_cidade;
	private JTextField textField_CEP;
	private JTextField textField_dtAdClinica;
	private JTextField textField_nrCarteiraTrabalho;
	private JTextField textField_usuario;
	private JTextField textField_senha;
	private JTextField textField_salarioBase;
	private JTextField textField_cargo;
	
	private String CheckBox_sexo;
	private JTextField textField_RG;
	
	public CadastroOutrosFunc() {
		setTitle("Cadastrar - Demais Funcionarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(Color.GRAY, 2));
		panel.setBounds(10, 11, 666, 652);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//tratador dos botões
		TrataBotoes tratador = new TrataBotoes();
		
		//tratador do checkbox:
		TrataCheckBox trataChBox = new TrataCheckBox();
		
		JLabel lblNewLabel = new JLabel("Cadastro de Funcion\u00E1rio");
		lblNewLabel.setBounds(245, 11, 144, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(24, 61, 49, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF: ");
		lblNewLabel_3.setBounds(24, 103, 49, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento: ");
		lblNewLabel_4.setBounds(24, 188, 133, 14);
		panel.add(lblNewLabel_4);
		
		checkBox_masculino = new JCheckBox("Masculino");
		checkBox_masculino.setBounds(58, 251, 99, 23);
		checkBox_masculino.addItemListener(trataChBox);
		panel.add(checkBox_masculino);
		
		checkBox_feminino = new JCheckBox("Feminino");
		checkBox_feminino.setBounds(58, 277, 99, 23);
		checkBox_feminino.addItemListener(trataChBox);
		panel.add(checkBox_feminino);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo: ");
		lblNewLabel_5.setBounds(24, 230, 49, 14);
		panel.add(lblNewLabel_5);
		
		textField_name = new JTextField();
		textField_name.setBounds(71, 58, 220, 20);
		panel.add(textField_name);
		textField_name.setColumns(10);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(71, 100, 220, 20);
		panel.add(textField_CPF);
		textField_CPF.setColumns(10);
		
		textField_dtNasc = new JTextField();
		textField_dtNasc.setBounds(167, 185, 124, 20);
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
		textField_rua.setBounds(441, 80, 179, 20);
		panel.add(textField_rua);
		textField_rua.setColumns(10);
		
		textField_numero = new JTextField();
		textField_numero.setBounds(441, 116, 179, 20);
		panel.add(textField_numero);
		textField_numero.setColumns(10);
		
		textField_bairro = new JTextField();
		textField_bairro.setBounds(441, 150, 179, 20);
		panel.add(textField_bairro);
		textField_bairro.setColumns(10);
		
		textField_comp = new JTextField();
		textField_comp.setBounds(441, 185, 179, 20);
		panel.add(textField_comp);
		textField_comp.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Cidade: ");
		lblNewLabel_12.setBounds(370, 219, 49, 14);
		panel.add(lblNewLabel_12);
		
		textField_cidade = new JTextField();
		textField_cidade.setBounds(441, 216, 179, 20);
		panel.add(textField_cidade);
		textField_cidade.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("CEP: ");
		lblNewLabel_13.setBounds(382, 260, 49, 14);
		panel.add(lblNewLabel_13);
		
		textField_CEP = new JTextField();
		textField_CEP.setBounds(441, 257, 179, 20);
		panel.add(textField_CEP);
		textField_CEP.setColumns(10);
		
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
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(68, 609, 89, 23);
		btnEnviar.addActionListener(tratador);
		panel.add(btnEnviar);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setBounds(441, 609, 89, 23);
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
		
		textField_dtAdClinica = new JTextField();
		textField_dtAdClinica.setBounds(236, 63, 96, 20);
		panel_2.add(textField_dtAdClinica);
		textField_dtAdClinica.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("N\u00FAmero da Carteira de Trabalho:");
		lblNewLabel_15.setBounds(29, 97, 195, 14);
		panel_2.add(lblNewLabel_15);
		
		textField_nrCarteiraTrabalho = new JTextField();
		textField_nrCarteiraTrabalho.setBounds(236, 94, 96, 20);
		panel_2.add(textField_nrCarteiraTrabalho);
		textField_nrCarteiraTrabalho.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Usu\u00E1rio: ");
		lblNewLabel_16.setBounds(125, 128, 72, 14);
		panel_2.add(lblNewLabel_16);
		
		textField_usuario = new JTextField();
		textField_usuario.setBounds(236, 125, 96, 20);
		panel_2.add(textField_usuario);
		textField_usuario.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Senha: ");
		lblNewLabel_17.setBounds(135, 159, 72, 14);
		panel_2.add(lblNewLabel_17);
		
		textField_senha = new JTextField();
		textField_senha.setBounds(236, 156, 96, 20);
		panel_2.add(textField_senha);
		textField_senha.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Dados do funcin\u00E1rio");
		lblNewLabel_10.setBounds(111, 23, 127, 14);
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_3.setBounds(24, 314, 219, 267);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("Dados da Profiss\u00E3o: ");
		lblNewLabel_18.setBounds(47, 11, 146, 14);
		panel_3.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Sal\u00E1rio Base: ");
		lblNewLabel_19.setBounds(10, 42, 96, 14);
		panel_3.add(lblNewLabel_19);
		
		textField_salarioBase = new JTextField();
		textField_salarioBase.setBounds(60, 67, 96, 20);
		panel_3.add(textField_salarioBase);
		textField_salarioBase.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Cargo: ");
		lblNewLabel_20.setBounds(10, 98, 96, 22);
		panel_3.add(lblNewLabel_20);
		
		textField_cargo = new JTextField();
		textField_cargo.setBounds(60, 131, 96, 20);
		panel_3.add(textField_cargo);
		textField_cargo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("RG: ");
		lblNewLabel_1.setBounds(24, 150, 49, 14);
		panel.add(lblNewLabel_1);
		
		textField_RG = new JTextField();
		textField_RG.setBounds(71, 147, 220, 20);
		panel.add(textField_RG);
		textField_RG.setColumns(10);
	}
	
	private class TrataCheckBox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(checkBox_masculino.isSelected())
				CheckBox_sexo = "Masculino";
			if(checkBox_feminino.isSelected())
				CheckBox_sexo = "Feminino";		
		}
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnVoltar) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
				dispose();
			}
			if(e.getSource() == btnEnviar) {
				String nome = textField_name.getText();
				String cpf = textField_CPF.getText();
				String rg = textField_RG.getText();
				String dtNasc = textField_dtNasc.getText();
				String rua = textField_rua.getText();
				int numero = Integer.parseInt(textField_numero.getText());
				String bairro = textField_bairro.getText();
				String comp = textField_comp.getText();
				String cidade = textField_cidade.getText();
				int cep = Integer.parseInt(textField_CEP.getText());
				String slBase  = textField_salarioBase.getText();
				float salarioBase = Float.parseFloat(slBase);
				String cargo = textField_cargo.getText();
				String dtAdClinica = textField_dtAdClinica.getText();
				String nrCarTrab = textField_nrCarteiraTrabalho.getText();
				int nrCarteiraTrabalho = Integer.parseInt(nrCarTrab);
				String usuario = textField_usuario.getText();
				String senha = textField_senha.getText();
				
				Endereco end = new Endereco(rua, numero, comp, bairro, cep, cidade);
				DemaisFuncionarios df = new DemaisFuncionarios(nome, cpf, rg, CheckBox_sexo, dtAdClinica,
						dtNasc, nrCarteiraTrabalho, usuario, senha, salarioBase, cargo);
				
				df.setEndereco(end);
				Codigo.DadosFuncionarios.cadastrar(df);
				
				JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!", "Cadastro", JOptionPane.PLAIN_MESSAGE);

				PaginaInicial frame = new PaginaInicial();
				frame.setVisible(true);
				dispose();
			}
		}
	}
}

