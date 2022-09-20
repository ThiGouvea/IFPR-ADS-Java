package aula2009;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 10");
        int numero = Ler.nextInt();

        switch (numero) {
            case 0:
                System.out.println("Numero par");
                break;
            case 1:
                System.out.println("Numero impar");
                break;
            case 2:
                System.out.println("Numero par");
                break;
            case 3:
                System.out.println("Numero impar");
                break;
            case 4:
                System.out.println("Numero par");
                break;
            case 5:
                System.out.println("Numero impar");
                break;
            case 6:
                System.out.println("Numero par");
                break;
            case 7:
                System.out.println("Numero impar");
                break;
            case 8:
                System.out.println("Numero par");
                break;
            case 9:
                System.out.println("Numero impar");
                break;
            case 10:
                System.out.println("Numero par");
                break;
            default:
                System.out.println("Outro");
                break;
        }
    }
}
