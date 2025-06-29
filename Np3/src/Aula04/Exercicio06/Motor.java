package Aula04.Exercicio06;

public class Motor {
    public String cilindradas;
    public float velocidadeMaxima;

    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo(){
        System.out.println("Cilindradas: " + cilindradas + " - velocidade máxima: " + velocidadeMaxima);
    }
}
