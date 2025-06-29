package Aula08.br.inatel.cdg;

import Aula08.br.inatel.cdg.inimigo.Nave;
import Aula08.br.inatel.cdg.jogador.Asteroide;

public class Main {
    public static void main(String[] args) {
        Nave navePequena = new Nave("Nave pequena", 10, "Normal");
        Nave naveGrande = new Nave("Nave Grande", 100, "Explosivo");

        Asteroide asteroidePequeno = new Asteroide("Asteroide Pequeno", "Pequeno");
        Asteroide asteroideGrande = new Asteroide("Asteroide Grande", "Grande");

        navePequena.atirar(asteroideGrande);
        navePequena.atirar(asteroidePequeno);
        naveGrande.atirar(asteroideGrande);
        naveGrande.atirar(asteroidePequeno);
    }
}
