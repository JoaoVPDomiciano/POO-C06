import javax.sound.midi.SysexMessage;

public class App {
    public static void main(String[] args) {
        int lanche1, lanche2, lanche3;
        lanche1 = 10;
        lanche2 = 4;
        lanche3 = 2;

        int total = lanche1 + lanche2 + lanche3;
        float media = total/3F;

        System.out.println("Total de lanches " + total);
        System.out.println("Média de lanches: " + media);
    }
}
