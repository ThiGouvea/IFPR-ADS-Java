package aula1908;

//1) crie um programa que receba 2 numeros X e Y. Mostre a soma apenas se a soma for maior que 50.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = ler.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = ler.nextDouble();
        double soma = numero1 + numero2;
        if (soma > 50) {
            System.out.println(soma);
        }
    }
}
