package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.Consulta;
import Codigo.DadosConsulta;
import Codigo.DadosFuncionarios;
import Codigo.DadosPacientes;
import Codigo.DemaisFuncionarios;
import Codigo.Funcionario;
import Codigo.Medico;
import Codigo.Paciente;

public class RealizarConsultaNextStep extends JFrame {

	private JPanel contentPane;
	private JTextField[] textField = new JTextField[5];
	private JButton btnVoltar, btnSubmeter;

	public RealizarConsultaNextStep(char Option) {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes(Option);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.RED);
		contentPane.add(btnVoltar);
		btnVoltar.addActionListener(tratador);
		
		btnSubmeter = new JButton("Submeter");
		contentPane.add(btnSubmeter);
		btnSubmeter.addActionListener(tratador);

		if(Option == 'C'){
			setTitle("Cadastrar Consulta");
			setBounds(100, 100, 670, 270);
			btnVoltar.setBounds(521, 196, 117, 25);
			btnSubmeter.setBounds(392, 196, 117, 25);
			
			JLabel lblData = new JLabel("Data:");
			lblData.setBounds(407, 80, 51, 15);
			contentPane.add(lblData);

			JLabel lblHorario = new JLabel("Horário:");
			lblHorario.setBounds(388, 122, 70, 15);
			contentPane.add(lblHorario);

			JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, os dados da consulta que deseja cadastrar:");
			lblInformeAbaixo.setFont(new Font("Dialog", Font.BOLD, 18));
			lblInformeAbaixo.setBounds(30, 24, 626, 15);
			contentPane.add(lblInformeAbaixo);
			
			JLabel lblCpfDoMedico = new JLabel("CPF do médico: ");
			lblCpfDoMedico.setBounds(42, 84, 117, 15);
			contentPane.add(lblCpfDoMedico);
			
			JLabel lblCpfDoPaciente = new JLabel("CPF do paciente:");
			lblCpfDoPaciente.setBounds(42, 126, 127, 15);
			contentPane.add(lblCpfDoPaciente);
			
			JLabel lblCpfDoFuncionario = new JLabel("CPF do funcionario que está agendando:");
			lblCpfDoFuncionario.setBounds(42, 168, 289, 15);
			contentPane.add(lblCpfDoFuncionario);

			textField[0] = new JTextField();
			textField[0].setColumns(10);
			textField[0].setBounds(453, 78, 158, 25);
			contentPane.add(textField[0]);

			textField[1] = new JTextField();
			textField[1].setColumns(10);
			textField[1].setBounds(453, 116, 158, 25);
			contentPane.add(textField[1]);
			
			textField[2] = new JTextField();
			textField[2].setColumns(10);
			textField[2].setBounds(160, 80, 169, 25);
			contentPane.add(textField[2]);
			
			textField[3] = new JTextField();
			textField[3].setColumns(10);
			textField[3].setBounds(171, 122, 158, 25);
			contentPane.add(textField[3]);
			
			textField[4] = new JTextField();
			textField[4].setColumns(10);
			textField[4].setBounds(52, 196, 277, 25);
			contentPane.add(textField[4]);

		}else if(Option == 'J'){
			setTitle("Realizar Consulta já Cadastrada");
			setBounds(100, 100, 470, 230);
			btnVoltar.setBounds(317, 156, 117, 25);
			btnSubmeter.setBounds(18, 156, 117, 25);
					
			JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, a data da consulta que deseja realizar:");
			lblInformeAbaixo.setBounds(18, 31, 440, 15);
			contentPane.add(lblInformeAbaixo);

			JLabel lblInformeAbaixo_1 = new JLabel("Informe, abaixo, o horario da consulta que deseja realizar:");
			lblInformeAbaixo_1.setBounds(18, 89, 440, 15);
			contentPane.add(lblInformeAbaixo_1);

			textField[0] = new JTextField();
			textField[0].setBounds(18, 58, 158, 19);
			contentPane.add(textField[0]);
			textField[0].setColumns(10);

			textField[1] = new JTextField();
			textField[1].setBounds(18, 116, 158, 19);
			textField[1].setColumns(10);
			contentPane.add(textField[1]);
		}
	}

    private class TrataBotoes implements ActionListener{

		private char Option;

		public TrataBotoes(char Option){
			this.Option = Option;
		}

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                RealizarConsulta pg = new RealizarConsulta();
                pg.setVisible(true);
				dispose();
            }else if(e.getSource() == btnSubmeter){
                Consulta C = null;

				if(Option == 'C'){
					Paciente P = DadosPacientes.buscar(textField[3].getText());
					Funcionario M = DadosFuncionarios.buscar(textField[2].getText());
					Funcionario F = DadosFuncionarios.buscar(textField[4].getText());

					if(P != null && M != null && F != null){
						C =  new Consulta(textField[0].getText(), textField[1].getText(), P, ((Medico) M), ((DemaisFuncionarios) F));
						DadosConsulta.cadastrar(C);
						if (JOptionPane.showConfirmDialog(null, "Consulta cadastrada com sucesso. Deseja marcá-la como realizada?", "Consulta Cadastrada", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Consulra realizada com sucesso!", "Consulta Realizada", JOptionPane.PLAIN_MESSAGE);
							C.realizarConsulta();
						}

					}else JOptionPane.showMessageDialog(null, "Paciente, Médico ou Funcionário fornecido é/são inválido(s).", "Erro", JOptionPane.ERROR_MESSAGE);

				}else if(Option == 'J'){
					C = DadosConsulta.buscar(textField[0].getText(), textField[1].getText());
            
					if(C != null){
						if (JOptionPane.showConfirmDialog(null, "Consulta cadastrada com sucesso. Deseja marcá-la como realizada?", "Consulta Cadastrada", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
							JOptionPane.showMessageDialog(null, "Consulra realizada com sucesso!", "Consulta Realizada", JOptionPane.PLAIN_MESSAGE);
							C.realizarConsulta();
						}

					}else JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
				}


				PaginaInicial pg = new PaginaInicial();
				pg.setVisible(true);
				dispose();
            }
        }
    }
}