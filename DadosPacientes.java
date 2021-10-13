import java.util.ArrayList;

public class DadosPacientes {
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public void cadastrar(Paciente p){
        this.pacientes.add(p);
        System.out.println("Total de pacientes: ");
        System.out.println(this.pacientes.size());
    }

    public void listar(){
        for(int i=0; i<pacientes.size(); i++) pacientes.get(i).mostrarDados;
    }

    public Paciente buscar(String CPF){
        for(int i=0; i<pacientes.size(); i++)
            if(pacientes.get(i).getCPF().equals(CPF))
                return pacientes.get(i);

        return null;
    }

    public boolean excluir(String CPF){
        for(int i=0; i<pacientes.size(); i++){
            if(pacientes.get(i).getCPF().equals(CPF)){
                pacientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public void gravar(){
        boolean r = Persistency.gravar(pacientes, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\pacientes.dat");
    }
}
