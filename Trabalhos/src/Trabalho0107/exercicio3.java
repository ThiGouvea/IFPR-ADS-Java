package Trabalho0107;

//3. Elabore um algoritmo para receber um número e mostrar
// o sucessor e antecessor.

import javax.swing.*;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = Ler.nextInt();

        System.out.printf("O antecessor do numero %s eh %s e o sussessor eh %s", numero, numero -1, numero + 1);
    }
}
