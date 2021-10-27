package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.Paciente;
import Codigo.PacienteComPlano;
import Codigo.PacienteSemPlano;
import Codigo.Pessoas;

public class MostrarDadosPaciente extends JFrame {
    
	private JPanel contentPane;
    private JPanel[] panelW = new JPanel[2];
    private JPanel[] panelB = new JPanel[2];
	private JButton btnVoltar, btnVisualizarEndereco;

	MostrarDadosPaciente(Paciente P) {
		super("Buscar - Paciente Encontrado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        TrataBotoes tratador = new TrataBotoes(P);
		
		panelW[0] = new JPanel();
		panelW[0].setBounds(27, 58, 342, 300);
		panelW[0].setBackground(Color.WHITE);
		contentPane.add(panelW[0]);
		panelW[0].setLayout(null);

        panelB[0] = new JPanel();
		panelB[0].setBounds(27, 29, 200, 30);
		panelB[0].setBackground(Color.BLACK);
		contentPane.add(panelB[0]);
		panelB[0].setLayout(null);

        JLabel lblDadosPessoais = new JLabel("Dados Pessoais");
		lblDadosPessoais.setBounds(18, 5, 157, 22);
		lblDadosPessoais.setForeground(Color.WHITE);
		lblDadosPessoais.setBackground(Color.WHITE);
		lblDadosPessoais.setFont(new Font("Dialog", Font.BOLD, 18));
		panelB[0].add(lblDadosPessoais);
		
		JLabel lblNome = new JLabel("Nome: " + P.getNome());
		lblNome.setBounds(12, 15, 315, 15);
		panelW[0].add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF: " + P.getCPF());
		lblCpf.setBounds(12, 50, 315, 15);
		panelW[0].add(lblCpf);
		
		JLabel lblRg = new JLabel("RG: " + P.getRG());
		lblRg.setBounds(12, 85, 315, 15);
		panelW[0].add(lblRg);
		
		JLabel lblSexo = new JLabel("Sexo: " + P.getSexo());
		lblSexo.setBounds(12, 120, 315, 15);
		panelW[0].add(lblSexo);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: " + P.getDataNascimento());
		lblDataDeNascimento.setBounds(12, 155, 315, 15);
		panelW[0].add(lblDataDeNascimento);

        JLabel lblEstadoCivil = new JLabel("Estado Civil: " + P.getEstadoCivil());
		lblEstadoCivil.setBounds(12, 190, 315, 15);
		panelW[0].add(lblEstadoCivil);
		
		JLabel lblDataDeCadastro = new JLabel("Data de cadastro: " + P.getDataCadastro());
		lblDataDeCadastro.setBounds(12, 225, 315, 15);
		panelW[0].add(lblDataDeCadastro);
		
		JLabel lblDataDaUltima = new JLabel("Data da ultima consulta: " + P.getDataUltimaConsulta());
		lblDataDaUltima.setBounds(12, 260, 315, 15);
		panelW[0].add(lblDataDaUltima);
		
        if(P instanceof PacienteComPlano){

            panelW[1] = new JPanel();
            panelW[1].setLayout(null);
            panelW[1].setBackground(Color.WHITE);
            panelW[1].setBounds(27, 420, 342, 120);
            contentPane.add(panelW[1]);

            panelB[1] = new JPanel();
            panelB[1].setLayout(null);
            panelB[1].setBackground(Color.BLACK);
            panelB[1].setBounds(27, 390, 200, 30);
            contentPane.add(panelB[1]);
            
            JLabel lblDadosDoPlano = new JLabel("Dados do Plano");
            lblDadosDoPlano.setForeground(Color.WHITE);
            lblDadosDoPlano.setFont(new Font("Dialog", Font.BOLD, 18));
            lblDadosDoPlano.setBackground(Color.WHITE);
            lblDadosDoPlano.setBounds(18, 5, 157, 22);
            panelB[1].add(lblDadosDoPlano);
            
            JLabel lblNumeroDaCarteirinha = new JLabel("Numero da Carteirinha: " + ((PacienteComPlano) P).getNroCarteirinha());
            lblNumeroDaCarteirinha.setBounds(12, 15, 315, 15);
            panelW[1].add(lblNumeroDaCarteirinha);
            
            JLabel lblData = new JLabel("Data de Ingresso no Plano: " + ((PacienteComPlano) P).getDataIngressoPlano());
            lblData.setBounds(12, 50, 315, 15);
            panelW[1].add(lblData);
            
            String aux = null;
            if(((PacienteComPlano) P).getPeriodoCarencia() == true) aux = "Sim";
            else aux = "Não";
            JLabel lblPeriodoDeCarencia = new JLabel("Periodo de Carencia: " + aux);
            lblPeriodoDeCarencia.setBounds(12, 85, 315, 15);
            panelW[1].add(lblPeriodoDeCarencia);

            btnVisualizarEndereco = new JButton("Visualizar Endereço");
            btnVisualizarEndereco.setBounds(27, 560, 205, 25);
            contentPane.add(btnVisualizarEndereco);
            btnVisualizarEndereco.addActionListener(tratador);
    
            btnVoltar = new JButton("Voltar");
            btnVoltar.setBounds(246, 560, 123, 25);
            btnVoltar.setBackground(Color.RED);
            btnVoltar.setForeground(Color.WHITE);
            btnVoltar.addActionListener(tratador);
            contentPane.add(btnVoltar);

        }else if(P instanceof PacienteSemPlano){
            setBounds(100, 100, 400, 610);

            panelW[1] = new JPanel();
            panelW[1].setLayout(null);
            panelW[1].setBackground(Color.WHITE);
            panelW[1].setBounds(27, 420, 342, 86);
            contentPane.add(panelW[1]);

            panelB[1] = new JPanel();
            panelB[1].setLayout(null);
            panelB[1].setBackground(Color.BLACK);
            panelB[1].setBounds(27, 390, 210, 30);
            contentPane.add(panelB[1]);
            
            JLabel lblDadosAdicionais = new JLabel("Dados Adicionais");
            lblDadosAdicionais.setForeground(Color.WHITE);
            lblDadosAdicionais.setFont(new Font("Dialog", Font.BOLD, 18));
            lblDadosAdicionais.setBackground(Color.WHITE);
            lblDadosAdicionais.setBounds(18, 5, 180, 22);
            panelB[1].add(lblDadosAdicionais);
            
            JLabel lblPossuiDesconto = new JLabel("Possui desconto: " + ((PacienteSemPlano) P).getPossuiDesconto());
            lblPossuiDesconto.setBounds(12, 15, 315, 15);
            panelW[1].add(lblPossuiDesconto);
            
            JLabel lblValor = new JLabel("Valor da ultima consulta: " + ((PacienteSemPlano) P).getDataUltimaConsulta());
            lblValor.setBounds(12, 50, 315, 15);
            panelW[1].add(lblValor);

            btnVisualizarEndereco = new JButton("Visualizar Endereço");
            btnVisualizarEndereco.setBounds(27, 530, 205, 25);
            contentPane.add(btnVisualizarEndereco);
            btnVisualizarEndereco.addActionListener(tratador);
    
            btnVoltar = new JButton("Voltar");
            btnVoltar.setBounds(246, 530, 125, 25);
            btnVoltar.setBackground(Color.RED);
            btnVoltar.setForeground(Color.WHITE);
            btnVoltar.addActionListener(tratador);
            contentPane.add(btnVoltar);
        }
	}

    private class TrataBotoes implements ActionListener{

        private static Pessoas P;

        public TrataBotoes (Pessoas P){
            TrataBotoes.P = P;
        }

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                BuscarDados pg = new BuscarDados("P");
                pg.setVisible(true);
				dispose();
            }else if(e.getSource() == btnVisualizarEndereco){
				VisualizarEndereco pg = new VisualizarEndereco(P);
                pg.setVisible(true);
			}
        }
    }
}
