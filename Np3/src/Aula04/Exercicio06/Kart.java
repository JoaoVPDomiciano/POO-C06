package Aula04.Exercicio06;

public class Kart {
    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(String nome, Piloto piloto, String cilindradas, float velocidadeMaxima) {
        this.nome = nome;
        this.piloto = piloto;
        this.motor = new Motor(cilindradas, velocidadeMaxima);
    }

    public void pular(){
        System.out.println("O " + piloto.nome + " no kart " + nome + " está pulando!");
    }

    public void soltarTurbo(){
        System.out.println("O " + piloto.nome + " no kart " + nome + " está soltando turbo!");
    }

    public void fazerDrift(){
        System.out.println("O " + piloto.nome + " no kart " + nome + " está fazendo drift!");
    }
}
