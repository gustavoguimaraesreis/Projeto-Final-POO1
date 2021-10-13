import java.io.Serializable;

public class Paciente extends Pessoas implements Mostrar, Serializable{
	private byte estadoCivil;
	private String dataCadastro;
	private String dataUltimaConsulta;
	
	public String getEstadoCivil() {
		if(estadoCivil == 0)
			return "solteiro";
		else if(estadoCivil == 1)
			return "casado";
		else 
			return "divorciado";
		
	}
	public void setEstadoCivil(String estadoCivil) {
		if(estadoCivil == "solteiro")
			this.estadoCivil = 0;
		else if(estadoCivil == "casado")
			this.estadoCivil = 1;
		else
			this.estadoCivil = 2;
	}
		
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getDataUltimaConsulta() {
		return dataUltimaConsulta;
	}
	public void setDataUltimaConsulta(String dataUltimaConsulta) {
		this.dataUltimaConsulta = dataUltimaConsulta;
	}
	
	public Paciente(String nome, String cpf, String rg, String sexo, String estadoCivil,
	String dtNascimento, String dtCadastro, String dataUltimaConsulta) {
		super(nome, cpf, rg, sexo, dtNascimento);
		setEstadoCivil(estadoCivil);
		setDataCadastro(dtCadastro);
		setDataUltimaConsulta(dataUltimaConsulta);
	}

	public void bonificacaoAniversarial(String dataAtual){
		String aux = super.getDataNascimento();
		boolean check = true;
		for(int i=0; i<5; i++)
			if(dataAtual.charAt(i) != aux.charAt(i)) check = false;

		if(check == false) System.out.println("O aniversario do paciente em questão ainda não chegou!");

		else{
			System.out.println("Parabéns! O seu aniversario chegou e você tem direito a escolher um dos serviços abaixo, estéticos ou de relexamento, e recebera um desconto de 50% no valor de uma sessão.");
			DadosServicosExtras.listar();
		}
	}
	//Finalizar
	public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo:" + getTipo());
        System.out.println("Valor do Servico: " + getValorServico());
    }
}