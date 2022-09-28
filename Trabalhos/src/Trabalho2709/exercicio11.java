package Trabalho2709;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double numero1 = ler.nextDouble();

        System.out.println("Digite o segundo numero:");
        double numero2 = ler.nextDouble();

        System.out.println("Digite um operador (+  -  *  /): ");
        String operador = ler.next();

        if (operador.equalsIgnoreCase("+")) {
            System.out.println("Resultado = " + (numero1 + numero2));
        } else if (operador.equalsIgnoreCase("*")) {
            System.out.println("Resultado = " + (numero1 * numero2));
        } else if (operador.equalsIgnoreCase("-")) {
            System.out.println("Resultado = " + (numero1 - numero2));
        } else if (operador.equalsIgnoreCase("/")) {
            System.out.println("Resultado = " + (numero1 / numero2));
        } else {
            System.out.println("Operador não definido");
        }
    }
}
