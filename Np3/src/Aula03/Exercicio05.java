package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        boolean errou = true;
        int numAleatorio, numUsuario;

        numAleatorio= random.nextInt(10) + 1;

        while (errou) {
            System.out.print("Número: ");
            numUsuario = entrada.nextInt();

            if (numUsuario == numAleatorio){
                System.out.println("Acertou!");
                errou = false;
            } else {
                System.out.println("Errou!");
            }
        }
    }
}
