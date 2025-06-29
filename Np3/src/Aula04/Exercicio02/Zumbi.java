package Aula04.Exercicio02;

public class Zumbi {
    double vida;
    String nome;

    public Zumbi(double vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }

    public void mostraVida(){
        System.out.println("Vida do Zumbi: " + nome + " - " + vida);
    }

    public void trasfereVida(Zumbi zumbiAlvo, double quantidade){
        System.out.println("O zumbi " + zumbiAlvo.nome + " recebeu " + quantidade + " de vida do zumbi " + nome);
        zumbiAlvo.vida += quantidade;
        vida -= quantidade;
    }
}
