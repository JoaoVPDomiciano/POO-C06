package service;

import model.Cliente;
import model.PlanoInternet;

public interface ProvedorService {
    void registrarCliente(Cliente cliente);
    void venderPlano(Cliente cliente, PlanoInternet planoInternet);
    void listarVendas();
}