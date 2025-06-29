package Aula05.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Empresario empresario = new Empresario("João", 9771);
        Banda pedraRolando = new Banda("Pedra Rolando", "Rock", empresario);

        Membro Jose = new Membro("Jose", "Baterista");
        Membro Lucas = new Membro("Lucas", "Guitarrista");
        Membro Marco = new Membro("Marco", "Vocalista");
        Membro Luiza = new Membro("Luiza", "Pianista");

        pedraRolando.addMembroNovo(Jose);
        pedraRolando.addMembroNovo(Lucas);
        pedraRolando.addMembroNovo(Marco);
        pedraRolando.addMembroNovo(Luiza);

        Musica abecedario = new Musica("abecedario", 26);
        Musica POO = new Musica("POO", 15);
        Musica rapMinecraft = new Musica("Rap do Minecraft", 3.45);

        pedraRolando.addMusica(abecedario);
        pedraRolando.addMusica(POO);
        pedraRolando.addMusica(rapMinecraft);

        pedraRolando.mostraInfo();
    }
}
