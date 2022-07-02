package Trabalho0107;

import java.util.Scanner;

// Elabore um algoritmo que receba 3 números: A, B e C. Calcule e mostre o valor de X
//de acordo com a seguinte expressão: X = A + B – C.

public class exercicio5 {
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
