
public class DemaisFuncionarios extends Funcionario{
	private float salarioBase;
	private String cargo;
	
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public String getCargo() {
		return cargo;
	}

	public DemaisFuncionarios (String nome, String cpf, String rg, String sexo, String dtAdClinica,
	int nroCarTrabalho, String usuario, String senha, float salarioBase, String cargo){
		super(nome, cpf, rg, sexo, dtAdClinica, nroCarTrabalho, usuario, senha);
		setCargo(cargo);
		setSalarioBase(salarioBase);
	}
}
