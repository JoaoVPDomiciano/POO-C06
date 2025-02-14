import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua NPA: ");
        float NPA = entrada.nextFloat();

        if (NPA < 60) {
            System.out.println("Você ficou de NP3!");

            System.out.print("Informe a nota da sua NP3: ");
            float NP3 = entrada.nextFloat();

            float NFA = (NPA + NP3)/2;    

            if (NFA < 50) {
                System.out.println("Você reprovou!");
            }else{
                System.out.println("Você foi aprovado!");
            }
        }else{
            System.out.println("Você foi aprovado");
        }

        entrada.close();
    }
}
