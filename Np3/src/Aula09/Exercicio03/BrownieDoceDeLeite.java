package Aula09.Exercicio03;

public class BrownieDoceDeLeite extends Brownie {
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando mais doce de leite ao brownie!");
    }

    @Override
    public void addCarrinhoDecompras(){
        System.out.println("Adicionando um Brownie de Doce de leite no carrinho!");
    }

    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Valor total a pagar pelo Brownie de Doce de Leite: R$" + preco);
    }
}
