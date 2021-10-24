package InterfaceGrafica;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class Consultar extends JFrame {

	private JPanel contentPane;
	private JButton btnPaciente, btnFuncionario, btnServiçoExtra, btnConsulta, btnVoltar;
	
	public Consultar() {
		super("Consulta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOQueDeseja = new JLabel("O que deseja consultar no sistema?");
		lblOQueDeseja.setFont(new Font("Dialog", Font.BOLD, 22));
		lblOQueDeseja.setBounds(122, 25, 457, 27);
		contentPane.add(lblOQueDeseja);
		
		btnPaciente = new JButton("Paciente");
		btnPaciente.setBounds(44, 113, 180, 25);
		contentPane.add(btnPaciente);
		
		btnFuncionario = new JButton("Funcionario");
		btnFuncionario.setBounds(199, 156, 173, 25);
		contentPane.add(btnFuncionario);
		
		btnServiçoExtra = new JButton("Serviço Extra");
		btnServiçoExtra.setBounds(490, 244, 162, 25);
		contentPane.add(btnServiçoExtra);

		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(349, 201, 162, 25);
		contentPane.add(btnConsulta);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBounds(12, 246, 117, 25);
		contentPane.add(btnVoltar);
	}		
}
