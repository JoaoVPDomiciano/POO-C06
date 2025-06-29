package Aula05.Exercicio03;

public class Campo {
    boolean [][] campoBombas = new boolean[2][2];

    public void addBomba(int posicaoXBomba, int posicaoYBomba){
        campoBombas[posicaoXBomba][posicaoYBomba] = true;
    }

    public boolean andar(int posicaoXUsuario, int posicaoYUsuario){
        return campoBombas[posicaoXUsuario][posicaoYUsuario];
    }
}
