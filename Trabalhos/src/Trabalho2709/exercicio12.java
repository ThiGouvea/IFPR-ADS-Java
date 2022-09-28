package Trabalho2709;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um codigo de trabalho (1, 2, 3, 4): ");
        int codigoTrabalho = ler.nextInt();

        switch (codigoTrabalho) {
            case 1:
                System.out.println("Não estou trabalhando.");
                break;
            case 2:
                System.out.println("Freelancer / Autonomo.");
                break;
            case 3:
                System.out.println("20 horas semanais.");
                break;
            case 4:
                System.out.println("40 horas semanais.");
                break;
            default:
                System.out.println("Regime invalido.");
                break;
        }
    }
}
