package Trabalho1511;
import java.util.Scanner;

//3. Crie um programa que mostre os números ímpares de 0 a 50.

public class exercicio3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int impar;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

}
