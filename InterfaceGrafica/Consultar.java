package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class Consultar extends JFrame {

	private JPanel contentPane;
	private JButton btnPacienteComPlano, btnPacienteSemPlano, btnMedicos, btnOutroFuncionario, btnServiçoExtra, btnVoltar;
	
	public Consultar() {
		super("Consulta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOQueDeseja = new JLabel("O que deseja consultar?");
		lblOQueDeseja.setFont(new Font("Dialog", Font.BOLD, 22));
		lblOQueDeseja.setBounds(200, 24, 369, 15);
		contentPane.add(lblOQueDeseja);
		
		JLabel lblPacientes = new JLabel("Pacientes");
		lblPacientes.setFont(new Font("Dialog", Font.BOLD, 18));
		lblPacientes.setBounds(70, 119, 151, 15);
		contentPane.add(lblPacientes);
		
		JLabel lblFuncionarios = new JLabel("Funcionarios");
		lblFuncionarios.setFont(new Font("Dialog", Font.BOLD, 18));
		lblFuncionarios.setBounds(294, 118, 171, 15);
		contentPane.add(lblFuncionarios);
		
		JLabel lblServiosExtras = new JLabel("Serviços Extras");
		lblServiosExtras.setFont(new Font("Dialog", Font.BOLD, 18));
		lblServiosExtras.setBounds(497, 119, 168, 15);
		contentPane.add(lblServiosExtras);
		
		btnPacienteComPlano = new JButton("Paciente Com Plano");
		btnPacienteComPlano.setBounds(41, 176, 180, 25);
		contentPane.add(btnPacienteComPlano);
		
		btnPacienteSemPlano = new JButton("Paciente Sem Plano");
		btnPacienteSemPlano.setBounds(41, 258, 180, 25);
		contentPane.add(btnPacienteSemPlano);
		
		btnMedicos = new JButton("Médico");
		btnMedicos.setBounds(306, 176, 117, 25);
		contentPane.add(btnMedicos);
		
		btnOutroFuncionario = new JButton("Outro Funcionario");
		btnOutroFuncionario.setBounds(285, 258, 162, 25);
		contentPane.add(btnOutroFuncionario);
		
		btnServiçoExtra = new JButton("Serviço Extra");
		btnServiçoExtra.setBounds(503, 176, 162, 25);
		contentPane.add(btnServiçoExtra);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBounds(554, 426, 117, 25);
		contentPane.add(btnVoltar);
	}
}
