
public class Consulta {
	private String data;
	private String horario;
	private String medicamentosPaciente;
	private String obsGeral;
	private String receitaMedica;
	private int metaConsultasMensais;
	private Paciente paciente;
	private Medico medico;

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
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
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
	public Paciente getPaciente() {
		return paciente;
	}
	public Medico getMedico() {
		return medico;
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


}
