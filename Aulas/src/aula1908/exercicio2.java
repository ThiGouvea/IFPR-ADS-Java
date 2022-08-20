package aula1908;

//2) Crie um programa que receba uma ano do tipo inteiro. Se o ano for menor que 0 mostre a mensagem "Antes de Cristo"
//se for maior ou igual a 0 mostre "Depois de cristo.

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ano");
        int ano = ler.nextInt();

        if (ano < 0) {
            System.out.println("Antes de Cristo");
        } else {
            System.out.println("Depois de Cristo");
        }

    }
}
