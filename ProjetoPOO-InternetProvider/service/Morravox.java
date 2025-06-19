package service;

import model.Cliente;
import model.PlanoInternet;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Morravox implements ProvedorService {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void registrarCliente(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado! Nome: " + cliente.getNome() + " - CPF: " + cliente.getCpf());
        } else {
            System.out.println("Cliente não cadastrado no sitema");
        }
    }

    @Override
    public void venderPlano(Cliente cliente, PlanoInternet planoInternet) {
        try {
            cliente.contratarPlano(planoInternet);
        } catch (Exception e){
            System.out.println("Erro ao contratar plano: " + e);
        }
    }

    @Override
    public void listarVendas() {
        for (Cliente cliente:clientes) {
            if (cliente.getContrato() != null) {
                System.out.println("Nome: " + cliente.getNome() + " - Plano: " + cliente.getContrato().getPlano().getNome() + " | " + cliente.getContrato().getDataInicio());
            }
        }
    }

    public void salvarVendasEmArquivo(String caminhoArquivo) {
        StringBuilder conteudo = new StringBuilder();

        for (Cliente cliente:clientes) {
            if (cliente.getContrato() != null) {
                conteudo.append("Cliente: ")
                        .append(cliente.getNome())
                        .append(" | Plano: ")
                        .append(cliente.getContrato().getPlano().getNome())
                        .append(" | Data: ")
                        .append(cliente.getContrato().getDataInicio())
                        .append(System.lineSeparator());
            }
        }

        try {
            Path arquivo = Paths.get(caminhoArquivo);
            Files.writeString(arquivo, conteudo.toString());
            System.out.println("Vendas salvas com sucesso em " + caminhoArquivo);
        } catch (Exception e) {
            System.out.println("Erro ao salvar as vendas " + e);
        }
    }

    public void lerVendasEmArquivo(String caminhoArquivo) {
            try {
                Path arquivo = Paths.get(caminhoArquivo);
                List<String> conteudo = Files.readAllLines(arquivo);

                conteudo.forEach(System.out::println);
            } catch (Exception e) {
                System.out.println("Erro ao ler o arquivo " + e);
            }
    }
}