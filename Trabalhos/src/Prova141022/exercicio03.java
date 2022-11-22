package Prova141022;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero correspondente a um mes " +
                "do ano (1 - 12): ");
        int numeroMes = ler.nextInt();

        if (numeroMes == 1 || numeroMes == 2 || numeroMes == 12) {
            System.out.println("Verão");
        }else if (numeroMes >= 3 && numeroMes <= 5) {
            System.out.println("Outono");
        }else if (numeroMes >= 6 && numeroMes <= 8) {
            System.out.println("Inverno");
        }else if (numeroMes >= 9 && numeroMes <= 11) {
            System.out.println("Primavera");
        }else {
            System.out.println("Mês inválido");
        }


    }
}
