public abstract class Animal {
    protected String nome;
    public int anoNascimento;

    public Animal(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public abstract void emitirSom();
    public abstract void alimentar();
}
