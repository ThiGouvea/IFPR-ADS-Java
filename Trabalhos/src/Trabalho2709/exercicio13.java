package Trabalho2709;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sigla de um estado: ");

        String siglaEstado = ler.next();

        switch (siglaEstado.toLowerCase()) {
            case "rs", "sc", "pr":
                System.out.println("Região Sul, população 29 milhões.");
                break;
            case "sp", "rj", "mg", "es":
                System.out.println("Região Sudeste, população 84 milhões.");
                break;
            case "df", "go", "mt", "ms":
                System.out.println("Região Centro-Oeste, população 15 milhões.");
                break;
            case "ac", "ap", "am", "pa", "ro", "rr", "to":
                System.out.println("Região Norte, população 17 milhões.");
                break;
            case "al", "ba", "ce", "ma", "pb", "pi", "rn", "se":
                System.out.println("Região Nordeste, população 56 milhões.");
                break;
            default:
                System.out.println("Estado Invalido.");
                break;

        }
    }
}
