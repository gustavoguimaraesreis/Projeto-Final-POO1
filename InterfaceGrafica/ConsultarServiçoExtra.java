package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class ConsultarServiçoExtra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnVoltar, btnSubmeter;

	public ConsultarServiçoExtra() {
		super("Consultar - Serviço Extra");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 150);
        setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes();
		
		JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, o nome do serviço extra que deseja consultar:");
		lblInformeAbaixo.setBounds(20, 12, 460, 15);
		contentPane.add(lblInformeAbaixo);
		
		textField = new JTextField();
		textField.setBounds(20, 39, 158, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(365, 70, 117, 25);
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
                Consultar pg1 = new Consultar();
                pg1.setVisible(true);
            }
            ConsultarServiçoExtra.this.dispose();
        }
    }
}