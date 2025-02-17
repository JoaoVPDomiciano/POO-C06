import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();
        int numAleatorio = rand.nextInt(10)+1;
        int numeroUsuario;

        System.out.println("Qual foi o número gerado? ");
        do {
            numeroUsuario = entrada.nextInt();

            if (numeroUsuario == numAleatorio) {
                System.out.println("Número correto.");
                break;
            }

            System.out.println("Número incorreto. Tente novamente: ");
        } while (true);
        entrada.close();
    }
}
