package Trabalho1511;
import java.util.Scanner;

// 7. Crie um programa que mostre os 10 primeiros números pares a partir de 5.

public class exercicio7 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int pares = 0;
        int numero = 5;

        while (pares < 10) {
            if (numero % 2 == 0 ){
                System.out.println(numero);
                pares++;
            }
            numero++;
        }
    }
}
