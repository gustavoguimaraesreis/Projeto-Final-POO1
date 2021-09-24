
public class Funcionário extends Pessoas {
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
	
	//CONTRUTRUTOR:
	public Funcionário(String nome, String cpf, String rg, String sexo, String dtAdClinica, int nroCarTrabalho,
							String usuario, String senha) {
		super(nome, cpf, rg, sexo);
		setDataAdmissaoClinica(dtAdClinica);
		setNroCarteiraTrabalho(nroCarTrabalho);
		setUsuario(usuario);
		setSenha(senha);
	}
	
}