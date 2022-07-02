package aula0107;

import java.util.Scanner;

//exemplo 1 escreva um algoritimo que leia um numero e imprima o seu quadradro

public class exercicio1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = Ler.nextInt();

        System.out.println("o quadrado do numero é: \n" + (numero * numero));
    }
}
