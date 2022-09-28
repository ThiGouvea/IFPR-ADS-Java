package Trabalho2709;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome de um planeta: ");
        String nomePlaneta = ler.next();

        if (nomePlaneta.equalsIgnoreCase("mercurio")) {
            System.out.println("Primeiro na posição do sistema solar com 57,9 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("venus")) {
            System.out.println("Segundo na posição do sistema solar com 108,2 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("terra")) {
            System.out.println("Terceiro na posição do sistema solar com 149,6 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("marte")) {
            System.out.println("Quarto na posição do sistema solar com 227,9 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("jupiter")) {
            System.out.println("Quinto na posição do sistema solar com 778,3 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("saturno")) {
            System.out.println("Sexto na posição do sistema solar com 1427 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("urano")) {
            System.out.println("Setimo na posição do sistema solar com 2871 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("netuno")) {
            System.out.println("Oitavo na posição do sistema solar com 4497 milhões de Km de distancia.");
        } else if (nomePlaneta.equalsIgnoreCase("plutao")) {
            System.out.println("Nono na posição do sistema solar com 5914 milhões de Km de distancia.");
        }
    }
}
