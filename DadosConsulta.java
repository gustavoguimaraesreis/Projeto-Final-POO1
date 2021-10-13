import java.util.ArrayList;

public class DadosConsulta {
    private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public static void cadastrar(Consulta c){
        consultas.add(c);
        System.out.println("Total de consultas: ");
        System.out.println(consultas.size());
    }

    public static void listar(){
        for(int i=0; i<consultas.size(); i++) consultas.get(i).mostrarDados();
    }

    public static Consulta buscar(String data, String horario){
        for(int i=0; i<consultas.size(); i++)
            if((consultas.get(i).getData().equals(data)) && (consultas.get(i).getHorario().equals(horario)))
                return consultas.get(i);

        return null;
    }

    public static boolean excluir(String data, String horario){
        for(int i=0; i<consultas.size(); i++){
            if(consultas.get(i).getData().equals(data) && consultas.get(i).getHorario().equals(horario)){
                consultas.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void gravar(){
        boolean r = Persistency.gravar(consultas, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\consultas.dat");
        if(r == true)
            System.out.println("Os dados das Consultas foram gravados em formato binário corretamente");
        else 
            System.out.println("Erro de gravação em arquivo binário");
    }
}
