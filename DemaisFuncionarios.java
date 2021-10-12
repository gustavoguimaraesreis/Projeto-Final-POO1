
public class DemaisFuncionarios extends Funcionario{
	private float salarioBase;
	private String cargo;

	//atributo estático -> (parte3, letra f):
	private static float gratificacao;
	
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	///Parte 3, letra g:
	public static boolean setGratificacao(float gratificacao) {
		if(Consulta.getNroConsultas() >= Consulta.getLimiteConsultas()) {
			DemaisFuncionarios.gratificacao = gratificacao;
			return true;
		}
		else {
			System.out.println("O limite de consultas mensais não foi atingido");
			DemaisFuncionarios.gratificacao = 0;
			return false;
		}
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public String getCargo() {
		return cargo;
	}
	public static float getGratificacao() {
		return gratificacao;
	}

	public DemaisFuncionarios (String nome, String cpf, String rg, String sexo, String dtAdClinica,
	int nroCarTrabalho, String usuario, String senha, float salarioBase, String cargo){
		super(nome, cpf, rg, sexo, dtAdClinica, nroCarTrabalho, usuario, senha);
		setCargo(cargo);
		setSalarioBase(salarioBase);
	}

	//parte 3, letra i:
	public float calcularSalario() {
		return salarioBase + gratificacao;
	}
}
