package Aula04.Exercicio04;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi(10, "Joao");
        Zumbi zumbi2 = new Zumbi(12, "Jaime");

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());

        System.out.println(zumbi1.transfereVida(zumbi2, 6));
        System.out.println(zumbi1.transfereVida(zumbi2, 10));

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());
    }
}
