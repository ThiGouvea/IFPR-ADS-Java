package Trabalho0208;

//3) Altere o exercício 2 para receber a quantidade de km por litro dinamicamente

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem: ");
        double tempoGastoViagem = Ler.nextDouble();
        System.out.println("Digite a velocidade media: ");
        double velocidadeMedia = Ler.nextDouble();
        System.out.println("Digite o consumo do carro em Km/L:");
        double consumoCarro = Ler.nextDouble();

        double distanciaPercorrida = tempoGastoViagem * velocidadeMedia;
        double quantidadeLitrosGastos = distanciaPercorrida / consumoCarro;

        System.out.printf("A quantidade de litros de combustivel gastos na viagem � de: %.2f", quantidadeLitrosGastos);

    }

}
