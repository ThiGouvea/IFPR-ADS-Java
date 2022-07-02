package Trabalho0107;

//4. Elabore um algoritmo para ler 2 números e mostrar a soma desses números.

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = Ler.nextInt();
        System.out.println("Digite o segundo numeoro: ");
        int segundoNumero = Ler.nextInt();

        System.out.println("A soma dos numeros: " + (primeiroNumero + segundoNumero));
    }
}
