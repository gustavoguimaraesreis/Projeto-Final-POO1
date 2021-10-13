import java.util.ArrayList;

public class DadosFuncionarios {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static void cadastrar(Funcionario f){
        funcionarios.add(f);
        System.out.println("Total de funcionarios: ");
        System.out.println(funcionarios.size());
    }

    public static void listar(){
        for(int i=0; i<funcionarios.size(); i++) funcionarios.get(i).mostrarDados;
    }

    public static Funcionario buscar(String CPF){
        for(int i=0; i<funcionarios.size(); i++)
            if(funcionarios.get(i).getCPF().equals(CPF))
                return funcionarios.get(i);

        return null;
    }

    public static boolean excluir(String CPF){
        for(int i=0; i<funcionarios.size(); i++){
            if(funcionarios.get(i).getCPF().equals(CPF)){
                funcionarios.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void gravar(){
        boolean r = Persistency.gravar(funcionarios, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\funcionarios.dat");
    }
}
