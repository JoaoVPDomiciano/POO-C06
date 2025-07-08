package Aula11;

public class Main {
    public static void main(String[] args) {
        Lontra lontra = new Lontra("Lontra", 5);
        Boi boi = new Boi("Boi", 20);
        Cachorro cachorro = new Cachorro("Cachorro", 12);

        lontra.mostrarInfo();
        lontra.emitirSom();

        boi.mostrarInfo();
        boi.emitirSom();

        cachorro.mostrarInfo();
        cachorro.emitirSom();
    }
}
