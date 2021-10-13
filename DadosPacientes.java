import java.util.ArrayList;

public class DadosPacientes {
    private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public static void cadastrar(Paciente p){
        pacientes.add(p);
        System.out.println("Total de pacientes: ");
        System.out.println(pacientes.size());
    }

    public static void listar(){
        for(int i=0; i<pacientes.size(); i++) pacientes.get(i).mostrarDados();
    }

    public static Paciente buscar(String CPF){
        for(int i=0; i<pacientes.size(); i++)
            if(pacientes.get(i).getCPF().equals(CPF))
                return pacientes.get(i);

        return null;
    }

    public static boolean excluir(String CPF){
        for(int i=0; i<pacientes.size(); i++){
            if(pacientes.get(i).getCPF().equals(CPF)){
                pacientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void gravar(){
        boolean r = Persistency.gravar(pacientes, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\pacientes.dat");
        if(r == true)
            System.out.println("Os dados dos Pacientes da Clínica foram gravados em formato binário corretamente");
        else 
            System.out.println("Erro de gravação em arquivo");
    }
}
