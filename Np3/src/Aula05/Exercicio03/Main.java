package Aula05.Exercicio03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int posicaoXBomba = random.nextInt(2);
        int posicaoYBomba = random.nextInt(2);

        int posicaoXUsuario;
        int posicaoYUsuario;

        Campo campoMinado = new Campo();
        campoMinado.addBomba(posicaoXBomba, posicaoYBomba);
        while (true) {
            posicaoXUsuario = scanner.nextInt();
            posicaoYUsuario = scanner.nextInt();

            System.out.println("Explodiu: " + campoMinado.andar(posicaoXUsuario, posicaoYUsuario));
        }
    }
}
