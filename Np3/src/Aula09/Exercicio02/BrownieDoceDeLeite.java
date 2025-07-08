package Aula09.Exercicio02;

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
        valorTotal += preco;
    }
}
