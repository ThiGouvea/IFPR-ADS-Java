package Trabalho2709;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double primeiraNota = ler.nextDouble();
        double segundaNota = ler.nextDouble();

        if ((primeiraNota + segundaNota)/2 < 7.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}

