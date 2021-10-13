import java.io.Serializable;

public class Paciente extends Pessoas implements Serializable{
	private byte estadoCivil;
	private String dataNascimento;
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
	public String getDataUltimaConsulta() {
		return dataUltimaConsulta;
	}
	public void setDataUltimaConsulta(String dataUltimaConsulta) {
		this.dataUltimaConsulta = dataUltimaConsulta;
	}
	
	public Paciente(String nome, String cpf, String rg, String sexo, String estadoCivil,
	String dtNascimento, String dtCadastro, String dataUltimaConsulta) {
		super(nome, cpf, rg, sexo);
		setEstadoCivil(estadoCivil);
		setDataNascimento(dtNascimento);
		setDataCadastro(dtCadastro);
		setDataUltimaConsulta(dataUltimaConsulta);
	}
}