package Trabalho1511;
import java.util.Scanner;

//6. Crie um algoritmo que mostre todos os números inteiros múltiplos de 5 do intervalo
//fechado de 1 a 200. Dica: Incremento de 5 em 5.

public class exercicio6 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero = 5;

        while (numero <= 200) {
            System.out.println(numero);
            numero += 5;
        }
    }
}
