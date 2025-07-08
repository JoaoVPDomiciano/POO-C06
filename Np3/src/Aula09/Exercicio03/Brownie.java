package Aula09.Exercicio03;

public abstract class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public abstract void calculaValorTotalCompra();

    public void mostraInfo(){
        System.out.println(nome + " - R$" + preco);
    }

    public abstract void addCarrinhoDecompras();
}
