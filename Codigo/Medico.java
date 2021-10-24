package Codigo;

import java.util.ArrayList;

public class Medico extends Funcionario {
	private String CRM;
	private ArrayList<String> especialidades;
	private int nroConsultas;
	private float valorConsulta_privado;
	private float valorConsulta_plano;
	private ArrayList<PlanodeSaude> planosAtendidos;

	//parte 3, letra h:
	private float SomaConsultasMes;

	public String getCRM() {
		return CRM;
	}
	public ArrayList<String> getEspecialidades() {
		return especialidades;
	}
	public int getNroConsultas() {
		return nroConsultas;
	}
	public float getValorConsulta_privado() {
		return valorConsulta_privado;
	}
	public float getValorConsulta_plano() {
		return valorConsulta_plano;
	}
	public ArrayList<PlanodeSaude> getPlanosAtendidos() {
		return planosAtendidos;
	}
	public float getSomaConsultasMes() {
		return SomaConsultasMes;
	}
	public void setCRM(String CRM) {
		this.CRM = CRM;
	}
	public void setEspecialidades(ArrayList<String> especialidades) {
		this.especialidades = especialidades;
	}
	public void setValorConsulta_privado(float valorConsulta) {
		this.valorConsulta_privado = valorConsulta;
	}
	public void setValorConsulta_plano(float valorConsulta) {
		this.valorConsulta_plano = valorConsulta;
	}
	public void setNroConsultas(int nroConsultas) {
		this.nroConsultas = nroConsultas;
	}
	public void setPlanosAtendidos(ArrayList<PlanodeSaude> planosAtendidos) {
		this.planosAtendidos = planosAtendidos;
	}
	public void setSomaConsultasMes(Consulta consulta) {
		if(consulta.getPaciente() instanceof PacienteComPlano) {
			SomaConsultasMes += getValorConsulta_plano();
		}
		else {
			SomaConsultasMes += getValorConsulta_privado();
		}
	}
	//Metodo pra adicionar mais um plano de saude no arraylist.
	public void adicionarNovoPlano(PlanodeSaude plano){
		this.planosAtendidos.add(plano);
	}
	//Metodo pra adicionar mais uma especialidade no arraylist.
	public void adicionarEspecialidade(String especialidade){
		this.especialidades.add(especialidade);
	}

	public Medico (String nome, String cpf, String rg, String sexo, String dtAdClinica, String dtNascimento, int nroCarTrabalho, String usuario,
	String senha, String CRM, ArrayList<String> especialidades, int nroConsultas, float valorConsulta_privado, float valorConsulta_plano,
	ArrayList<PlanodeSaude> planosAtendidos){
		super(nome, cpf, rg, sexo, dtAdClinica, dtNascimento, nroCarTrabalho, usuario, senha);
		setCRM(CRM);
		setEspecialidades(especialidades);
		setNroConsultas(nroConsultas);
		setValorConsulta_privado(valorConsulta_privado);
		setValorConsulta_plano(valorConsulta_plano);
		setPlanosAtendidos(planosAtendidos);
	}

	//Construtor apenas com cpf e os planos atendidos
	public Medico (String cpf, ArrayList<PlanodeSaude> planosAtendidos){
		super(" ", cpf, " ", " ", " ", " ", 0, " ", " ");
		setCRM(" ");
		ArrayList<String> especialidadesVazio = new ArrayList<String>();
		setEspecialidades(especialidadesVazio);
		setNroConsultas(0);
		setValorConsulta_privado(0);
		setValorConsulta_plano(0);
		setPlanosAtendidos(planosAtendidos);
	}

	//Construtor default
	public Medico(){
		super(" ", " ", " ", " ", " ", " ", 0, " ", " ");
		setCRM(" ");
		ArrayList<String> especialidadesVazio = new ArrayList<String>();
		setEspecialidades(especialidadesVazio);
		setNroConsultas(0);
		setValorConsulta_privado(0);
		setValorConsulta_plano(0);
		ArrayList<PlanodeSaude> planodeSaudesVazio = new ArrayList<PlanodeSaude>();
		setPlanosAtendidos(planodeSaudesVazio);
	}
	public float calcularSalario() {
		return getSomaConsultasMes();
	}
	//parte 3, letra h:
	public void ZerarConsultasMes() {
		this.SomaConsultasMes = 0.00f;
	}

	public void bonificacaoAniversarial(String dataAtual){
		String aux = super.getDataNascimento();
		boolean check = true;
		for(int i=0; i<5; i++)
			if(dataAtual.charAt(i) != aux.charAt(i)) check = false;

		if(check == false) System.out.println("O aniversario do medico em questão ainda não chegou!\n");
		else{
			System.out.println("Parabéns! O seu aniversario chegou e você tem direito a escolher um dos serviços abaixo, estéticos ou de relexamento, para realizar uma sessão gratuita junto ao seu conjuge.\n");
			DadosServicosExtras.listar();
		}
	}
	
	public void mostrarDados(){
		super.mostrarDados();
        System.out.println("CRM: " + getCRM());
        System.out.print("Especialidades: ");
		for(int i=0; i<this.getEspecialidades().size(); i++){
			if(i < this.especialidades.size()-1) System.out.print(this.getEspecialidades().get(i) + ", ");
			else System.out.println(this.getEspecialidades().get(i));
		}
        System.out.println("Número de consultas desse mês: " + getNroConsultas());
		System.out.println("Valor da consulta privada: " + getValorConsulta_privado());
		System.out.println("Valor da consulta com plano: " + getValorConsulta_plano());
		System.out.print("Planos de Saúde Atendidos: ");
		for(int i=0; i<this.getPlanosAtendidos().size(); i++){
			if(i < this.planosAtendidos.size()-1) System.out.print(this.planosAtendidos.get(i).getNome() + ", ");
			else System.out.println(this.planosAtendidos.get(i).getNome());
		}
		System.out.println();
    }
	
}
