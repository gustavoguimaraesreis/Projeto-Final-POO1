package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.Consulta;
import Codigo.DadosConsulta;

public class BuscarConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1;
	private JButton btnVoltar, btnSubmeter;

	public BuscarConsulta() {
		super("Buscar - Consulta");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, a data da consulta que deseja buscar:");
		lblInformeAbaixo.setBounds(20, 12, 440, 15);
		contentPane.add(lblInformeAbaixo);
		
		JLabel lblInformeAbaixoO = new JLabel("Informe, abaixo, o horario da consulta que deseja buscar:");
		lblInformeAbaixoO.setBounds(20, 70, 440, 15);
		contentPane.add(lblInformeAbaixoO);
		
		textField = new JTextField();
		textField.setBounds(20, 39, 158, 19);
		contentPane.add(textField);
		textField.setColumns(10);

        textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(20, 97, 158, 19);
		contentPane.add(textField_1);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(331, 137, 117, 25);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.addActionListener(tratador);
		contentPane.add(btnVoltar);
		
		btnSubmeter = new JButton("Submeter");
		btnSubmeter.setBounds(20, 137, 117, 25);
		contentPane.add(btnSubmeter);
        btnSubmeter.addActionListener(tratador);
		
	}
    
    private class TrataBotoes implements ActionListener{

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                Buscar pg1 = new Buscar();
                pg1.setVisible(true);
				dispose();
            }else if(e.getSource() == btnSubmeter){
				String retorno = textField.getText();
				String retorno_1 = textField_1.getText();
				Consulta C = null;
				C = DadosConsulta.buscar(retorno, retorno_1);
				if(C != null){
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
        }
    }
}