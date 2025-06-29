package Aula08.Arknoid;

public class Bloco {
    static int blocosCriados = 0;
    static int blocosDestruidos = 0;

    public Bloco(){
        blocosCriados ++;
    }

    public void destruirBlocos(Jogador jogador){
        blocosDestruidos ++;
        jogador.addPontuacao();
    }
}
