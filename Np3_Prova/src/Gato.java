public class Gato extends Animal implements Domesticavel{
    public Gato(String nome, int anoNascimento) {
        super(nome, anoNascimento);
    }

    @Override
    public void emitirSom() {
        System.out.println("O " + nome + " gato está miando.");
    }

    @Override
    public void alimentar() {
        System.out.println("O " + nome + " gato está comendo peixe");
    }

    @Override
    public void brincar() {
        System.out.println("O gato " + nome + " está brincando!");
    }
}
