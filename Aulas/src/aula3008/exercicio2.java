package aula3008;

//2) Crie um programa que receba o nome e altura de uma pessoa. Mostre uma mensagem dizendo sua estatura:
//Considere
//< 1,5m Baixa
//entre 1,5m e 1,8 normal
//> 1,80 alta

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = Ler.next();
        System.out.println("Digite sua altura no formato 0,00: ");
        double altura = Ler.nextDouble();

        if (altura <= 1.5) {
            System.out.println(nome + " sua estatura é BAIXA");
        } if (altura > 1.5 && altura <= 1.8 ) {
            System.out.println(nome + " sua estatura é NORMAL");
        } if (altura > 1.8) {
            System.out.println(nome + " sua estatura é ALTA");
        }

    }
}
