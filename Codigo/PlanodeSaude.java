package Codigo;

public class PlanodeSaude {
	private String nome;
	private String CNPJ;
	private Endereco endereco;

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public PlanodeSaude (String nome, String CNPJ, Endereco endereco){
		setCNPJ(CNPJ);
		setNome(nome);
		setEndereco(endereco);
	}
}
