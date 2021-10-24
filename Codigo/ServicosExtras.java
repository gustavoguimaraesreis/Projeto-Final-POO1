package Codigo;

import java.io.Serializable;

public class ServicosExtras implements Mostrar, Serializable{

    private String nome;
    private String tipo; //estetico, relaxamento;
    private float valorServico;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getValorServico() {
        return valorServico;
    }
    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }

    public ServicosExtras(String nome, String tipo, float valor) {
        setNome(nome);
        setTipo(tipo);
        setValorServico(valor);
    }

    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo:" + getTipo());
        System.out.println("Valor do Servico: " + getValorServico());
    }

}
