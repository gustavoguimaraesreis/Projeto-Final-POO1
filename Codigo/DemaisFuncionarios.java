package Codigo;

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
	public static void setGratificacao(float gratificacao) {
		DemaisFuncionarios.gratificacao = gratificacao;
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
	String dtNascimento, int nroCarTrabalho, String usuario, String senha, float salarioBase, String cargo){
		super(nome, cpf, rg, sexo, dtAdClinica, dtNascimento, nroCarTrabalho, usuario, senha);
		setCargo(cargo);
		setSalarioBase(salarioBase);
	}

	public boolean bonificacaoAniversarial(String dataAtual){
		boolean check = true;
		for(int i=0; i<5; i++)
			if(dataAtual.charAt(i) != super.getDataNascimento().charAt(i)) check = false;

		if(check == false) System.out.println("O aniversario do funcionario em questão ainda não chegou!\n");
		else{
			System.out.println("Parabéns! O seu aniversario chegou e você tem direito a escolher um dos serviços abaixo, estéticos ou de relexamento, para realizar uma sessão gratuita.\n");
			DadosServicosExtras.listar();
		}

		return check;
	}

	//parte 3, letra i:
	public float calcularSalario() {
		if(Consulta.getNroConsultas() >= Consulta.getLimiteConsultas()) 
			return salarioBase + gratificacao;
		
		System.out.println("O limite de consultas mensais não foi atingido");
		return salarioBase;
	}
	
	public void mostrarDados(){
		super.mostrarDados();
        System.out.println("Salário base: " + getSalarioBase());
        System.out.println("Cargo dentro da Clínica: " + getCargo());
		System.out.println();
    }
}