
public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private int CEP;
	private String cidade;

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCEP(int CEP) {
		this.CEP = CEP;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public int getCEP() {
		return CEP;
	}
	public String getCidade() {
		return cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public int getNumero() {
		return numero;
	}
	public String getRua() {
		return rua;
	}

	public Endereco (String rua, int numero, String complemento, String bairro, int CEP, String cidade){
		setBairro(bairro);
		setCEP(CEP);
		setCidade(cidade);
		setComplemento(complemento);
		setNumero(numero);
		setRua(rua);
	}
}
