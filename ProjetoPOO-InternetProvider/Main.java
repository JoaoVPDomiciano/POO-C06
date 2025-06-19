import model.*;
import service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Cliente> listaDeClientes = new ArrayList<>();
        long cpfInput;
        int posCPF;
        int planoInternet;

        Morravox morravox = new Morravox();
        PlanoBasico planoBasico = new PlanoBasico("Básico", 9771, 9771);
        PlanoPremium planoPremium = new PlanoPremium("Premium", 2108, 2108);

        int acao;
        do {

            System.out.println("""
                    Bem vindo(a), selecione a ação desejada:\s
                    #1. Cadastrar cliente;\s
                    #2. Informações do cliente\s
                    #3. Contratar plano\s
                    #4. Cancelar plano\s
                    #5. Listar vendas\s
                    #6. Salvar arquivo com as vendas\s
                    #7. Ler arquivo com as vendas\s
                    
                    #0. Encerrar processo""");
            System.out.print("Ação: ");

            acao = scanner.nextInt();
            scanner.nextLine();

            switch (acao) {
                case 1:
                    limparTerminal();

                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF do cliente: ");
                    cpfInput = scanner.nextLong();
                    scanner.nextLine();

                    Cliente novoCliente = new Cliente(nome, cpfInput);
                    listaDeClientes.add(novoCliente);
                    morravox.registrarCliente(novoCliente);

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;


                case 2:
                    limparTerminal();

                    System.out.print("CPF do cliente: ");
                    cpfInput = scanner.nextLong();
                    scanner.nextLine();

                    posCPF = acharCPF(listaDeClientes, cpfInput);
                    if (posCPF != -1){
                        listaDeClientes.get(posCPF).exibirPlano();
                    } else {
                        System.out.println("CPF não encontrado");
                    }

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;

                case 3:
                    limparTerminal();

                    System.out.print("CPF do cliente: ");
                    cpfInput = scanner.nextLong();

                    System.out.println("""
                            Qual será o plano do cliente?\s
                            #1. Basico\s
                            #2. Premium\s""");
                    planoInternet = scanner.nextInt();
                    scanner.nextLine();

                    posCPF = acharCPF(listaDeClientes, cpfInput);
                    if (posCPF != -1){
                        switch (planoInternet){
                            case 1:
                                morravox.venderPlano(listaDeClientes.get(posCPF), planoBasico);
                                break;
                            case 2:
                                morravox.venderPlano(listaDeClientes.get(posCPF), planoPremium);
                                break;
                            default:
                                System.out.println("Seleção de plano invalida");
                        }
                    } else {
                        System.out.println("CPF não encontrado");
                    }

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;

                case 4:
                    limparTerminal();

                    System.out.print("CPF do cliente: ");
                    cpfInput = scanner.nextLong();
                    scanner.nextLine();

                    posCPF = acharCPF(listaDeClientes, cpfInput);
                    if (posCPF != -1){
                        listaDeClientes.get(posCPF).cancelarPlano();
                    } else {
                        System.out.println("CPF não encontrado");
                    }

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;

                case 5:
                    limparTerminal();

                    morravox.listarVendas();

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;

                case 6:
                    limparTerminal();

                    morravox.salvarVendasEmArquivo("listaVendas.txt");

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;

                case 7:
                    limparTerminal();

                    morravox.lerVendasEmArquivo("listaVendas.txt");

                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                    limparTerminal();
                    break;
            }
        }while (acao != 0);

        scanner.close();
    }

    public static void limparTerminal() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int acharCPF(List<Cliente> listaDeClientes, long cpf){
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).getCpf() == cpf) {
                return i;
            }
        }
        return -1;
    }
}