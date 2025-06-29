package PCMANIA.Promocoes;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public List<HardwareBasico> hardwareBasicoList = new ArrayList<>();
    public MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, String nomeSI, int tipoSI) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSI, tipoSI);
    }

    public void mostraPCConfig(){
        System.out.print("Marca: " + marca);
        System.out.println(" - Preço: R$" + preco);

        for(HardwareBasico hardwareBasico:hardwareBasicoList){
            System.out.print(hardwareBasico.capacidade);
            System.out.println(hardwareBasico.nome);
        }

        System.out.println(sistemaOperacional.nome + "(" + sistemaOperacional.tipo +" bits)");
        System.out.println(memoriaUSB.capacidade + memoriaUSB.nome);
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        memoriaUSB = musb;
    }

    public void setHardwareBasicoList(String nome, float capacidade) {
        this.hardwareBasicoList.add(new HardwareBasico(nome, capacidade));
    }
}
