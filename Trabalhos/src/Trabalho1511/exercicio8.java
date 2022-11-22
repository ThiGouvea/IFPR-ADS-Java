package Trabalho1511;
import java.util.Scanner;

//8. Crie um programa que mostre os números de 1 a 50 em ordem decrescente.

public class exercicio8 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero = 50;

        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }
    }
}
