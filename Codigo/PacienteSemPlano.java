package Codigo;

public class PacienteSemPlano extends Paciente{
	private String possuiDesconto;
	private float valorUltimaConsulta;

	public void setPossuiDesconto(String possuiDesconto) {
		this.possuiDesconto = possuiDesconto;
	}
	public void setValorUltimaConsulta(float valorUltimaConsulta) {
		this.valorUltimaConsulta = valorUltimaConsulta;
	}
	public String getPossuiDesconto() {
		return possuiDesconto;
	}
	public float getValorUltimaConsulta() {
		return valorUltimaConsulta;
	}

	public PacienteSemPlano (String nome, String cpf, String rg, String sexo, String estadoCivil, String dtNascimento,
	String dtCadastro, String dataUltimaConsulta, String possuiDesconto, float valorUltimaConsulta){
		super(nome, cpf, rg, sexo, estadoCivil, dtNascimento, dtCadastro, dataUltimaConsulta);
		setValorUltimaConsulta(valorUltimaConsulta);
		setPossuiDesconto(possuiDesconto);
	}

	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Possui Desconto: " + getPossuiDesconto());
		System.out.println("Valor pago na ultima consulta: " + getValorUltimaConsulta());
		System.out.println();
	}
}
