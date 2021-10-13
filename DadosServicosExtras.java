import java.util.ArrayList;

public class DadosServicosExtras {
    private static ArrayList<ServicosExtras> servicosExtras = new ArrayList<ServicosExtras>();

    public static void cadastrar(ServicosExtras s){
        servicosExtras.add(s);
        System.out.println("Total de Servicos Extras: ");
        System.out.println(servicosExtras.size());
    }

    public static void listar(){
        for(int i=0; i<servicosExtras.size(); i++) servicosExtras.get(i).mostrarDados;
    }

    public static ServicosExtras buscar(String nome){
        for(int i=0; i<servicosExtras.size(); i++)
            if(servicosExtras.get(i).getNome().equals(nome))
                return servicosExtras.get(i);

        return null;
    }

    public static boolean excluir(String nome){
        for(int i=0; i<servicosExtras.size(); i++){
            if(servicosExtras.get(i).getNome().equals(nome)){
                servicosExtras.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void gravar(){
        boolean r = Persistency.gravar(servicosExtras, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\servicosExtras.dat");
    }
}
