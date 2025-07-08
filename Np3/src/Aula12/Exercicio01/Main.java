package Aula12.Exercicio01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            list.add(random.nextDouble());
        }

        for (double i :list){
            System.out.print(i + " - ");
        }

        Collections.sort(list);

        for (double i :list){
            System.out.println(i);
        }
    }
}
