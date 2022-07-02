package aula0107;

import java.util.Scanner;

//elabore um programa que receba 3 numeros: A, B, C, calcule e mostre o valor de x de acordo com a seguinte expressão
// x = a + b - c

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int primeiroNumero = Ler.nextInt();

        System.out.println("Digite o segundo numero:");
        int segundoNumero = Ler.nextInt();

        System.out.println("Digite o terceiro numero:");
        int terceiroNumero = Ler.nextInt();

        System.out.println("O resultado segundo a formula é:\n" + (primeiroNumero + segundoNumero - terceiroNumero));

    }
}
