package aula0507;

//4 Crie uma calculadora de conversão de reais para dolar. Receba do usuario um valor em reais e mostre quantos dolares
//correspondem ao valor informado

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro em reais:\nR$ ");
        double reais = ler.nextDouble();
        double valorReais = 5.39;
        double valorDollar = reais / valorReais;

        System.out.printf("O valor em dolares dessa quantidade de reais é: U$ %.2f", valorDollar);
    }
}
