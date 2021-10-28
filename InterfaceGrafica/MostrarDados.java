package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import Codigo.Consulta;
import Codigo.DemaisFuncionarios;
import Codigo.Funcionario;
import Codigo.Medico;
import Codigo.Paciente;
import Codigo.PacienteComPlano;
import Codigo.PacienteSemPlano;
import Codigo.Pessoas;
import Codigo.ServicosExtras;

public class MostrarDados extends JFrame {
    
	private JPanel contentPane;
    private JPanel[] panelW = new JPanel[2];
    private JPanel[] panelB = new JPanel[2];
	private JButton btnVoltar, btnVisualizarEndereco;
    private String type;

	MostrarDados(Object O) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        TrataBotoes tratador = new TrataBotoes(O);

        if(O instanceof Pessoas){
            this.type = "P";
            setBounds(100, 100, 400, 650);
            
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
            
            JLabel lblNome = new JLabel("Nome: " + ((Pessoas) O).getNome());
            lblNome.setBounds(12, 15, 315, 15);
            panelW[0].add(lblNome);
            
            JLabel lblCpf = new JLabel("CPF: " + ((Pessoas) O).getCPF());
            lblCpf.setBounds(12, 50, 315, 15);
            panelW[0].add(lblCpf);
            
            JLabel lblRg = new JLabel("RG: " + ((Pessoas) O).getRG());
            lblRg.setBounds(12, 85, 315, 15);
            panelW[0].add(lblRg);
            
            JLabel lblSexo = new JLabel("Sexo: " + ((Pessoas) O).getSexo());
            lblSexo.setBounds(12, 120, 315, 15);
            panelW[0].add(lblSexo);
            
            JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: " + ((Pessoas) O).getDataNascimento());
            lblDataDeNascimento.setBounds(12, 155, 315, 15);
            panelW[0].add(lblDataDeNascimento);

            if(O instanceof Paciente){
                setTitle("Buscar - Paciente Encontrado");

                JLabel lblEstadoCivil = new JLabel("Estado Civil: " + ((Paciente) O).getEstadoCivil());
                lblEstadoCivil.setBounds(12, 190, 315, 15);
                panelW[0].add(lblEstadoCivil);
                
                JLabel lblDataDeCadastro = new JLabel("Data de cadastro: " + ((Paciente) O).getDataCadastro());
                lblDataDeCadastro.setBounds(12, 225, 315, 15);
                panelW[0].add(lblDataDeCadastro);
                
                JLabel lblDataDaUltima = new JLabel("Data da ultima consulta: " + ((Paciente) O).getDataUltimaConsulta());
                lblDataDaUltima.setBounds(12, 260, 315, 15);
                panelW[0].add(lblDataDaUltima);

                if(O instanceof PacienteComPlano){

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
                    
                    JLabel lblNumeroDaCarteirinha = new JLabel("Numero da Carteirinha: " + ((PacienteComPlano) O).getNroCarteirinha());
                    lblNumeroDaCarteirinha.setBounds(12, 15, 315, 15);
                    panelW[1].add(lblNumeroDaCarteirinha);
                    
                    JLabel lblData = new JLabel("Data de Ingresso no Plano: " + ((PacienteComPlano) O).getDataIngressoPlano());
                    lblData.setBounds(12, 50, 315, 15);
                    panelW[1].add(lblData);
                    
                    String aux = null;
                    if(((PacienteComPlano) O).getPeriodoCarencia() == true) aux = "Sim";
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
        
                }else if(O instanceof PacienteSemPlano){
                    setBounds(100, 100, 400, 610);

                    panelW[0] = new JPanel();
                    panelW[0].setLayout(null);
                    panelW[0].setBackground(Color.WHITE);
                    panelW[0].setBounds(27, 420, 342, 86);
                    contentPane.add(panelW[0]);
        
                    panelB[0] = new JPanel();
                    panelB[0].setLayout(null);
                    panelB[0].setBackground(Color.BLACK);
                    panelB[0].setBounds(27, 390, 210, 30);
                    contentPane.add(panelB[0]);
                    
                    JLabel lblDadosAdicionais = new JLabel("Dados Adicionais");
                    lblDadosAdicionais.setForeground(Color.WHITE);
                    lblDadosAdicionais.setFont(new Font("Dialog", Font.BOLD, 18));
                    lblDadosAdicionais.setBackground(Color.WHITE);
                    lblDadosAdicionais.setBounds(18, 5, 180, 22);
                    panelB[1].add(lblDadosAdicionais);
                    
                    JLabel lblPossuiDesconto = new JLabel("Possui desconto: " + ((PacienteSemPlano) O).getPossuiDesconto());
                    lblPossuiDesconto.setBounds(12, 15, 315, 15);
                    panelW[1].add(lblPossuiDesconto);
                    
                    JLabel lblValor = new JLabel("Valor da ultima consulta: " + ((PacienteSemPlano) O).getDataUltimaConsulta());
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
            }else if(O instanceof Funcionario){
                this.type = "F";
                setTitle("Buscar - Funcionario Encontrado");

                panelW[0].setBounds(27, 58, 342, 330);

                JLabel lblDataAdmissaoCLinica = new JLabel("Data de admissão na clínica: " + ((Funcionario) O).getDataAdmissaoClinica());
                lblDataAdmissaoCLinica.setBounds(12, 190, 315, 15);
                panelW[0].add(lblDataAdmissaoCLinica);
                
                JLabel lblNroCarteiraTrabalho = new JLabel("Numero da carteira de trabalho: " + ((Funcionario) O).getNroCarteiraTrabalho());
                lblNroCarteiraTrabalho.setBounds(12, 225, 315, 15);
                panelW[0].add(lblNroCarteiraTrabalho);
                
                JLabel lblUsuario = new JLabel("Usuario: " + ((Funcionario) O).getUsuario());
                lblUsuario.setBounds(12, 260, 315, 15);
                panelW[0].add(lblUsuario);

                JLabel lblSenha = new JLabel("Senha: " + ((Funcionario) O).getSenha());
                lblSenha.setBounds(12, 295, 315, 15);
                panelW[0].add(lblSenha);

                if(O instanceof DemaisFuncionarios){
                    panelW[1] = new JPanel();
                    panelW[1].setLayout(null);
                    panelW[1].setBackground(Color.WHITE);
                    panelW[1].setBounds(27, 445, 342, 95);
                    contentPane.add(panelW[1]);
        
                    panelB[1] = new JPanel();
                    panelB[1].setLayout(null);
                    panelB[1].setBackground(Color.BLACK);
                    panelB[1].setBounds(27, 415, 210, 30);
                    contentPane.add(panelB[1]);
                    
                    JLabel lblDadosAdicionais = new JLabel("Dados Adicionais");
                    lblDadosAdicionais.setForeground(Color.WHITE);
                    lblDadosAdicionais.setFont(new Font("Dialog", Font.BOLD, 18));
                    lblDadosAdicionais.setBackground(Color.WHITE);
                    lblDadosAdicionais.setBounds(18, 5, 180, 22);
                    panelB[1].add(lblDadosAdicionais);
                    
                    JLabel lblSalarioBase = new JLabel("Salario base: " + ((DemaisFuncionarios) O).getSalarioBase());
                    lblSalarioBase.setBounds(12, 15, 315, 15);
                    panelW[1].add(lblSalarioBase);
                    
                    JLabel lblCargo = new JLabel("Cargo: " + ((DemaisFuncionarios) O).getCargo());
                    lblCargo.setBounds(12, 50, 315, 15);
                    panelW[1].add(lblCargo);
        
                    btnVisualizarEndereco = new JButton("Visualizar Endereço");
                    btnVisualizarEndereco.setBounds(27, 576, 205, 25);
                    contentPane.add(btnVisualizarEndereco);
                    btnVisualizarEndereco.addActionListener(tratador);
            
                    btnVoltar = new JButton("Voltar");
                    btnVoltar.setBounds(246, 576, 125, 25);
                    btnVoltar.setBackground(Color.RED);
                    btnVoltar.setForeground(Color.WHITE);
                    btnVoltar.addActionListener(tratador);
                    contentPane.add(btnVoltar);

                }else if(O instanceof Medico){
                    setBounds(100, 100, 400, 710);

                    panelW[1] = new JPanel();
                    panelW[1].setLayout(null);
                    panelW[1].setBackground(Color.WHITE);
                    panelW[1].setBounds(27, 445, 342, 160);
                    contentPane.add(panelW[1]);
        
                    panelB[1] = new JPanel();
                    panelB[1].setLayout(null);
                    panelB[1].setBackground(Color.BLACK);
                    panelB[1].setBounds(27, 415, 220, 30);
                    contentPane.add(panelB[1]);
                    
                    JLabel lblDadosDoMedico = new JLabel("Dados do Medico");
                    lblDadosDoMedico.setForeground(Color.WHITE);
                    lblDadosDoMedico.setFont(new Font("Dialog", Font.BOLD, 18));
                    lblDadosDoMedico.setBackground(Color.WHITE);
                    lblDadosDoMedico.setBounds(18, 5, 180, 22);
                    panelB[1].add(lblDadosDoMedico);
                    
                    JLabel lblCRM = new JLabel("CRM: " + ((Medico) O).getCRM());
                    lblCRM.setBounds(12, 15, 315, 15);
                    panelW[1].add(lblCRM);
                    
                    JLabel lblNumeroConsultas = new JLabel("Numero de consultas: " + ((Medico) O).getNroConsultas());
                    lblNumeroConsultas.setBounds(12, 50, 315, 15);
                    panelW[1].add(lblNumeroConsultas);
                    
                    JLabel lblValorDaConsultaPlano = new JLabel("Valor da consulta com plano: " + ((Medico) O).getValorConsulta_plano());
                    lblValorDaConsultaPlano.setBounds(12, 85, 315, 15);
                    panelW[1].add(lblValorDaConsultaPlano);
                    
                    JLabel lblValorDaConsultaPrivada = new JLabel("Valor da consulta privada: " + ((Medico) O).getValorConsulta_privado());
                    lblValorDaConsultaPrivada.setBounds(12, 120, 315, 15);
                    panelW[1].add(lblValorDaConsultaPrivada);
        
                    btnVisualizarEndereco = new JButton("Visualizar Endereço");
                    btnVisualizarEndereco.setBounds(27, 635, 205, 25);
                    contentPane.add(btnVisualizarEndereco);
                    btnVisualizarEndereco.addActionListener(tratador);
            
                    btnVoltar = new JButton("Voltar");
                    btnVoltar.setBounds(246, 635, 125, 25);
                    btnVoltar.setBackground(Color.RED);
                    btnVoltar.setForeground(Color.WHITE);
                    btnVoltar.addActionListener(tratador);
                    contentPane.add(btnVoltar);
                }
            }

        }else if(O instanceof Consulta){
            this.type = "C";
            setTitle("Buscar - Consulta Encontrada");
            setBounds(100, 100, 600, 450);

            panelW[0] = new JPanel();
            panelW[0].setBounds(27, 58, 561, 295);
            panelW[0].setBackground(Color.WHITE);
            contentPane.add(panelW[0]);
            panelW[0].setLayout(null);

            panelB[0] = new JPanel();
            panelB[0].setBounds(27, 29, 235, 30);
            panelB[0].setBackground(Color.BLACK);
            contentPane.add(panelB[0]);
            panelB[0].setLayout(null);

            JLabel lblDadosDaConsulta = new JLabel("Dados da Consulta");
            lblDadosDaConsulta.setBounds(21, 5, 189, 22);
            lblDadosDaConsulta.setForeground(Color.WHITE);
            lblDadosDaConsulta.setBackground(Color.WHITE);
            lblDadosDaConsulta.setFont(new Font("Dialog", Font.BOLD, 18));
            panelB[0].add(lblDadosDaConsulta);
        
            JLabel lblData = new JLabel("Data: " + ((Consulta) O).getData());
            lblData.setBounds(12, 15, 637, 15);
            panelW[0].add(lblData);
            
            JLabel lblHorario = new JLabel("Horario: " + ((Consulta) O).getHorario());
            lblHorario.setBounds(12, 50, 637, 15);
            panelW[0].add(lblHorario);
            
            JLabel lblMedicamentosPaciente = new JLabel("Medicamentos do paciente: " + ((Consulta) O).getMedicamentosPaciente());
            lblMedicamentosPaciente.setBounds(12, 85, 637, 15);
            panelW[0].add(lblMedicamentosPaciente);
            
            JLabel lblObsGeral = new JLabel("Observações gerais: " + ((Consulta) O).getObsGeral());
            lblObsGeral.setBounds(12, 120, 637, 15);
            panelW[0].add(lblObsGeral);
            
            JLabel lblReceitaMedica = new JLabel("Receita medica: " + ((Consulta) O).getReceitaMedica());
            lblReceitaMedica.setBounds(12, 155, 637, 15);
            panelW[0].add(lblReceitaMedica);
            
            JLabel lblPaciente = new JLabel("Paciente: " + ((Consulta) O).getPaciente().getNome());
            lblPaciente.setBounds(12, 190, 637, 15);
            panelW[0].add(lblPaciente);
            
            JLabel lblMedico = new JLabel("Medico: " + ((Consulta) O).getMedico().getNome());
            lblMedico.setBounds(12, 225, 637, 15);
            panelW[0].add(lblMedico);
            
            JLabel lblFuncionarioAgendou = new JLabel("Funcionario que agendou: " + ((Consulta) O).getFuncionarioAgendou().getNome());
            lblFuncionarioAgendou.setBounds(12, 260, 637, 15);
            panelW[0].add(lblFuncionarioAgendou);
    
            btnVoltar = new JButton("Voltar");
            btnVoltar.setBounds(225, 375, 125, 25);
            btnVoltar.setBackground(Color.RED);
            btnVoltar.setForeground(Color.WHITE);
            btnVoltar.addActionListener(tratador);
            contentPane.add(btnVoltar);

        }else if(O instanceof ServicosExtras){
            this.type = "SE";
            setTitle("Buscar - Serviço Encontrado");
            setBounds(100, 100, 335, 270);

            panelW[0] = new JPanel();
            panelW[0].setBounds(27, 58, 270, 125);
            panelW[0].setBackground(Color.WHITE);
            contentPane.add(panelW[0]);
            panelW[0].setLayout(null);

            panelB[0] = new JPanel();
            panelB[0].setBounds(27, 29, 215, 30);
            panelB[0].setBackground(Color.BLACK);
            contentPane.add(panelB[0]);
            panelB[0].setLayout(null);

            JLabel lblDadosDoServiço = new JLabel("Dados do Serviço");
            lblDadosDoServiço.setBounds(21, 5, 276, 22);
            lblDadosDoServiço.setForeground(Color.WHITE);
            lblDadosDoServiço.setBackground(Color.WHITE);
            lblDadosDoServiço.setFont(new Font("Dialog", Font.BOLD, 18));
            panelB[0].add(lblDadosDoServiço);
        
            JLabel lblNome = new JLabel("Nome: ");
            lblNome.setBounds(12, 15, 285, 15);
            panelW[0].add(lblNome);
            
            JLabel lblTipo = new JLabel("Tipo: ");
            lblTipo.setBounds(12, 50, 285, 15);
            panelW[0].add(lblTipo);
            
            JLabel lblValorDoServiço = new JLabel("Valor do serviço: " );
            lblValorDoServiço.setBounds(12, 85, 285, 15);
            panelW[0].add(lblValorDoServiço);
    
            btnVoltar = new JButton("Voltar");
            btnVoltar.setBounds(170, 196, 125, 25);
            btnVoltar.setBackground(Color.RED);
            btnVoltar.setForeground(Color.WHITE);
            btnVoltar.addActionListener(tratador);
            contentPane.add(btnVoltar);
        }
    }

    private class TrataBotoes implements ActionListener{

        private static Object O;

        public TrataBotoes (Object O){
            TrataBotoes.O = O;
        }

        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnVoltar){
                BuscarDados pg = new BuscarDados(type);
                pg.setVisible(true);
				dispose();
            }else if(e.getSource() == btnVisualizarEndereco){
				VisualizarEndereco pg = new VisualizarEndereco((Pessoas) O);
                pg.setVisible(true);
			}
        }
    }
}
