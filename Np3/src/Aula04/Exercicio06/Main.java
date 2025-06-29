package Aula04.Exercicio06;

public class Main {
    public static void main(String[] args) {
        Piloto mario = new Piloto("Mario", false);
        Piloto bowser = new Piloto("Bowser", true);

        Kart kart1 = new Kart("kart1", mario, "50", 110);
        Kart kart2 = new Kart("kart2", bowser, "100", 90);

        kart1.piloto.soltaSuperPoder();
        kart2.piloto.soltaSuperPoder();

        kart1.pular();
        kart2.soltarTurbo();
        kart1.fazerDrift();

        kart1.motor.mostraInfo();
        kart2.motor.mostraInfo();
    }
}
