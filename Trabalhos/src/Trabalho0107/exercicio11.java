package Trabalho0107;

import java.util.Scanner;

//11. Faça um algoritmo que leia o salário bruto e o valor de desconto de um funcionário.
//Calcule e mostre o salário líquido, sabendo que:Salário líquido = Salário bruto – Valor de desconto.

public class exercicio11 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o valor do salario bruto: ");
        double salarioBruto = Ler.nextDouble();
        System.out.println("Digite o valor do desconto: ");
        double valorDesconto = Ler.nextDouble();

        System.out.println("O valor do salario liquido eh: " + (salarioBruto - valorDesconto));
    }
}
