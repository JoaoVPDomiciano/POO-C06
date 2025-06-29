package Aula04.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi(10, "Joao");
        Zumbi zumbi2 = new Zumbi(12, "Jean");

        zumbi1.mostraVida();
        zumbi2.mostraVida();

        zumbi1.trasfereVida(zumbi2, 5);

        zumbi1.mostraVida();
        zumbi2.mostraVida();
    }
}
