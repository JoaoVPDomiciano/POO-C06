package Aula04.Exercicio04;

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

    public boolean transfereVida(Zumbi zumbiAlvo, double quantidade){
        if (vida > quantidade){
            zumbiAlvo.vida += quantidade;
            vida -= quantidade;
            return true;
        }
        return false;
    }
}
