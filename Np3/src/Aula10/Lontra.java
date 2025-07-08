package Aula10;

import Aula11.Aquatico;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Barulho de lontra");
    }

    @Override
    public void nadar() {
        System.out.println("A " + nome + " esta nadando");
    }
}
