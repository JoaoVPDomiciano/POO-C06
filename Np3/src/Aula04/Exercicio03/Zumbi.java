package Aula04.Exercicio03;

public class Zumbi {
    double vida;
    String nome;

    public Zumbi(double vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }

    public double mostraVida(){
        return vida;
    }

    public void tranfereVida(Zumbi zumbiAlvo, double quantidade){
        zumbiAlvo.vida += quantidade;
        vida -= quantidade;
    }
}
