package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JButton botaoVoltar;
	private JButton btnPacienteComPlano;
	private JButton btnPacienteSemPlano;

	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//tratador dos botões:
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("O que deseja cadastrar?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(222, 23, 248, 36);
		contentPane.add(lblNewLabel);
		
		btnPacienteComPlano = new JButton("Paciente com Plano");
		btnPacienteComPlano.setBounds(71, 120, 190, 23);
		btnPacienteComPlano.addActionListener(tratador);
		contentPane.add(btnPacienteComPlano);
		
		btnPacienteSemPlano = new JButton("Paciente sem plano");
		btnPacienteSemPlano.setBounds(71, 174, 190, 23);
		btnPacienteSemPlano.addActionListener(tratador);
		contentPane.add(btnPacienteSemPlano);
		
		JButton btnMedico = new JButton("M\u00E9dico");
		btnMedico.setBounds(452, 120, 165, 23);
		contentPane.add(btnMedico);
		
		JButton btnOutrosFunc = new JButton("Outro Funcion\u00E1rio");
		btnOutrosFunc.setBounds(452, 174, 165, 23);
		contentPane.add(btnOutrosFunc);
		
		JLabel lblNewLabel_1 = new JLabel("Pacientes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(138, 80, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Funcion\u00E1rios");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(488, 80, 105, 14);
		contentPane.add(lblNewLabel_2);
		

		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(243, 229, 204, 23);
		botaoVoltar.setBackground(Color.RED);
		botaoVoltar.setForeground(Color.WHITE);
		botaoVoltar.addActionListener(tratador);
		contentPane.add(botaoVoltar);
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == botaoVoltar) {
				PaginaInicial frame = new PaginaInicial();
				frame.setVisible(true);
				//dispose();
			}
			if(e.getSource() == btnPacienteComPlano) {
				CadastroPacientePlano frame = new CadastroPacientePlano();
				frame.setVisible(true);
			}
			Cadastro.this.dispose();
		}
	}
}
