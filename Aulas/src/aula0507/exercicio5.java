package aula0507;

//5 Calculadora de conversão de dolar para real refaça o exercicio anterior, porem agora sua calculadora fara o calculo
//inverso

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de dinheiro em dolares:\nU$ ");
        double reais = ler.nextDouble();
        double valorReais = 5.39;
        double valordollar = reais * valorReais;

        System.out.printf("O valor em dolares dessa quantidade de reais é: R$ %.2f", valordollar);
    }
}
