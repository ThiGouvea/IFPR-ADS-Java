package Trabalho0208;

//Crie um programa que receba o nome, o preço e o percentual de desconto de um produto. Calcule o valor do desconto, sabendo que:
//
//Valor do desconto = Preço * Percentual de desconto / 100
//
//Ao final, mostre:
//- O nome do produto
//- O percentual de desconto
//- O valor de desconto
//- O valor final do produto

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = Ler.next();
        System.out.println("Digite o preço do produto: ");
        double precoProduto = Ler.nextDouble();
        System.out.println("Digite o percentual de desconto: ");
        double percentualDescontoProduto = Ler.nextDouble();

        double valorDesconto = precoProduto * percentualDescontoProduto / 100;

        System.out.println("O produto " + nomeProduto + " com percentual de desconto de " + percentualDescontoProduto + " %.");
        System.out.printf("Teve um valor de desconto de R$ %.2f com o valor do produto final de:\n", valorDesconto);
        System.out.printf("R$ %.2f", (precoProduto - valorDesconto));

    }

}
