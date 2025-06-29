package Aula05.Exercicio02;

public class Banda {
    private String nome;
    private String genero;

    private Empresario empresario;
    private Membro[] arrayMembro = new Membro[4];
    private Musica[] arrayMusicas = new Musica[3];

    int iMembro = 0;
    int iMusica = 0;

    public Banda(String nome, String genero, Empresario empresario) {
        this.nome = nome;
        this.genero = genero;
        this.empresario = empresario;
    }

    public void mostraInfo(){
        System.out.println("Nome da banda: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Empresario: " + empresario.getNome() + " - CNPJ: " + empresario.getCnpj());

        System.out.println("Membros:");
        for(Membro membro : arrayMembro){
            System.out.println("- " + membro.getNome() + " - Função: " + membro.getFuncao());
        }

        System.out.println("Musicas:");
        for (Musica musica : arrayMusicas){
            System.out.println("- " + musica.getNome() + " - Duração: " + musica.getDuracao());
        }
    }

    public void addMusica(Musica musica){
        arrayMusicas[iMusica] = musica;
        iMusica ++;
    }

    public void addMembroNovo(Membro membro){
        arrayMembro[iMembro] = membro;
        iMembro ++;
    }
}
