package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.DadosConsulta;
import Codigo.DadosFuncionarios;
import Codigo.DadosPacientes;
import Codigo.DadosServicosExtras;

public class RemoverDados extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1;
	private JButton btnVoltar, btnSubmeter;

	public RemoverDados(String removeType) {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes(removeType);

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

        if(removeType.equals("P")){
            setTitle("Remover - Paciente");
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do paciente que deseja remover:");
            lblInformeAbaixo.setBounds(20, 12, 440, 15);
            contentPane.add(lblInformeAbaixo);
        }else if(removeType.equals("F")){
            setTitle("Remover - Funcionario");
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do funcionario que deseja remover:");
		    lblInformeAbaixo.setBounds(20, 12, 440, 15);
		    contentPane.add(lblInformeAbaixo);
        }else if(removeType.equals("SE")){
            setTitle("Remover - Serviço Extra");
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o nome do serviço que deseja remover:");
            lblInformeAbaixo.setBounds(20, 12, 460, 15);
            contentPane.add(lblInformeAbaixo);
        }else if(removeType.equals("C")){
            setTitle("Remover - Consulta");
            setBounds(100, 100, 470, 220);
            JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, a data da consulta que deseja remover:");
            lblInformeAbaixo.setBounds(20, 12, 440, 15);
            contentPane.add(lblInformeAbaixo);
            JLabel lblInformeAbaixoO = new JLabel("Informe, abaixo, o horario da consulta que deseja remover:");
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

        private String removeType;

        public TrataBotoes(String removeType){
            this.removeType = removeType;
        }

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                Remover pg1 = new Remover();
                pg1.setVisible(true);
				dispose();
            }else if(e.getSource() == btnSubmeter){
                Object Aux = null;
                
                if(removeType.equals("P"))
                    Aux = DadosPacientes.excluir(textField.getText());
                    
                else if(removeType.equals("F"))
                    Aux = DadosFuncionarios.excluir(textField.getText());

                else if(removeType.equals("SE"))
                    Aux = DadosServicosExtras.excluir(textField.getText());

                else if(removeType.equals("C"))
                    Aux = DadosConsulta.excluir(textField.getText(), textField_1.getText());
                
                if(Aux != null) JOptionPane.showMessageDialog(null, "Item removido com sucesso!", "Removido", JOptionPane.INFORMATION_MESSAGE);  
                else JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);

                PaginaInicial frame = new PaginaInicial();
				frame.setVisible(true);
				dispose();
			}
        }
    }
}