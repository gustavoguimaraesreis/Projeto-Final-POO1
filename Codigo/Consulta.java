package Codigo;

import java.util.ArrayList;
import java.io.Serializable;

public class Consulta implements Mostrar, Serializable{
	private String data;
	private String horario;
	private String medicamentosPaciente;
	private String obsGeral;
	private String receitaMedica;
	private Paciente paciente;
	private Medico medico;
	private DemaisFuncionarios funcionarioAgendou;
	private ArrayList<Exame> exames;

	//atributos estáticos: (parte3, letra e)
	private static int nroConsultas;
	private static int limiteConsultas;

	public void setData(String data) {
		this.data = data;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setMedicamentosPaciente(String medicamentosPaciente) {
		this.medicamentosPaciente = medicamentosPaciente;
	}
	public void setObsGeral(String obsGeral) {
		this.obsGeral = obsGeral;
	}
	public void setReceitaMedica(String receitaMedica) {
		this.receitaMedica = receitaMedica;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public void setFuncionarioAgendou(DemaisFuncionarios funcionarioAgendou) {
		this.funcionarioAgendou = funcionarioAgendou;
	}
	public static void setNroConsultas(int nroConsultas) {
		Consulta.nroConsultas = nroConsultas;
	}
	public static void setLimiteConsultas(int limiteConsultas) {
		Consulta.limiteConsultas = limiteConsultas;
	}
	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}
	public String getData() {
		return data;
	}
	public String getHorario() {
		return horario;
	}
	public String getMedicamentosPaciente() {
		return medicamentosPaciente;
	}
	public String getObsGeral() {
		return obsGeral;
	}
	public String getReceitaMedica() {
		return receitaMedica;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public DemaisFuncionarios getFuncionarioAgendou() {
		return funcionarioAgendou;
	}
	public static int getNroConsultas() {
		return nroConsultas;
	}
	public static int getLimiteConsultas() {
		return limiteConsultas;
	}
	public ArrayList<Exame> getExames() {
		return exames;
	}
	//Metodo para adicionar um exame ao arrayList
	public void adicionarExame(Exame Ex){
		this.exames.add(Ex);
	}

	public Consulta (String data, String horario, Paciente paciente, Medico medico, DemaisFuncionarios funcionarioAgendou){
		setData(data);
		setHorario(horario);
		setPaciente(paciente);
		setMedico(medico);
		setFuncionarioAgendou(funcionarioAgendou);
	}

	public Consulta(Paciente paciente, Medico medico){
		setPaciente(paciente);
		setMedico(medico);
	}
	//Método ->(Parte 3, letra d):
	public void ZerarNroConsultas() {
		setNroConsultas(0);
	}

	//Parte 4
	public void realizarConsulta(){
		//Medico
		this.medico.setNroConsultas((this.medico.getNroConsultas())+1);
		this.medico.setSomaConsultasMes(this);
		//Paciente
		this.paciente.setDataUltimaConsulta(this.data);
		//Demais
		Consulta.nroConsultas++;
	}
	public void mostrarDados(){
        System.out.println("Data da Consulta: " + getData());
        System.out.println("Horário:" + getHorario());
		System.out.println("Nome do Funcionário que marcou a consulta:" + getFuncionarioAgendou().getNome());
		System.out.println("Nome do Paciente:" + getPaciente().getNome());
		System.out.println("Nome do Médico que realizou a consulta:" + getMedico().getNome());
		System.out.println("Medicamentos do Paciente:" + getMedicamentosPaciente());
		System.out.println("Observação geral do Médico:" + getObsGeral());
		System.out.println("Receita Médica:" + getReceitaMedica());
		System.out.print("Exames que serão realizados pelo paciente:");	
		for(int i=0; i<this.getExames().size(); i++){
			if(i < this.exames.size()-1) System.out.print(this.exames.get(i).getNomeExame() + ", ");
			else System.out.println(this.exames.get(i).getNomeExame());
		}
		System.out.println();
    }
}