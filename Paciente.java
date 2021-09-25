public class Paciente extends Pessoas {
	//revisar o tipo de dado;
	private byte estadoCivil;
	private String dataNascimento;
	private String dataCadastro;
	private String ultimaConsulta;
	
	
///////Problema do estado civil:
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
////////////////	
		
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getUltimaConsulta() {
		return ultimaConsulta;
	}
	public void setUltimaConsulta(String ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}
	
	public Paciente(String nome, String cpf, String rg, String sexo, String estadoCivil,
	String dtNascimento, String dtCadastro, String UltimaConsulta) {
		super(nome, cpf, rg, sexo);
		setEstadoCivil(estadoCivil);
		setDataNascimento(dtNascimento);
		setDataCadastro(dtCadastro);
		setUltimaConsulta(UltimaConsulta);
	}
}