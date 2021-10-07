
public class Consulta {
	private String data;
	private String horario;
	private String medicamentosPaciente;
	private String obsGeral;
	private String receitaMedica;
	private int metaConsultasMensais;
	//não entendi esses atributos:
	private Paciente paciente;
	private Medico medico;

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
	public void setMetaConsultasMensais(int metaConsultasMensais) {
		this.metaConsultasMensais = metaConsultasMensais;
	}
	public void setObsGeral(String obsGeral) {
		this.obsGeral = obsGeral;
	}
	public void setReceitaMedica(String receitaMedica) {
		this.receitaMedica = receitaMedica;
	}
	////
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	/////
	public static void setNroConsultas(int nroConsultas) {
		Consulta.nroConsultas = nroConsultas;
	}
	public static void setLimiteConsultas(int limiteConsultas) {
		Consulta.limiteConsultas = limiteConsultas;
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
	public int getMetaConsultasMensais() {
		return metaConsultasMensais;
	}
	public String getObsGeral() {
		return obsGeral;
	}
	public String getReceitaMedica() {
		return receitaMedica;
	}
	////Obs: revisar esses métodos:
	public Paciente getPaciente() {
		return paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	/////

	public static int getNroConsultas() {
		return nroConsultas;
	}

	public static int getLimiteConsultas() {
		return limiteConsultas;
	}

	public Consulta (String data, String horario, String medicamentosPaciente, String obsGeral,
	String receitaMedica, int metaConsultasMensais, Paciente paciente, Medico medico){
		setData(data);
		setHorario(horario);
		setMedicamentosPaciente(medicamentosPaciente);
		setObsGeral(obsGeral);
		setReceitaMedica(receitaMedica);
		setMetaConsultasMensais(metaConsultasMensais);
		setPaciente(paciente);
		setMedico(medico);
	}

	public Consulta(Paciente paciente, Medico medico){
		setPaciente(paciente);
		setMedico(medico);
	}
	//Método ->(Parte 3, letra d):
	public void ZerarNroConsultas() {
		setNroConsultas(0);
	}



}
