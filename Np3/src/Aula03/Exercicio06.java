package Aula03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numAleatorio, numUsuario;
        boolean errou = true;

        numAleatorio = random.nextInt(10) + 1;

        while (errou){
            System.out.print("Número: ");
            numUsuario = entrada.nextInt();

            if (numUsuario == numAleatorio){
                System.out.println("Acertou!");
                errou = false;
            } else if (numUsuario > numAleatorio) {
                System.out.println("Errou! O número é menor.");
            }else {
                System.out.println("Errou! O número é maior.");
            }
        }
    }
}
