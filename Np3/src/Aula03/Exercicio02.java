package Aula03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primeiraHora, segundaHora, terceiraHora, totalLanches;
        double media;

        primeiraHora = entrada.nextInt();
        segundaHora = entrada.nextInt();
        terceiraHora = entrada.nextInt();

        totalLanches = (primeiraHora + segundaHora + terceiraHora);
        media = (float)totalLanches/3;

        System.out.print("Total de lanches: " + totalLanches + " - media: " + media);
        entrada.close();
    }
}
