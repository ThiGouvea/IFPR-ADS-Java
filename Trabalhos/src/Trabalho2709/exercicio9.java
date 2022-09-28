package Trabalho2709;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = ler.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = ler.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 9 ) {
            System.out.println("Classificação A ");
        } else if (media < 9 && media >= 8) {
            System.out.println("Classificação B");
        } else if (media < 8 && media >= 7) {
            System.out.println("Classificação C");
        } else if (media < 7 && media >= 6) {
            System.out.println("Classificação D");
        } else if (media < 6) {
            System.out.println("Classificação I");
        }
    }
}
