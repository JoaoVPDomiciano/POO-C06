package Aula04.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi(10, "Joao");
        Zumbi zumbi2 = new Zumbi(12, "Jose");

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

        zumbi2 = zumbi1;

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());
    }
}
