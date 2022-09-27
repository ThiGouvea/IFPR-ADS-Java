package aula2309;

import java.util.Scanner;

public class exercicio2if {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um mes:");
        String mesExtenso = leitura.next();

        if (mesExtenso.equalsIgnoreCase("janeiro") || mesExtenso.equalsIgnoreCase("fevereiro")
             || mesExtenso.equalsIgnoreCase("julho") || mesExtenso.equalsIgnoreCase("dezembro")) {
            System.out.println("Ferias");
        } else if (mesExtenso.equalsIgnoreCase("marco") || mesExtenso.equalsIgnoreCase("abril")
                ||mesExtenso.equalsIgnoreCase("maio") || mesExtenso.equalsIgnoreCase("junho") ||
                mesExtenso.equalsIgnoreCase("agosto") || mesExtenso.equalsIgnoreCase("setembro") ||
                mesExtenso.equalsIgnoreCase("outubro") || mesExtenso.equalsIgnoreCase("novembro")) {
            System.out.println("Meses de Aula");
        } else {
            System.out.println("Mes invalido");
        }



    }
}
