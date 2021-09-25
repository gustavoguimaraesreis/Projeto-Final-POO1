
public class PacienteComPlano extends Paciente {
	private int nroCarteirinha;
	private String dataIngressoPlano;
	private boolean periodoCarencia;

	public void setNroCarteirinha(int nroCarteirinha) {
		this.nroCarteirinha = nroCarteirinha;
	}
	public void setDataIngressoPlano(String dataIngressoPlano) {
		this.dataIngressoPlano = dataIngressoPlano;
	}
	public void setPeriodoCarencia(boolean periodoCarencia) {
		this.periodoCarencia = periodoCarencia;
	}
	public String getDataIngressoPlano() {
		return dataIngressoPlano;
	}
	public int getNroCarteirinha() {
		return nroCarteirinha;
	}
	public boolean getPeriodoCarencia(){
		return periodoCarencia;
	}

	public PacienteComPlano (String nome, String cpf, String rg, String sexo, String estadoCivil, String dtNascimento,
	String dtCadastro, String UltimaConsulta, int nroCarteirinha, String dataIngressoPlano, boolean periodoCarencia){
		super(nome, cpf, rg, sexo, estadoCivil, dtNascimento, dtCadastro, UltimaConsulta);
		setNroCarteirinha(nroCarteirinha);
		setPeriodoCarencia(periodoCarencia);
		setDataIngressoPlano(dataIngressoPlano);
	}
}
