package aula2106;

import java.util.Scanner;

//crie um programa que receba a idade de uma pessoa e mostre como resultado o dobro da idade

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = Ler.nextInt();
        System.out.println("O dobro da idade é: " + (idade * 2));
    }
}
