package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.DadosFuncionarios;
import Codigo.DemaisFuncionarios;
import Codigo.Funcionario;
import Codigo.Medico;

public class CalcularSalario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnVoltar, btnSubmeter;

	public CalcularSalario() {
        super("Calcular Salário");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes();

        JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o CPF do funcionario que deseja calcular o salario:");
		lblInformeAbaixo.setBounds(20, 12, 440, 15);
		contentPane.add(lblInformeAbaixo);

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
    }

    private class TrataBotoes implements ActionListener{

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                PaginaInicial pg = new PaginaInicial();
                pg.setVisible(true);
				dispose();
            }else if(e.getSource() == btnSubmeter){
                Funcionario F =  null;
                F = DadosFuncionarios.buscar(textField.getText());

                float value = 0.00f;
                if(F != null){
                    if(F instanceof DemaisFuncionarios)
                        value = ((DemaisFuncionarios) F).calcularSalario();
                    else if(F instanceof Medico)
                        value = ((Medico) F).calcularSalario();

                    JOptionPane.showMessageDialog(null, ("O salario do funcionario em questão é de: " + value), "Salário Calculado", JOptionPane.PLAIN_MESSAGE);
                }else JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
        }
    }
}