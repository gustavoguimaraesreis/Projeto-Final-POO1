import java.util.ArrayList;

public class DadosConsulta {
    private ArrayList<Consulta> consultas = new ArrayList<Consulta>();

    public void cadastrar(Consulta c){
        this.consultas.add(c);
        System.out.println("Total de consultas: ");
        System.out.println(this.consultas.size());
    }

    public void listar(){
        for(int i=0; i<consultas.size(); i++) consultas.get(i).mostrarDados;
    }

    public Consulta buscar(String data, String horario){
        for(int i=0; i<consultas.size(); i++)
            if((consultas.get(i).getData().equals(data)) && (consultas.get(i).getHorario().equals(horario)))
                return consultas.get(i);

        return null;
    }

    public boolean excluir(String data, String horario){
        for(int i=0; i<consultas.size(); i++){
            if(consultas.get(i).getData().equals(data) && consultas.get(i).getHorario().equals(horario)){
                consultas.remove(i);
                return true;
            }
        }
        return false;
    }

    public void gravar(){
        boolean r = Persistency.gravar(consultas, "C:\\Users\\gcbsa\\OneDrive\\Documents\\College\\3° Período\\POO1\\Projeto Final\\Coding\\consultas.dat");
    }
}
