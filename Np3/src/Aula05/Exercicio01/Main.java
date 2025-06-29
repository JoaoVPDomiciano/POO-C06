package Aula05.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Salgado enrroladinho = new Salgado("Enrroladinho");
        Salgado joelho = new Salgado("Joelho");
        Salgado coxinha = new Salgado("Coxinha");

        Cantina cantinaDoInatel = new Cantina("Cantina da Neide");
        cantinaDoInatel.addSalgado(enrroladinho);
        cantinaDoInatel.addSalgado(joelho);
        cantinaDoInatel.addSalgado(coxinha);

        cantinaDoInatel.mostraInfo();
    }
}
