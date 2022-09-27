package Trabalho2709;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano = ler.nextInt();
        if (ano < 0) {
            System.out.println("Antes de Cristo");
        } else if (ano == 0) {
            System.out.println("Ano zero");
        } else {
            System.out.println("Depois de Cristo");
        }
    }
}
