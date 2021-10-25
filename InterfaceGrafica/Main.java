package InterfaceGrafica;
import java.awt.BorderLayout;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton cadastro;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//tratador dos botões;
		TrataBotoes tratador = new TrataBotoes();
		

		cadastro = new JButton("Cadastro");
		cadastro.addActionListener(tratador);
		
		cadastro.setBounds(33, 129, 89, 23);
		contentPane.add(cadastro);

		JButton btnNewButton_1 = new JButton("Consulta");
		btnNewButton_1.setBounds(155, 129, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Remover");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(294, 129, 89, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("Op\u00E7\u00F5es do Sistema");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(126, 24, 189, 32);
		contentPane.add(lblNewLabel);
	}
	
	private class TrataBotoes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastro) {
				Cadastro frame = new Cadastro();
				frame.setVisible(true);
				dispose();
				
			}
		}
	}


}
