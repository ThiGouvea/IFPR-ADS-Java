package Trabalho0107;

import java.util.Scanner;

//6. Escreva um algoritmo que leia um número e imprima o seu quadrado (número * número).

public class exercicio6 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = Ler.nextInt();

        System.out.println("o quadrado do numero é : \n" + (numero * numero));
    }
}
