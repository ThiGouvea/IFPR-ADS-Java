package Trabalho0208;

//2) Crie um programa que efetue o cálculo da quantidade de litros de combustível gastos em uma viagem, sabendo-se
// que o carro faz 12km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade média.
//
//    Distância = Tempo * Velocidade
//    Litros = Distância / 12

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem: ");
        double tempoGastoViagem = Ler.nextDouble();
        System.out.println("Digite a velocidade media: ");
        double velocidadeMedia = Ler.nextDouble();

        double distanciaPercorrida = tempoGastoViagem * velocidadeMedia;
        double quantidadeLitrosGastos = distanciaPercorrida / 12;

        System.out.printf("A quantidade de litros de combustivel gastos na viagem � de: %.2f", quantidadeLitrosGastos);

    }

}
