package aula1908;

//3) Crie um programa para determinar se um numero informado pelo usuario é positivo, negativo ou zero.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } if (numero < 0) {
            System.out.println("Negativo");
        } if (numero == 0) {
            System.out.println("Zero");
        }

    }
}
