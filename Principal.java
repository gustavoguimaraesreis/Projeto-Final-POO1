/*
import Codigo.Consulta;
import Codigo.DadosConsulta;
import Codigo.DadosFuncionarios;
import Codigo.DadosPacientes;
import Codigo.DadosServicosExtras;
import Codigo.DemaisFuncionarios;
import Codigo.Endereco;
import Codigo.Medico;
import Codigo.PacienteComPlano;
import Codigo.PacienteSemPlano;
import Codigo.PlanodeSaude;
import Codigo.ServicosExtras;

import java.util.*;
*/

import InterfaceGrafica.PaginaInicial;
public class Principal {
	public static void main(String[] args) {
		/*
		//Testes
		Endereco e = new Endereco("a", 12, "b", "c", 34, "d");

		ArrayList <PlanodeSaude> planos = new ArrayList<PlanodeSaude>();
		PlanodeSaude p = new PlanodeSaude("Bradesco", "2174929271", e);
		planos.add(p);

		PacienteComPlano Gabriel = new PacienteComPlano("Gabriel C. B. de S. Amaral", "03890153186", "2277604410", "Masculino", "Solteiro", "16/05/2002", "25/10/2021", "Não tem", 233142, "24/10/2021", false, planos);
		PacienteSemPlano Gustavo = new PacienteSemPlano("Gustavo Guimarães Reis", "12058687639", "123456789", "Masculino", "Casado", "23/12/2001", "25/10/2021", "Não tem", "Não", 0);
		Gabriel.setEndereco(e);
		Gustavo.setEndereco(e);

		ArrayList<String> especialidades = new ArrayList<String>();
		String aux = "Cardiologista";
		especialidades.add(aux);
		DemaisFuncionarios Gabriel1 = new DemaisFuncionarios("Gabriel C. B. de S. Amaral", "03890153186", "2277604410", "Masculino", "28/10/2021", "16/05/2002", 123456789, "gcbsa", "gabriel123", 1700, "Atendente");
		Medico Gustavo1 = new Medico("Gustavo Guimarães Reis", "12058687639", "123456789", "Masculino", "28/10/2021", "23/12/2001", 987654321, "GustavoGuimaraes", "gustavo123", "18266324", especialidades, 54, 250, 85, planos);
		Gabriel1.setEndereco(e);
		Gustavo1.setEndereco(e);

		Consulta c =  new Consulta("28/10/2021", "14h30m", Gabriel, Gustavo1, Gabriel1);
		c.setMedicamentosPaciente("Lorazepam");
		c.setObsGeral("Observar a pressão.");
		c.setReceitaMedica("Tomar o remedio 3x ao dia por 7 dias.");

		ServicosExtras se = new ServicosExtras("Pilates", "Relaxamento", 100);
		
		DadosPacientes.cadastrar(Gabriel);
		DadosPacientes.cadastrar(Gustavo);
		DadosFuncionarios.cadastrar(Gabriel1);
		DadosFuncionarios.cadastrar(Gustavo1);
		DadosConsulta.cadastrar(c);
		DadosServicosExtras.cadastrar(se);
		//Fim dos testes
		*/

		PaginaInicial page = new PaginaInicial();
		page.setVisible(true);
	}
}