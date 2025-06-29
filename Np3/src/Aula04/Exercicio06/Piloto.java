package Aula04.Exercicio06;

public class Piloto {
    public String nome;
    public boolean vilao;

    public Piloto(String nome, boolean vilao) {
        this.nome = nome;
        this.vilao = vilao;
    }

    public void soltaSuperPoder(){
        if (vilao){
            System.out.print("O vilão ");
        } else {
            System.out.print("O heroi ");
        }

        System.out.println(nome + " está usando o super poder");
    }
}
