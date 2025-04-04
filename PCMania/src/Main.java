import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float total = 0;

        Cliente cliente = new Cliente();
        cliente.nome = "João Vitor Pereira Domiciano";
        cliente.CPF = 1234;

        //Computadores
        Computador computador1 = new Computador();
        computador1.marca = "Apple";
        computador1.preco = 9771;
        computador1.hardwareBasico.nome = "Pentium Core i3 \n8 Gb de Memória RAM \n500Gb de HD";
        computador1.hardwareBasico.capacidade = 2200;
        computador1.sistemaOperacional.nome = "Linux Ubuntu";
        computador1.sistemaOperacional.tipo = 32;

        MemoriaUSB musb1 = new MemoriaUSB();
        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;

        computador1.addMemoriaUSB(musb1);

        Computador computador2 = new Computador();
        computador2.marca = "Samsung";
        computador2.preco = 9771+1234;
        computador2.hardwareBasico.nome = "Pentium Core i5 \n16 Gb de Memória RAM \n1Tb de HD";
        computador2.hardwareBasico.capacidade = 3370;
        computador2.sistemaOperacional.nome = "Windows 8";
        computador2.sistemaOperacional.tipo = 64;

        MemoriaUSB musb2 = new MemoriaUSB();
        musb2.nome = "Pen-drive";
        musb2.capacidade = 16;

        computador2.addMemoriaUSB(musb2);


        Computador computador3 = new Computador();
        computador3.marca = "Dell";
        computador3.preco = 9771+5678;
        computador2.hardwareBasico.nome = "Pentium Core i7 \n32 Gb de Memória RAM \n2Tb de HD";
        computador2.hardwareBasico.capacidade = 3370;
        computador3.sistemaOperacional.nome = "Windows 10";
        computador3.sistemaOperacional.tipo = 64;

        MemoriaUSB musb3 = new MemoriaUSB();
        musb3.nome = "Pen-drive";
        musb3.capacidade = 16;

        computador3.addMemoriaUSB(musb3);

        boolean comprando = true;
        while (comprando) {
            System.out.println("Informe o PC de qual promoção deseja comprar (1,2,3) ou digite '0' para finalizar a compra: ");
            int promocao = scanner.nextInt();

            switch (promocao) {
                case 1:
                    computador1.mostraPCConfig();
                    total = cliente.calculaTotal(computador1.preco, total);
                    break;
                case 2:
                    computador2.mostraPCConfig();
                    total = cliente.calculaTotal(computador2.preco, total);
                    break;
                case 3:
                    computador3.mostraPCConfig();
                    total = cliente.calculaTotal(computador3.preco, total);
                    break;
                case 0:
                    System.out.println("Finalizando compras...");
                    comprando = false;
                    break;
                default:
                    System.out.println("Promoção invalida!");
            }
        }

        System.out.println("O total a ser pago é : R$" + total);
        scanner.close();
    }
}
