package Trabalho2709;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        if (numero < 0) {
            System.out.println("Numero Negativo");
        } else if (numero == 0) {
            System.out.println("Numero zero");
        } else {
            System.out.println("Numero Positivo");
        }
    }
}
