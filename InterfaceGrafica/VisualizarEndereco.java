package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.Pessoas;

public class VisualizarEndereco extends JFrame {

	private JPanel contentPane;

    private JLabel lblRua, lblNumero, lblComplemento, lblBairro, lblCep, lblCidade, lblEndereco;
    private JPanel textPaneW, textPaneB;
    private JButton btnFechar;

	public VisualizarEndereco(Pessoas P) {
		super("Visualizar Endereço");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        TrataBotoes tratador = new TrataBotoes();

		lblEndereco = new JLabel(" Endereço");
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEndereco.setBackground(Color.BLACK);
		lblEndereco.setBounds(40, 32, 177, 15);
		contentPane.add(lblEndereco);
		
		lblRua = new JLabel("Rua: " + P.getEndereco().getRua());
		lblRua.setBounds(54, 72, 381, 15);
		contentPane.add(lblRua);
		
		lblNumero = new JLabel("Numero: " + P.getEndereco().getNumero());
		lblNumero.setBounds(54, 102, 381, 15);
		contentPane.add(lblNumero);
		
		lblComplemento = new JLabel("Complemento: " + P.getEndereco().getComplemento());
		lblComplemento.setBounds(54, 132, 381, 15);
		contentPane.add(lblComplemento);
		
		lblBairro = new JLabel("Bairro: " + P.getEndereco().getBairro());
		lblBairro.setBounds(54, 162, 381, 15);
		contentPane.add(lblBairro);
		
		lblCep = new JLabel("CEP: "+ P.getEndereco().getCEP());
		lblCep.setBounds(54, 189, 381, 18);
		contentPane.add(lblCep);
		
		lblCidade = new JLabel("Cidade: " + P.getEndereco().getCidade());
		lblCidade.setBounds(54, 222, 381, 15);
		contentPane.add(lblCidade);

        textPaneW = new JPanel();
		textPaneW.setBackground(Color.WHITE);
		textPaneW.setBounds(35, 59, 400, 194);
		contentPane.add(textPaneW);
		
		textPaneB = new JPanel();
		textPaneB.setBackground(Color.BLACK);
		textPaneB.setBounds(35, 25, 107, 35);
		contentPane.add(textPaneB);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(170, 276, 117, 25);
		contentPane.add(btnFechar);
        btnFechar.addActionListener(tratador);
	}

    private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnFechar) dispose();
		}
	}
}