package Aula08.br.inatel.cdg.inimigo;

import Aula08.br.inatel.cdg.jogador.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if ((tipoTiro == "Explosivo" && ast.getTipoAsteroide() == "Grande") || (ast.getTipoAsteroide() == "Pequeno")){
            ast.destruir();
        } else {
            System.out.println("Asteroide não destruido");
        }
    }
}
