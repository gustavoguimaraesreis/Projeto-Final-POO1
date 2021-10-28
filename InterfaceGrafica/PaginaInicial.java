package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PaginaInicial extends JFrame {

	private JPanel contentPane;
	private JPanel[] panelColors = new JPanel[4];
	private JButton btnCadastrar, btnBuscar, btnRemover, btnRealizarConsulta, btnCalcularSalario, btnBonificacaoDeAniversario;

	public PaginaInicial() {
		super("Pagina Inicial - Opções do Sistema");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		TrataBotoes tratador = new TrataBotoes();

		JLabel lblOpcoesDoSistema = new JLabel("Opções do Sistema");
		lblOpcoesDoSistema.setBounds(87, 12, 217, 24);
		lblOpcoesDoSistema.setForeground(Color.RED);
		lblOpcoesDoSistema.setFont(new Font("Dialog", Font.BOLD, 20));
		lblOpcoesDoSistema.setBackground(Color.BLACK);
		contentPane.add(lblOpcoesDoSistema);

		panelColors[0] = new JPanel();
		panelColors[0].setLayout(null);
		panelColors[0].setBackground(Color.DARK_GRAY);
		panelColors[0].setBounds(12, 60, 376, 50);
		contentPane.add(panelColors[0]);

		btnBonificacaoDeAniversario = new JButton("Bonificação de aniversário");
		btnBonificacaoDeAniversario.setForeground(Color.BLACK);
		btnBonificacaoDeAniversario.setBackground(Color.WHITE);
		btnBonificacaoDeAniversario.setBounds(81, 12, 228, 25);
		panelColors[0].add(btnBonificacaoDeAniversario);
																																
		panelColors[1] = new JPanel();
		panelColors[1].setBackground(Color.DARK_GRAY);
		panelColors[1].setBounds(12, 122, 376, 50);
		contentPane.add(panelColors[1]);
		panelColors[1].setLayout(null);
		
		btnRealizarConsulta = new JButton("Realizar consulta");
		btnRealizarConsulta.setForeground(Color.BLACK);
		btnRealizarConsulta.setBackground(Color.WHITE);
		btnRealizarConsulta.setBounds(106, 12, 174, 25);
		panelColors[1].add(btnRealizarConsulta);
		
		panelColors[2] = new JPanel();
		panelColors[2].setLayout(null);
		panelColors[2].setBackground(Color.DARK_GRAY);
		panelColors[2].setBounds(12, 184, 376, 50);
		contentPane.add(panelColors[2]);
		
		btnCalcularSalario = new JButton("Calcular salario");
		btnCalcularSalario.setForeground(Color.BLACK);
		btnCalcularSalario.setBackground(Color.WHITE);
		btnCalcularSalario.setBounds(106, 12, 174, 25);
		panelColors[2].add(btnCalcularSalario);
		
		panelColors[3] = new JPanel();
		panelColors[3].setLayout(null);
		panelColors[3].setBackground(Color.DARK_GRAY);
		panelColors[3].setBounds(12, 246, 376, 50);
		contentPane.add(panelColors[3]);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(12, 12, 105, 25);
		panelColors[3].add(btnCadastrar);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBackground(Color.WHITE);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(150, 12, 82, 25);
		panelColors[3].add(btnBuscar);
		btnBuscar.setForeground(Color.BLACK);
		btnBuscar.setBackground(Color.WHITE);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(269, 12, 95, 25);
		panelColors[3].add(btnRemover);
		btnRemover.setForeground(Color.BLACK);
		btnRemover.setBackground(Color.WHITE);

		btnRemover.addActionListener(tratador);
		btnBuscar.addActionListener(tratador);
		btnCadastrar.addActionListener(tratador);
		btnBonificacaoDeAniversario.addActionListener(tratador);
		btnCalcularSalario.addActionListener(tratador);
		btnRealizarConsulta.addActionListener(tratador);
	}
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnCadastrar) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
			}else if(e.getSource() == btnBuscar){
				Buscar page = new Buscar();
				page.setVisible(true);
			}else if(e.getSource() == btnRemover){
				Remover page = new Remover();
				page.setVisible(true);
			}else if(e.getSource() == btnBonificacaoDeAniversario){
				BonificacaoDeAniversario page = new BonificacaoDeAniversario();
				page.setVisible(true);
			}
			dispose();
		}
	}
}
	