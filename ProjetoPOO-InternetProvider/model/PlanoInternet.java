package model;

public class PlanoInternet {
    protected String nome;
    protected double preco;
    protected double velocidade;

    public PlanoInternet(String nome, double preco, double velocidade) {
        this.nome = nome;
        this.preco = preco;
        this.velocidade = velocidade;
    }

    public void exibirPlano(){
        System.out.println("Plano " + nome + " - R$" + preco + " - " + velocidade + "Mbs");
    }

    public String getNome() {
        return nome;
    }
}