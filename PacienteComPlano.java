import java.util.ArrayList;

public class PacienteComPlano extends Paciente {
	private int nroCarteirinha;
	private String dataIngressoPlano;
	private boolean periodoCarencia;
	private ArrayList<PlanodeSaude> planosPossuidos;

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

	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Numero da Carteirinha: " + getNroCarteirinha());
		System.out.println("Data de Ingresso no Plano: " + getDataIngressoPlano());
		System.out.println("Periodo de Carencia: " + getPeriodoCarencia());
		System.out.print("Planos de Saúde Possuidos: ");
		for(int i=0; i<this.getPlanosPossuidos().size(); i++){
			if(i < this.planosPossuidos.size()-1) System.out.print(this.planosPossuidos.get(i).getNome() + ", ");
			else System.out.println(this.planosPossuidos.get(i).getNome());
		}
		System.out.println();
	}
}
