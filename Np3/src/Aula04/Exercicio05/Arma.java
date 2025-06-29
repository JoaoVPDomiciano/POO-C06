package Aula04.Exercicio05;

public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public Arma(String nome, int poder, int resistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    public void mostraInfoArma(){
        System.out.println("Nome: " + nome + " - Poder: " + poder + " - Resistencia: " + resistencia + " - Descricao: " + descricao);
    }
}
