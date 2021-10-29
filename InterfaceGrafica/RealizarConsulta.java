package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class RealizarConsulta extends JFrame {

	private JPanel contentPane;
	private JButton btnVoltar, btnConsultaJCadastrada, btnCadastrarNovaConsulta;

	public RealizarConsulta() {
		super("Realizar Consulta");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        TrataBotoes tratador = new TrataBotoes();
		
		btnConsultaJCadastrada = new JButton("Consulta já cadastrada");
		btnConsultaJCadastrada.setBounds(22, 12, 216, 25);
		contentPane.add(btnConsultaJCadastrada);
        btnConsultaJCadastrada.addActionListener(tratador);
		
		btnCadastrarNovaConsulta = new JButton("Cadastrar nova consulta");
		btnCadastrarNovaConsulta.setBounds(22, 52, 216, 25);
		contentPane.add(btnCadastrarNovaConsulta);
        btnCadastrarNovaConsulta.addActionListener(tratador);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setBounds(71, 92, 119, 25);
        btnVoltar.addActionListener(tratador);
		contentPane.add(btnVoltar);
	}

    private class TrataBotoes implements ActionListener{

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                PaginaInicial pg = new PaginaInicial();
                pg.setVisible(true);
            }else if(e.getSource() == btnConsultaJCadastrada){
                RealizarConsultaNextStep pg = new RealizarConsultaNextStep('J');
                pg.setVisible(true);
			}else if(e.getSource() == btnCadastrarNovaConsulta){
                RealizarConsultaNextStep pg = new RealizarConsultaNextStep('C');
                pg.setVisible(true);
            }
            dispose();
        }
    }
}
