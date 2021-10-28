package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class Remover extends JFrame {

	private JPanel contentPane;
	private JButton btnPaciente, btnFuncionario, btnServiçoExtra, btnConsulta, btnVoltar;
	
	public Remover() {
		super("Remover");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblOQueDeseja = new JLabel("O que deseja remover do sistema?");
		lblOQueDeseja.setFont(new Font("Dialog", Font.BOLD, 22));
		lblOQueDeseja.setBounds(122, 25, 457, 27);
		contentPane.add(lblOQueDeseja);
		
		btnPaciente = new JButton("Paciente");
		btnPaciente.setBounds(44, 113, 180, 25);
		contentPane.add(btnPaciente);
		btnPaciente.addActionListener(tratador);
		
		btnFuncionario = new JButton("Funcionario");
		btnFuncionario.setBounds(199, 156, 173, 25);
		contentPane.add(btnFuncionario);
		btnFuncionario.addActionListener(tratador);
		
		btnServiçoExtra = new JButton("Serviço Extra");
		btnServiçoExtra.setBounds(490, 244, 162, 25);
		contentPane.add(btnServiçoExtra);
		btnServiçoExtra.addActionListener(tratador);

		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(349, 201, 162, 25);
		contentPane.add(btnConsulta);
		btnConsulta.addActionListener(tratador);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBounds(12, 246, 117, 25);
		contentPane.add(btnVoltar);
		btnVoltar.addActionListener(tratador);
	}
	private class TrataBotoes implements ActionListener{

		public void actionPerformed (ActionEvent e){
			if(e.getSource() == btnPaciente){
				RemoverDados pg = new RemoverDados("P");
				pg.setVisible(true);
			}else if(e.getSource() == btnFuncionario){
				RemoverDados pg = new RemoverDados("F");
				pg.setVisible(true);
			}else if (e.getSource() == btnConsulta){
				RemoverDados pg = new RemoverDados("C");
				pg.setVisible(true);
			}else if (e.getSource() == btnServiçoExtra){
				RemoverDados pg = new RemoverDados("SE");
				pg.setVisible(true);
			}else{
				PaginaInicial pg = new PaginaInicial();
				pg.setVisible(true);
			}
			dispose();
		}
	}
}
