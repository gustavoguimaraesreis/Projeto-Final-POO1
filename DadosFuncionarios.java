import java.util.ArrayList;

public class DadosFuncionarios {

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrar(Funcionario f){
        this.funcionarios.add(f);
        System.out.println("Total de funcionarios: ");
        System.out.println(this.funcionarios.size());
    }

    public void listar(){
        for(int i=0; i<funcionarios.size(); i++) funcionarios.get(i).mostrarDados;
    }

    public Funcionario buscar(String CPF){
        for(int i=0; i<funcionarios.size(); i++)
            if(funcionarios.get(i).getCPF().equals(CPF))
                return funcionarios.get(i);

        return null;
    }

    public boolean excluir(String CPF){
        for(int i=0; i<funcionarios.size(); i++){
            if(funcionarios.get(i).getCPF().equals(CPF)){
                funcionarios.remove(i);
                return true;
            }
        }
        return false;
    }

    public void gravar(){
        boolean r = Persistency.gravar(funcionarios, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\funcionarios.dat");
    }
}
