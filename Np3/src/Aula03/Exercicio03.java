package Aula03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double np1, np2, np3, npa, nfa;
        boolean ficouNp3;

        System.out.print("Np1: ");
        np1 = entrada.nextDouble();
        System.out.print("Np2: ");
        np2 = entrada.nextDouble();

        npa = (np1 + np2)/2;

        if (npa < 60){
            System.out.println("NPA: " + npa + ". Ficou de Np3");
            ficouNp3 = true;
        }else {
            System.out.println("NPA: " + npa + ".Passou!");
            ficouNp3 = false;
        }

        if (ficouNp3){
            System.out.print("Np3: ");
            np3 = entrada.nextDouble();

            nfa = (np3+npa)/2;

            if (nfa < 50){
                System.out.println("Reprovou");
            }else{
                System.out.println("Passou!");
            }
        }

        entrada.close();
    }
}
