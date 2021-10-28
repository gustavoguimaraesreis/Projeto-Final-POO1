package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.DadosConsulta;
import Codigo.DadosFuncionarios;
import Codigo.DadosPacientes;
import Codigo.DadosServicosExtras;

public class BuscarDados extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1;
	private JButton btnVoltar, btnSubmeter;

	public BuscarDados(String searchType) {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes(searchType);

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

        if(searchType.equals("P")){
            setTitle("Buscar - Paciente");
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do paciente que deseja buscar:");
            lblInformeAbaixo.setBounds(20, 12, 440, 15);
            contentPane.add(lblInformeAbaixo);
        }else if(searchType.equals("F")){
            setTitle("Buscar - Funcionario");
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do funcionario que deseja buscar:");
		    lblInformeAbaixo.setBounds(20, 12, 440, 15);
		    contentPane.add(lblInformeAbaixo);
        }else if(searchType.equals("SE")){
            setTitle("Buscar - Serviço Extra");
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o nome do serviço extra que deseja buscar:");
            lblInformeAbaixo.setBounds(20, 12, 460, 15);
            contentPane.add(lblInformeAbaixo);
        }else if(searchType.equals("C")){
            setTitle("Buscar - Consulta");
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

        private String searchType;

        public TrataBotoes(String searchType){
            this.searchType = searchType;
        }

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                Buscar pg1 = new Buscar();
                pg1.setVisible(true);
				dispose();
            }else if(e.getSource() == btnSubmeter){
                Object Aux = null;
                
                if(searchType.equals("P"))
                    Aux = DadosPacientes.buscar(textField.getText());
                    
                else if(searchType.equals("F"))
                    Aux = DadosFuncionarios.buscar(textField.getText());

                else if(searchType.equals("SE"))
                    Aux = DadosServicosExtras.buscar(textField.getText());

                else if(searchType.equals("C"))
                    Aux = DadosConsulta.buscar(textField.getText(), textField_1.getText());
                
                if(Aux != null){
                    MostrarDados pg = new MostrarDados(Aux);
                    pg.setVisible(true);   
                    dispose(); 
                }else JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
        }
    }
}