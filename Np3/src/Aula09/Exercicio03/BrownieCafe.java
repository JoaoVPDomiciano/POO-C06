package Aula09.Exercicio03;

public class BrownieCafe extends Brownie {
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adicionando mais café ao brownie!");
    }

    @Override
    public void addCarrinhoDecompras(){
        System.out.println("Adicionando um Brownie de Café no carrinho!");
    }

    @Override
    public void calculaValorTotalCompra(){
            System.out.println("Valor total a pagar pelo Brownie de Café: R$" + preco);
    }
}
