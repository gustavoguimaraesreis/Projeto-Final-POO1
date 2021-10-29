package InterfaceGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JButton botaoVoltar;
	private JButton btnPacienteComPlano;
	private JButton btnPacienteSemPlano;
	private JButton btnMedico;
	private JButton btnOutrosFunc;
	

	public Cadastro() {
		setTitle("Cadastrar");
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
		
		botaoVoltar = new JButton("Voltar para a tela principal");
		botaoVoltar.addActionListener(tratador);
		botaoVoltar.setBounds(243, 229, 204, 23);
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
			Cadastro.this.dispose();
		}
	}
}
