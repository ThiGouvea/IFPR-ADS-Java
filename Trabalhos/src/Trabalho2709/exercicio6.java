package Trabalho2709;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro lado do triangulo:");
        double ladoA = ler.nextDouble();

        System.out.println("Informe o valor do segundo lado do triangulo:");
        double ladoB = ler.nextDouble();

        System.out.println("Informe o valor do terceiro lado do triangulo:");
        double ladoC = ler.nextDouble();

        if (    ((Math.abs(ladoB - ladoC) < ladoA) && (ladoA < ladoB + ladoC)) &&
                ((Math.abs(ladoA - ladoC) < ladoA) && (ladoA < ladoA + ladoC)) &&
                (Math.abs(ladoA - ladoB) < ladoA) && (ladoA < ladoA + ladoB)) {
            if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("É um triangulo Escaleno.");
            } else if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
                System.out.println("É um triangulo Equilatero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("É um triangulo Isóceles.");
            }
        } else {
            System.out.println("As medidas informadas não formam um triangulo.");
        }
    }
}
