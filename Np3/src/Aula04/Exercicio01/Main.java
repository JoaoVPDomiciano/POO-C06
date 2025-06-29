package Aula04.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();

        zumbi.vida = 10;
        zumbi.defesa = 8;
        zumbi.ataque = 12;

        System.out.println("O Zumbi possui - Vida: " + zumbi.vida + " - Defesa: " + zumbi.defesa + " - Ataque: " + zumbi.ataque);
    }
}
