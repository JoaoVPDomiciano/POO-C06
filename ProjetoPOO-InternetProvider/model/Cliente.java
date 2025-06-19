package model;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private long cpf;
    private Contrato contrato;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void contratarPlano(PlanoInternet plano) {
        if (contrato == null){
            this.contrato = new Contrato(plano);
        System.out.println(nome + " contratou o plano: ");
        plano.exibirPlano();
        } else {
            System.out.println(nome + " já possui o plano - " + contrato.getPlano().nome + " - Data: " + contrato.getDataInicio());
        }
    }

    public void cancelarPlano(){
        if (contrato != null) {
            System.out.println(nome + " cancelou o plano - " + contrato.getPlano().nome);
            contrato = null;
        } else {
            System.out.println(nome + " não possui plano ativo");
        }
    }

    public void exibirPlano(){
        if (contrato != null) {
            contrato.getPlano().exibirPlano();
        } else {
            System.out.println(nome + " não possui plano ativo");
        }
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public Contrato getContrato() {
        return contrato;
    }
}