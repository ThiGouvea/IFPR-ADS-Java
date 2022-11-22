package Trabalho1511;
import java.util.Scanner;

//12. Crie um programa que fique lendo números e mostrando o dobro até que o usuário  informe -1.

public class exercicio12 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um numero: ");
            numero = Ler.nextInt();
            if (numero != -1) {
                System.out.println(numero * 2);
            }
        } while (numero != -1);
    }
}
