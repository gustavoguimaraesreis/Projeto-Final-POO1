import Codigo.DadosPacientes;
import Codigo.Endereco;
import Codigo.PacienteComPlano;
import Codigo.PacienteSemPlano;
import Codigo.PlanodeSaude;

import java.util.*;

import InterfaceGrafica.PaginaInicial;
public class Principal {
	public static void main(String[] args) {

		ArrayList <PlanodeSaude> planosPossuidos = new ArrayList<PlanodeSaude>();
		Endereco e = new Endereco("a", 12, "b", "c", 34, "d");
		PlanodeSaude p = new PlanodeSaude("Bradesco", "2174929271", e);
		planosPossuidos.add(p);

		PacienteComPlano Gabriel = new PacienteComPlano("Gabriel C. B. de S. Amaral", "03890153186", "2277604410", "Masculino", "Solteiro", "16/05/2002", "25/10/2021", "Não tem", 233142, "24/10/2021", false, planosPossuidos);
		PacienteSemPlano Gustavo = new PacienteSemPlano("Gustavo Guimarães Reis", "12058687639", "123456789", "Masculino", "Casado", "23/12/2001", "25/10/2021", "Não tem", "Não", 0);

		Gabriel.setEndereco(e);
		Gustavo.setEndereco(e);

		DadosPacientes.cadastrar(Gabriel);
		DadosPacientes.cadastrar(Gustavo);

		PaginaInicial page = new PaginaInicial();
		page.setVisible(true);
	}
}