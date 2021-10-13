import java.io.Serializable;

public abstract class Funcionario extends Pessoas implements Mostrar, Serializable {
	private String dataAdmissaoClinica;
	private int nroCarteiraTrabalho;
	private String usuario;
	private String senha;
	
	public String getDataAdmissaoClinica() {
		return dataAdmissaoClinica;
	}

	public void setDataAdmissaoClinica(String dataAdmissaoClinica) {
		this.dataAdmissaoClinica = dataAdmissaoClinica;
	}

	public int getNroCarteiraTrabalho() {
		return nroCarteiraTrabalho;
	}

	public void setNroCarteiraTrabalho(int nroCarteiraTrabalho) {
		this.nroCarteiraTrabalho = nroCarteiraTrabalho;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Funcionario(String nome, String cpf, String rg, String sexo, String dtAdClinica,
	String dtNascimento, int nroCarTrabalho, String usuario, String senha) {
		super(nome, cpf, rg, sexo, dtNascimento);
		setDataAdmissaoClinica(dtAdClinica);
		setNroCarteiraTrabalho(nroCarTrabalho);
		setUsuario(usuario);
		setSenha(senha);
	}
	
	
	
	//Método abstrato (parte 5, letra b)
	public abstract float calcularSalario();
	
}