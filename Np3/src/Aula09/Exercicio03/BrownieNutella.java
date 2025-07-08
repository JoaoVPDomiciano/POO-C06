package Aula09.Exercicio03;

public class BrownieNutella extends Brownie {
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando mais nutella ao brownie!");
    }

    @Override
    public void addCarrinhoDecompras(){
        System.out.println("Adicionando um Brownie de Nutella no carrinho!");
    }

    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Valor total a pagar pelo Brownie de Nutella: R$" + preco);
    }
}
