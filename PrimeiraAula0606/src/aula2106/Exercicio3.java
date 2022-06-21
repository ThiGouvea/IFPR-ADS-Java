package aula2106;

import java.util.Scanner;

//crie um programa que receba um numero qualquer e mostre o seu quadrado (numero * numero)

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double x;
        System.out.println("Digite um numero para saber o quadrado: ");
        x = Ler.nextDouble();
        System.out.println("O quadrado do numero é: " + (x * x));
    }
}
