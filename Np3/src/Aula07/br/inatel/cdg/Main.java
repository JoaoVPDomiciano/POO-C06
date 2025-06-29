package Aula07.br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 1000, 500, "João", 9771);

        conta.sacar(1001);
        conta.sacar(100);
        conta.deposita(300);

        System.out.println(conta.getLimite() + " - " +  conta.getNumero() + " - " + conta.getSaldo() + " - " + conta.getClientesList().getLast().getCpf());
    }
}
