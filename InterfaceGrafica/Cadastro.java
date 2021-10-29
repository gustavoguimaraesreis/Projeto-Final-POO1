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
	private JButton btnMedico;
	private JButton btnOutrosFunc;
	private JButton btnServicoExtra;
	private JLabel lblNewLabel_3;
	

	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//tratador dos botões:
		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblNewLabel = new JLabel("O que deseja cadastrar?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(418, 11, 248, 36);
		contentPane.add(lblNewLabel);
		
		btnPacienteComPlano = new JButton("Paciente com Plano");
		btnPacienteComPlano.setBounds(71, 120, 190, 23);
		btnPacienteComPlano.addActionListener(tratador);
		contentPane.add(btnPacienteComPlano);
		
		btnPacienteSemPlano = new JButton("Paciente sem plano");
		btnPacienteSemPlano.setBounds(71, 174, 190, 23);
		btnPacienteSemPlano.addActionListener(tratador);
		contentPane.add(btnPacienteSemPlano);
		
		btnMedico = new JButton("M\u00E9dico");
		btnMedico.setBounds(452, 120, 165, 23);
		btnMedico.addActionListener(tratador);
		contentPane.add(btnMedico);
		
		btnOutrosFunc = new JButton("Outro Funcion\u00E1rio");
		btnOutrosFunc.setBounds(452, 174, 165, 23);
		btnOutrosFunc.addActionListener(tratador);
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
		botaoVoltar.setForeground(Color.WHITE);
		botaoVoltar.setBackground(Color.RED);
		botaoVoltar.setBounds(425, 293, 204, 23);
        botaoVoltar.addActionListener(tratador);
		contentPane.add(botaoVoltar);
		
		lblNewLabel_3 = new JLabel("Servi\u00E7os Extras");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(827, 80, 171, 14);
		contentPane.add(lblNewLabel_3);
		
		btnServicoExtra = new JButton("Adcionar Servi\u00E7os");
		btnServicoExtra.setBounds(797, 120, 165, 23);
		btnServicoExtra.addActionListener(tratador);
		contentPane.add(btnServicoExtra);
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
			if(e.getSource() == btnPacienteSemPlano) {
				CadastroPacienteSemPlano frame = new CadastroPacienteSemPlano();
				frame.setVisible(true);
			}
			if(e.getSource() == btnMedico) {
				CadastroMedico frame = new CadastroMedico();
				frame.setVisible(true);
			}
			if(e.getSource() == btnOutrosFunc) {
				CadastroOutrosFunc frame = new CadastroOutrosFunc();
				frame.setVisible(true);
			}
			if(e.getSource() == btnServicoExtra) {
				CadastroServicoExtra frame = new CadastroServicoExtra();
				frame.setVisible(true);
				
			}
			Cadastro.this.dispose();
		}
	}
}
