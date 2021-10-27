package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.Consulta;
import Codigo.DadosConsulta;
import Codigo.DadosFuncionarios;
import Codigo.DadosPacientes;
import Codigo.DadosServicosExtras;
import Codigo.Funcionario;
import Codigo.Paciente;
import Codigo.ServicosExtras;

public class BuscarDados extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1;
	private JButton btnVoltar, btnSubmeter;

	public BuscarDados(String Objeto) {
		super("Buscar - Paciente");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes(Objeto);

        textField = new JTextField();
		textField.setBounds(20, 39, 158, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(331, 70, 117, 25);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setForeground(Color.WHITE);
        btnVoltar.addActionListener(tratador);
		contentPane.add(btnVoltar);
		
		btnSubmeter = new JButton("Submeter");
		btnSubmeter.setBounds(20, 70, 117, 25);
		contentPane.add(btnSubmeter);
        btnSubmeter.addActionListener(tratador);

        if(Objeto.equals("P")){
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do paciente que deseja buscar:");
            lblInformeAbaixo.setBounds(20, 12, 440, 15);
            contentPane.add(lblInformeAbaixo);
        }else if(Objeto.equals("F")){
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do funcionario que deseja buscar:");
		    lblInformeAbaixo.setBounds(20, 12, 440, 15);
		    contentPane.add(lblInformeAbaixo);
        }else if(Objeto.equals("SE")){
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o nome do serviço extra que deseja buscar:");
            lblInformeAbaixo.setBounds(20, 12, 460, 15);
            contentPane.add(lblInformeAbaixo);
        }else if(Objeto.equals("C")){
            setBounds(100, 100, 470, 220);
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, a data da consulta que deseja buscar:");
            lblInformeAbaixo.setBounds(20, 12, 440, 15);
            contentPane.add(lblInformeAbaixo);
            JLabel lblInformeAbaixoO = new JLabel("Informe, abaixo, o horario da consulta que deseja buscar:");
		    lblInformeAbaixoO.setBounds(20, 70, 440, 15);
		    contentPane.add(lblInformeAbaixoO);
            textField_1 = new JTextField();
		    textField_1.setColumns(10);
		    textField_1.setBounds(20, 97, 158, 19);
		    contentPane.add(textField_1);
            btnVoltar.setBounds(331, 137, 117, 25);
            btnSubmeter.setBounds(20, 137, 117, 25);
        }
	}

    private class TrataBotoes implements ActionListener{

        private static String Objeto;

        public TrataBotoes(String Objeto){
            TrataBotoes.Objeto = Objeto;
        }

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                Buscar pg1 = new Buscar();
                pg1.setVisible(true);
				dispose();
            }else if(e.getSource() == btnSubmeter){
                Object Aux = null;
                
                if(Objeto.equals("P")){
                    Aux = DadosPacientes.buscar(textField.getText());
                    if(Aux != null){
                        MostrarDadosPaciente pg = new MostrarDadosPaciente(((Paciente) Aux));
                        pg.setVisible(true);    
                    }
                }else if(Objeto.equals("F")){
                    String retorno = textField.getText();
                    Aux = DadosFuncionarios.buscar(retorno);

                }else if(Objeto.equals("SE")){
                    String retorno = textField.getText();
                    Aux = DadosServicosExtras.buscar(retorno);

                }else if(Objeto.equals("C")){
                    String[] retorno = new String[2];
                    retorno[0] = textField.getText();
                    retorno[1] = textField_1.getText();
                    Aux = DadosConsulta.buscar(retorno[0], retorno[1]);

                }
                if(Aux != null) dispose();
                else JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
        }
    }
}