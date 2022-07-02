package Trabalho0107;

import java.util.Scanner;

//12. O Shopping China está vendendo seus produtos em 6 (seis) vezes sem juros no cartão de crédito.
//Faça um algoritmo que receba o valor de uma compra e mostre o valor das prestações.

public class exercicio12 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = Ler.nextDouble();

        System.out.println("O valor de cada prestaçao sera: " + (valorCompra / 6));
    }
}
