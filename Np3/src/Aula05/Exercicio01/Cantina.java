package Aula05.Exercicio01;

public class Cantina {
    public String nome;
    public Cantina(String nome) {
        this.nome = nome;
    }

    Salgado[] listaSalgados = new Salgado[3];
    int i = 0;

    public void addSalgado(Salgado novoSalgado){
        listaSalgados[i] = novoSalgado;
        i++;
    }

    public void mostraInfo(){
        for (Salgado salgado : listaSalgados){
            System.out.println(salgado.nome);
        }
    }
}
