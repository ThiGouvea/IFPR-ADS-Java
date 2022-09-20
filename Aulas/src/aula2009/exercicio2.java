package aula2009;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numeroDiaSemana = Ler.nextInt();

        System.out.println("Digite um numero de dia da semana");

        switch (numeroDiaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia da Semana não encontrado");
                break;
        }
    }
}
