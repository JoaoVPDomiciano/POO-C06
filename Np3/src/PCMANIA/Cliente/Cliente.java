package PCMANIA.Cliente;

import PCMANIA.Promocoes.Computador;

public class Cliente {
    public String nome;
    public long cpf;
    public float totalCompra;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void calculaTotalCompra(Computador computador){
        totalCompra += computador.preco;
    }
}
