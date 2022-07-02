package aula0107;


//faça um algoritimo que receba 4 valores de uma compra em um supermercado. calcule e
//mostre o valor total gasto.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro item da compra:");
        double primeiroItem = Ler.nextDouble();

        System.out.println("Digite o valor do segundo item da compra:");
        double segundoItem = Ler.nextDouble();

        System.out.println("Digite o valor do terceiro item da compra:");
        double terceiroItem = Ler.nextDouble();

        System.out.println("Digite o valor do quarto item da compra:");
        double quartoItem = Ler.nextDouble();

        System.out.println("A soma dos items da compra é:\n" + (primeiroItem + segundoItem + terceiroItem + quartoItem));

    }
}
