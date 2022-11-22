package Prova141022;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero correspondente a um mes do ano (1 - 12): ");
        int numeroMes = ler.nextInt();

        switch (numeroMes) {
            case 12, 1, 2:
                System.out.println("Verão");
                break;
            case 3, 4, 5:
                System.out.println("Outono");
                break;
            case 6, 7, 8:
                System.out.println("Inverno");
                break;
            case 9, 10, 11:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mês invalido");
                break;
        }


    }
}
