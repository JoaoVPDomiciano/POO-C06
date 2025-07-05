public class Passaro extends Animal{
    public Passaro(String nome, int anoNascimento) {
        super(nome, anoNascimento);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + nome + " cachorro está piando.");
    }

    @Override
    public void alimentar() {
        System.out.println("O " + nome + " cachorro está comendo sementes");
    }
}
