import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Funcionario[] fs = new Funcionario[10];
		ArrayList<String> especialidades = new ArrayList<>();
		ArrayList<PlanodeSaude> planosAtendidos = new ArrayList<>();
		Endereco e = new Endereco("Rua Jorge Martins Pinto", 744, "Ap203", "Santa Monica", 38408230, "Uberlandia");
		PlanodeSaude plano = new PlanodeSaude("Bradesco", "232848352", e);

		especialidades.add("Cardiologista");
		especialidades.add("Urologista");
		especialidades.add("Neurologista");

		planosAtendidos.add(plano);

		fs[0] = new DemaisFuncionarios("Gabriel", "03890153186", "2277604410", "Masculino", "12/05/2008", "16/05/2002", 12854932, "gcbsamaral", "gabriel123", 1300, "Atendente");
		fs[1] = new Medico("Joao Paulo", "12058687639", "864362", "Masculino", "03/04/2009", "13/01/2004", 4854782, "joaopauloincrivel", "jp12345", "4561392", especialidades, 3462, 300, 125, planosAtendidos);

		DadosFuncionarios.cadastrar(fs[0]);
		DadosFuncionarios.cadastrar(fs[1]);

		DadosFuncionarios.listar();

		fs[0].bonificacaoAniversarial("16/05/2021");
		fs[1].bonificacaoAniversarial("16/05/2021");
	}
}