package aula2309;

import java.util.Scanner;

public class exercicio2switch {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        String diaSemana = leitura.next();

        switch (diaSemana.toLowerCase()) {
            case "sabado", "domingo" :
                System.out.println("Descanso");
                break;
            case "segunda", "terca", "quarta", "quinta", "sexta" :
                System.out.println("Dia de aula");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}
