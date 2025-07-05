public class Veterinario {
    public String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal){
        System.out.println("O veterinario " + nome + " está examinando o animal " + animal.nome);
    }
}
