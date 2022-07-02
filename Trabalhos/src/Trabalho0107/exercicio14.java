package Trabalho0107;

import java.util.Scanner;

//14. Faça um algoritmo que receba 4 valores de uma compra em um supermercado. Calcule e mostre o valor total gasto.

public class exercicio14 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = Ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = Ler.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double valor3 = Ler.nextDouble();
        System.out.println("Digite o quarto valor: ");
        double valor4 = Ler.nextDouble();

        System.out.println("O total gasto foi de: " + (valor1 + valor2 + valor3 + valor4));
    }
}
