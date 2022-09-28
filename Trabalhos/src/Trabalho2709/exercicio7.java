package Trabalho2709;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double primeiro = 0, segundo = 0, ultimo = 0;

        System.out.println("Informe o primeiro valor:");
        double numero1 = ler.nextDouble();

        System.out.println("Informe o segundo valor:");
        double numero2 = ler.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double numero3 = ler.nextDouble();

        if (numero1 < numero2 && numero1 < numero3 ) {
            primeiro = numero1;
            if (numero2 < numero3) {
                segundo = numero2;
                ultimo = numero3;
            } else {
                segundo = numero3;
                ultimo = numero2;
            }
        }
        else if (numero2 < numero3 && numero2 < numero1 ) {
            primeiro = numero2;
            if (numero1 < numero3) {
                segundo = numero1;
                ultimo = numero3;
            } else {
                segundo = numero3;
                ultimo = numero1;
            }
        }
        else if (numero3 < numero2 && numero3 < numero1 ) {
            primeiro = numero3;
            if (numero1 < numero2) {
                segundo = numero1;
                ultimo = numero2;
            } else {
                segundo = numero2;
                ultimo = numero1;
            }
        }

        System.out.print(primeiro + " ");
        System.out.print(segundo + " ");
        System.out.print(ultimo + " ");

    }
}
