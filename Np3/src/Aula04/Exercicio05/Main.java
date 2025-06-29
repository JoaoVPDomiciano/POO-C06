package Aula04.Exercicio05;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Joao", 10);
        Arma excalibur = new Arma("Excalibur", 5, 4, "Uma espada muito foda!");

        personagem.arma = excalibur;

        personagem.arma.mostraInfoArma();
        personagem.tomarDano();
        personagem.tomarDano();
        personagem.usarArma();
        personagem.usarArma();
    }
}
