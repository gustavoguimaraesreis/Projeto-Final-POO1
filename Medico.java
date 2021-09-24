
public class Medico extends Funcionario {
	private String CRM;
	//revisar data type
	private String especialidades;
	private int nroConsultas;
	//revisar valorConsulta(paciente com plano e sem plano ?)
	private float valorConsulta;

	//Construtor default, sem parâmetros
	public Medico(){
		super();
		this.CRM = " ";
		this.especialidades = " ";
		this.nroConsultas = 0;
		this.valorConsulta = 0;
	}


}
