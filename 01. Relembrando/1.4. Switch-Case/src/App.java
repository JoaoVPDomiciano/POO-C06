import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = entrada.nextInt();

        switch (numAlunos) {
            case 10, 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Nenhuma sala");
                break;
        }
        entrada.close();
    }
}
