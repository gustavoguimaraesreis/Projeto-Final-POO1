
public class PlanodeSaude {
	private String nome;
	private String CNPJ;

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public String getNome() {
		return nome;
	}

	public PlanodeSaude (String nome, String CNPJ){
		setCNPJ(CNPJ);
		setNome(nome);
	}
}
