package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.DadosFuncionarios;
import Codigo.DadosPacientes;
import Codigo.DemaisFuncionarios;
import Codigo.Medico;
import Codigo.Paciente;
import Codigo.Pessoas;

public class BonificacaoDeAniversario extends JFrame {

	private JPanel contentPane;
	private JTextField textField, textField_1;
	private JButton btnVoltar, btnSubmeter;

	public BonificacaoDeAniversario() {
        super("Bonificacao de Aniversario - Verificação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setLayout(null);
		
		TrataBotoes tratador = new TrataBotoes();

        
        JLabel lblInformeAbaixo = new JLabel("Informe, abaixo, a data atual:");
        lblInformeAbaixo.setBounds(20, 71, 233, 15);
        contentPane.add(lblInformeAbaixo);
        
        JLabel lblInformeAbaixo_1 = new JLabel("Informe, abaixo, o CPF do funcionario " + "ou paciente que deseja verificar:");
        lblInformeAbaixo_1.setBounds(20, 12, 511, 15);
	    contentPane.add(lblInformeAbaixo_1);

        textField = new JTextField();
        textField.setBounds(20, 39, 233, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	    
        textField_1 = new JTextField();
        textField_1.setBounds(20, 98, 233, 19);
	    textField_1.setColumns(10);
	    contentPane.add(textField_1);
	    
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(401, 86, 117, 25);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setForeground(Color.WHITE);
        btnVoltar.addActionListener(tratador);
		contentPane.add(btnVoltar);
		
		btnSubmeter = new JButton("Submeter");
		btnSubmeter.setBounds(401, 48, 117, 25);
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
                Pessoas P = DadosFuncionarios.buscar(textField.getText());
                if(P == null)
                    P = DadosPacientes.buscar(textField.getText());

                if(P != null){
                    boolean check;

                    if(P instanceof Paciente){
                        check = ((Paciente) P).bonificacaoAniversarial(textField_1.getText());
                        if(check == true) JOptionPane.showMessageDialog(null, "Parabêns! Chegou o seu aniversario e você ganhou 50% de desconto para uma sessão em qualquer um de nossos serviços extras. Consulte os nossos serviços na aba 'Buscar'.", "Bonificação de Aniversario", JOptionPane.INFORMATION_MESSAGE);
                        else JOptionPane.showMessageDialog(null, "O aniversario do paciente em questão ainda não chegou!", "Sem Bonificação de Aniversario", JOptionPane.INFORMATION_MESSAGE);
                    
                    }else if(P instanceof DemaisFuncionarios){
                        check = ((DemaisFuncionarios) P).bonificacaoAniversarial(textField_1.getText());
                        if(check == true)JOptionPane.showMessageDialog(null, "Parabêns! Chegou o seu aniversario e você ganhou uma sessão gratuita para qualquer um de nossos serviços extras. Consulte os nossos serviços na aba 'Buscar'.", "Bonificação de Aniversario", JOptionPane.INFORMATION_MESSAGE);
                        else JOptionPane.showMessageDialog(null, "O aniversario do funcionário em questão ainda não chegou!", "Sem Bonificação de Aniversario", JOptionPane.INFORMATION_MESSAGE);
                   
                    }else if(P instanceof Medico){
                        check = ((Medico) P).bonificacaoAniversarial(textField_1.getText());
                        if(check == true)JOptionPane.showMessageDialog(null, "Parabêns! Chegou o seu aniversario e você ganhou uma sessão gratuita para qualquer um de nossos serviços extras, além de poder trazer o seu cônjuge junto. Consulte os nossos serviços na aba 'Buscar'.", "Bonificação de Aniversario", JOptionPane.INFORMATION_MESSAGE);
                        else JOptionPane.showMessageDialog(null, "O aniversario do médico em questão ainda não chegou!", "Sem Bonificação de Aniversario", JOptionPane.INFORMATION_MESSAGE);

                    }
                }else JOptionPane.showMessageDialog(null, "Nenhuma pessoa cadastrada com este CPF foi encontrada em nosso sistema!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}