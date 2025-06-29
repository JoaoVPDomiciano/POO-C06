package Aula07.br.inatel.cdg;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private List<Cliente> clientesList = new ArrayList<>();

    public Conta(int numero, float saldo, float limite, String nome, long cpf) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.clientesList.add(new Cliente(nome, cpf));
    }

    public void sacar(float quantia){
        if (saldo < quantia){
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("R$" + quantia + "Sacado");
            saldo -= quantia;
        }
    }

    public void deposita(float quantia){
        System.out.println("R$" + quantia + " depositado");
        saldo += quantia;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public List<Cliente> getClientesList() {
        return clientesList;
    }
}
