package aula2106;

import java.util.Scanner;

//crie um programa que receba 3 numeros a, b e c. calcule e mostre o valor de x de acordo com a expressão x=a+b-c

public class Exercicio2 {
    public static void main(String[] args) {
        int a, b, c, x;
        Scanner Ler = new Scanner(System.in);
        System.out.println("digite 3 numeros: ");
        a = Ler.nextInt();
        b = Ler.nextInt();
        c = Ler.nextInt();
        x = a + b - c;
        System.out.println("o resultado da conta é: " + x);
    }
}
