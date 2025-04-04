public class Computador {
    String marca;
    float preco;
    HardwareBasico hardwareBasico;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriausb;

    public Computador() {
        hardwareBasico = new HardwareBasico();
        sistemaOperacional = new SistemaOperacional();
    }

    public void mostraPCConfig(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" +preco);
        System.out.println(hardwareBasico.nome);
        System.out.println("Capacidade: " + hardwareBasico.capacidade + "Mhz");
        System.out.println("Sistema Operacional " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");
        System.out.println("Acompanha " + memoriausb.nome + " de " + memoriausb.capacidade + "Gb");
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        memoriausb = musb;
    }
}
