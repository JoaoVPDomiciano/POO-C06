package Aula09.Exercicio01;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;
    public static double valorTotal = 0;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarinhoDeCompras(){
        System.out.println("Adicionando um " + nome + " ao carrinho.");
        valorTotal += preco;
    }

    public void calculaValorTotalCompra(){
        System.out.println("Valor total a pagar: R$" + valorTotal);
    }

    public void mostraInfo(){
        System.out.println(nome + " - R$" + preco);
    }
}
