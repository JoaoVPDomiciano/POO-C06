public class Cachorro extends Animal implements Domesticavel{
    public Cachorro(String nome, int anoNascimento) {
        super(nome, anoNascimento);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + nome + " cachorro está latindo.");
    }

    @Override
    public void alimentar() {
        System.out.println("O " + nome + " cachorro está comendo osso");
    }

    @Override
    public void brincar() {
        System.out.println("O cachorro " + nome + " está brincando!");
    }
}
