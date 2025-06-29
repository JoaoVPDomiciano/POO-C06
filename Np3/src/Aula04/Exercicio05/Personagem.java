package Aula04.Exercicio05;

public class Personagem {
    public String nome;
    public int pontos;
    public Arma arma;

    public Personagem(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public void usarArma(){
        if (arma.resistencia <= 2) {
            System.out.println("A arma " + arma.nome + " quebrou!");
            arma = null;
        } else {
            System.out.println("O personagem " + nome + " usou a arma " + arma.nome);
            arma.resistencia -= 2;
        }
    }

    public void tomarDano(){
        if (pontos <= 5){
            System.out.println("O personagem " + nome + " morreu!");
        } else {
            System.out.println("O personagem " + nome + " tomou 5 de dano");
            pontos -= 5;
        }
    }
}
