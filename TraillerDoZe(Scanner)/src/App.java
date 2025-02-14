import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int lanche1, lanche2, lanche3;
        System.out.print("Digite o número de lanches da 1ª hora: ");
        lanche1 = entrada.nextInt();
        System.out.print("Digite o número de lanches da 2ª hora: ");
        lanche2 = entrada.nextInt();
        System.out.print("Digite o número de lanches da 3ª hora: ");
        lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3F;

        System.out.println("Total de lanches " + total);
        System.out.println("Média de lanches: " + media);

        entrada.close();
    }
}
