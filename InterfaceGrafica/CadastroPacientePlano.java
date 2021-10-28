package InterfaceGrafica;
import Codigo.Paciente;
import Codigo.DadosPacientes;
import Codigo.PacienteComPlano;
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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CadastroPacientePlano extends JFrame {

	private JPanel contentPane;
	private JButton btnVoltar;
	private JButton btnEnviar;
	private static JTextField textField_name;
	private static JTextField textField_CPF;
	private static JTextField textField_RG;
	private static JTextField textField_dtNasc;
	private JCheckBox checkBx_masculino;
	private JCheckBox checkBx_feminino;
	private JCheckBox checkBox_solteiro;
	private JCheckBox checkBox_casado;
	private JCheckBox checkBox_divorciado;
	private JCheckBox checkBox_pCarencia;
	private static JTextField textField_rua;
	private static JTextField textField_numero;
	private static JTextField textField_bairro;
	private static JTextField textField_comp;
	private static JTextField textField_cidade;
	private static JTextField textField_CEP;
	private static JTextField textField_nrCarterinha;
	private static JTextField textField_dtIngresso;
	
	private String CheckBox;
	private String CheckBox_EstadoCivil;
	private String dtCadastro = "hoje"; //teste(não sei pegar a data atual(pesquisar import.JavaDate)
	private String dtUltimaConsulta = "ainda não fez nenhuma consulta";
	private boolean CheckBox_pCarencia = false;
	
	public CadastroPacientePlano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBorder(new LineBorder(Color.GRAY, 2));
		panel.setBounds(10, 11, 581, 541);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//tratador dos botões
		TrataBotoes tratador = new TrataBotoes();
		
		//tratador dos checkBox
		TrataCheckBox trataChBox = new TrataCheckBox();
		
		JLabel lblNewLabel = new JLabel("Cadastro de Paciente com Plano De Sa\u00FAde");
		lblNewLabel.setBounds(173, 7, 258, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nome: ");
		lblNewLabel_2.setBounds(24, 74, 49, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF: ");
		lblNewLabel_3.setBounds(24, 105, 49, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de Nascimento: ");
		lblNewLabel_4.setBounds(24, 164, 133, 14);
		panel.add(lblNewLabel_4);
		
		checkBx_masculino = new JCheckBox("Masculino");
		checkBx_masculino.setBounds(58, 210, 99, 23);
		checkBx_masculino.addItemListener(trataChBox);
		panel.add(checkBx_masculino);
		
		checkBx_feminino = new JCheckBox("Femino");
		checkBx_feminino.setBounds(58, 240, 99, 23);
		checkBx_feminino.addItemListener(trataChBox);
		panel.add(checkBx_feminino);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo: ");
		lblNewLabel_5.setBounds(24, 189, 49, 14);
		panel.add(lblNewLabel_5);
		
		textField_name = new JTextField();
		textField_name.setBounds(81, 71, 96, 20);
		panel.add(textField_name);
		textField_name.setColumns(10);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(81, 102, 96, 20);
		panel.add(textField_CPF);
		textField_CPF.setColumns(10);
		
		textField_dtNasc = new JTextField();
		textField_dtNasc.setBounds(173, 161, 96, 20);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBounds(261, 321, 300, 150);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Dados do Plano");
		lblNewLabel_16.setBounds(111, 5, 92, 14);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_10 = new JLabel("N\u00FAmero da Carteirinha: ");
		lblNewLabel_10.setBounds(10, 35, 143, 14);
		panel_2.add(lblNewLabel_10);
		
		checkBox_pCarencia = new JCheckBox("");
		checkBox_pCarencia.setBounds(152, 112, 30, 23);
		checkBox_pCarencia.addItemListener(trataChBox);
		panel_2.add(checkBox_pCarencia);
		
		textField_nrCarterinha = new JTextField();
		textField_nrCarterinha.setBounds(152, 32, 96, 20);
		panel_2.add(textField_nrCarterinha);
		textField_nrCarterinha.setColumns(10);
		
		textField_dtIngresso = new JTextField();
		textField_dtIngresso.setBounds(152, 76, 96, 20);
		panel_2.add(textField_dtIngresso);
		textField_dtIngresso.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Per\u00EDodo de Car\u00EAncia: ");
		lblNewLabel_15.setBounds(10, 121, 133, 14);
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_14 = new JLabel("Data de Ingresso: ");
		lblNewLabel_14.setBounds(10, 79, 120, 14);
		panel_2.add(lblNewLabel_14);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(24, 485, 89, 23);
		btnEnviar.addActionListener(tratador);
		panel.add(btnEnviar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(472, 502, 89, 23);
		btnVoltar.addActionListener(tratador);
		panel.add(btnVoltar);
		
		JLabel lblNewLabel_17 = new JLabel("RG: ");
		lblNewLabel_17.setBounds(24, 139, 49, 14);
		panel.add(lblNewLabel_17);
		
		textField_RG = new JTextField();
		textField_RG.setBounds(83, 133, 96, 20);
		panel.add(textField_RG);
		textField_RG.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Estado Civil:");
		lblNewLabel_18.setBounds(24, 277, 99, 14);
		panel.add(lblNewLabel_18);
		
		checkBox_solteiro = new JCheckBox("Solteiro");
		checkBox_solteiro.setBounds(58, 317, 99, 23);
		checkBox_solteiro.addItemListener(trataChBox);
		panel.add(checkBox_solteiro);
		
		checkBox_casado = new JCheckBox("Casado");
		checkBox_casado.setBounds(58, 343, 99, 23);
		checkBox_casado.addItemListener(trataChBox);
		panel.add(checkBox_casado);
		
		checkBox_divorciado = new JCheckBox("Divorciado");
		checkBox_divorciado.setBounds(58, 369, 99, 23);
		checkBox_divorciado.addItemListener(trataChBox);
		panel.add(checkBox_divorciado);
	}
	
	private class TrataCheckBox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(checkBx_masculino.isSelected())
				CheckBox = "Masculino";
			if(checkBx_feminino.isSelected())
				CheckBox = "Feminino";
			if(checkBox_solteiro.isSelected())
				CheckBox_EstadoCivil = "Solteiro";
			if(checkBox_casado.isSelected())
				CheckBox_EstadoCivil = "Casado";
			if(checkBox_divorciado.isSelected())
				CheckBox_EstadoCivil = "Divorciado";
			if(checkBox_pCarencia.isSelected())
				CheckBox_pCarencia = true;
				
				
		}
	}
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnVoltar) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
			}
			if(e.getSource() == btnEnviar) {
				String nome = CadastroPacientePlano.textField_name.getText();
				String cpf = CadastroPacientePlano.textField_CPF.getText();
				String rg = CadastroPacientePlano.textField_RG.getText();
				String dtNasc = CadastroPacientePlano.textField_dtNasc.getText();
				String rua = CadastroPacientePlano.textField_rua.getText();
				String numero = CadastroPacientePlano.textField_numero.getText();
				String bairro = CadastroPacientePlano.textField_bairro.getText();
				String comp = CadastroPacientePlano.textField_comp.getText();
				String cidade = CadastroPacientePlano.textField_cidade.getText();
				String cep = CadastroPacientePlano.textField_CEP.getText();
				String nr_cart = CadastroPacientePlano.textField_nrCarterinha.getText();
				int nrCart = Integer.parseInt(nr_cart);
				String dtIngresso = CadastroPacientePlano.textField_dtIngresso.getText();
				
				
				
				PacienteComPlano p = new PacienteComPlano(nome, cpf, rg, CheckBox, CheckBox_EstadoCivil,
						dtNasc, dtCadastro, dtUltimaConsulta, nrCart, dtIngresso, CheckBox_pCarencia);
				
				DadosPacientes.cadastrar(p);
				
				
				
				
				
				
			}
			CadastroPacientePlano.this.dispose();
		}
	}
}
