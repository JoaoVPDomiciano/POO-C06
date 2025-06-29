package PCMANIA;

import PCMANIA.Cliente.Cliente;
import PCMANIA.Promocoes.Computador;
import PCMANIA.Promocoes.MemoriaUSB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarCompra = true;

        Cliente cliente = new Cliente("João", 1234);

        MemoriaUSB musb1 = new MemoriaUSB(" Gb Pen-drive", 16);
        MemoriaUSB musb2 = new MemoriaUSB(" Gb Pen-drive", 32);
        MemoriaUSB musb3 = new MemoriaUSB(" Tb Pen-drive", 1);

        Computador promocao1 = new Computador("Apple", 9771, "Linux Ubuntu", 32);
        promocao1.setHardwareBasicoList(" Mhz Pentium Core i3", 2200);
        promocao1.setHardwareBasicoList(" GB Memória RAM", 8);
        promocao1.setHardwareBasicoList(" Gb HD", 500);
        promocao1.addMemoriaUSB(musb1);

        Computador promocao2 = new Computador("Samsung", 9771+1234, "Windowns 8", 64);
        promocao2.setHardwareBasicoList(" Mhz Pentium Core i5", 3370);
        promocao2.setHardwareBasicoList(" GB Memória RAM", 16);
        promocao2.setHardwareBasicoList(" Tb HD", 1);
        promocao2.addMemoriaUSB(musb2);

        Computador promocao3 = new Computador("Dell", 9771+5678, "Windowns 10", 64);
        promocao3.setHardwareBasicoList(" Mhz Pentium Core i7", 4500);
        promocao3.setHardwareBasicoList(" GB Memória RAM", 32);
        promocao3.setHardwareBasicoList(" Tb HD", 2);
        promocao3.addMemoriaUSB(musb3);

        System.out.println("Promoção 01:");
        promocao1.mostraPCConfig();
        System.out.println("\nPromoção 02:");
        promocao2.mostraPCConfig();
        System.out.println("\nPromoção 03:");
        promocao3.mostraPCConfig();

        while (continuarCompra){
            System.out.print("""
                    \s
                    Insira '0' para finalizar\s
                    Selecione a promoção desejada:""");
            switch (scanner.nextInt()){
                case 1:
                    cliente.calculaTotalCompra(promocao1);
                    break;
                case 2:
                    cliente.calculaTotalCompra(promocao2);
                    break;
                case 3:
                    cliente.calculaTotalCompra(promocao3);
                    break;
                case 0:
                    continuarCompra = false;
                    break;
                default:
                    System.out.println("Promoção não encontrada.");
            }
        }

        System.out.println("Total: " + cliente.totalCompra);

        scanner.close();
    }
}
