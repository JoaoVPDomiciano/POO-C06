package Aula09.Exercicio03;

public class Main {
    public static void main(String[] args) {
        BrownieCafe brownieCafe = new BrownieCafe("Brownie de café", 10, "Café");
        BrownieNutella brownieNutella = new BrownieNutella("Brownie de Nutella", 15, "Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Brownie de doce de leite", 12, "Doce de Leite");

        brownieCafe.mostraInfo();
        brownieCafe.adicionaCafe();

        brownieNutella.mostraInfo();
        brownieNutella.adicionaNutella();

        brownieDoceDeLeite.mostraInfo();
        brownieDoceDeLeite.adicionaDoceDeLeite();

        brownieCafe.addCarrinhoDecompras();
        brownieCafe.calculaValorTotalCompra();

        brownieNutella.addCarrinhoDecompras();
        brownieNutella.calculaValorTotalCompra();

        brownieDoceDeLeite.addCarrinhoDecompras();
        brownieDoceDeLeite.calculaValorTotalCompra();
    }
}
