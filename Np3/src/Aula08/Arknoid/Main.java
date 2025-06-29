package Aula08.Arknoid;

import static Aula08.Arknoid.Conversor.converter;

public class Main {
    public static void main(String[] args) {
        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();

        Jogador jogador = new Jogador();
        bloco1.destruirBlocos(jogador);
        bloco2.destruirBlocos(jogador);

        System.out.println("Blocos criados: " + Bloco.blocosCriados);
        System.out.println("Blocos destruidos: " + Bloco.blocosDestruidos);
        System.out.println("Pontos: " + jogador.pontuacao + " - Moedas: " + converter(jogador));
    }
}
