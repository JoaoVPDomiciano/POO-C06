package Aula03;

public class Exercicio01 {
    public static void main(String[] args) {
        int primeiraHora, segundaHora, terceiraHora, lanchesTotal;
        double media;

        primeiraHora = 10;
        segundaHora = 4;
        terceiraHora = 2;

        lanchesTotal = primeiraHora + segundaHora + terceiraHora;
        media = (double) lanchesTotal /3 ;

        System.out.println("Lanches total: " + lanchesTotal);
        System.out.println("Media: " + media);
    }
}
