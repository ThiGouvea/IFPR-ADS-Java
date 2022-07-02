package Trabalho0107;

import java.util.Scanner;

/* 8. Crie um programa que receba o nome de uma pessoa, sua idade e o valor total gasto em uma compra ao supermercado.
Mostre como resultado a mensagem:Ex. <nome da pessoa>, você tem <idade> anos e gastou <valor gasto> reais
no supermercado.
Mark Zuckerberg, você tem 60 anos e gastou 300 reais no supermercado. */

public class exercicio8 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = Ler.nextLine();
        System.out.println("Digite sua idade:");
        int idade = Ler.nextInt();
        System.out.println("Qual o valor que foi gasto na compra?");
        double valorGasto = Ler.nextDouble();

        System.out.printf("%s, voce tem %s anos e gastou %s reais no supermercado.", nome, idade, valorGasto);
    }
}
