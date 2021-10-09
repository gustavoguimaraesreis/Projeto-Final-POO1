import java.util.ArrayList;

public class PacienteComPlano extends Paciente {
	private int nroCarteirinha;
	private String dataIngressoPlano;
	private boolean periodoCarencia;
	//Adicionei esse metodo pois um paciente com plano de saude pode ter um ou mais planos.
	private ArrayList<PlanodeSaude> planosPossuidos = new ArrayList<PlanodeSaude>();

	public void setNroCarteirinha(int nroCarteirinha) {
		this.nroCarteirinha = nroCarteirinha;
	}
	public void setDataIngressoPlano(String dataIngressoPlano) {
		this.dataIngressoPlano = dataIngressoPlano;
	}
	public void setPeriodoCarencia(boolean periodoCarencia) {
		this.periodoCarencia = periodoCarencia;
	}
	public void setPlanosPossuidos(ArrayList<PlanodeSaude> planosPossuidos) {
		this.planosPossuidos = planosPossuidos;
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
	public ArrayList<PlanodeSaude> getPlanosPossuidos() {
		return planosPossuidos;
	}
	//Metodo pra adicionar mais um plano de saude no arraylist.
	public void adicionarNovoPlano(PlanodeSaude plano){
		this.planosPossuidos.add(plano);
	}

	public PacienteComPlano (String nome, String cpf, String rg, String sexo, String estadoCivil, String dtNascimento, String dtCadastro,
	String dataUltimaConsulta, int nroCarteirinha, String dataIngressoPlano, boolean periodoCarencia, ArrayList<PlanodeSaude> planosPossuidos){
		super(nome, cpf, rg, sexo, estadoCivil, dtNascimento, dtCadastro, dataUltimaConsulta);
		setNroCarteirinha(nroCarteirinha);
		setPeriodoCarencia(periodoCarencia);
		setDataIngressoPlano(dataIngressoPlano);
		setPlanosPossuidos(planosPossuidos);
	}
}
