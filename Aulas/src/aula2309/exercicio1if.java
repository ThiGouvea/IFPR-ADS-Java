package aula2309;

//73. Crie um algoritimo que leia um dia da semana por extenso e mostre se é dia letivo ou não.
//        Considere a tabela abaixo:
//
//        Dia da semana                 |         Descrição
//        sabado, domingo                       | Descanso
//        segunda, terca, quarta, quinta, sexta | Dia de Aula
//        Outro                                 | Dia invalido


import java.util.Scanner;

public class exercicio1if {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        String diaSemana = leitura.next();

        if (diaSemana.equalsIgnoreCase("sabado") || diaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("Descanso");
        } else if (diaSemana.equalsIgnoreCase("segunda") || diaSemana.equalsIgnoreCase("terca")
                ||diaSemana.equalsIgnoreCase("quarta") || diaSemana.equalsIgnoreCase("quinta") ||
                diaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("Dia de Aula");
        } else {
            System.out.println("Dia invalido");
        }



    }
}
