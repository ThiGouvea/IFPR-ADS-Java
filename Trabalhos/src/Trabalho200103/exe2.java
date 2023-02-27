package Trabalho200103;
import javax.swing.*;

/*
2) Foi realizada uma pesquisa do IBGE no estado do Paraná para verificar as idades da população e vc foi o escolhido para
criar um sistema gerenciador do IBGE. Crie um sistema que receba do usuário via JOptionPane (interface visual) a idade
de N pessoas até que o usuário informe -1 (condição de saída do sistema). Ao final, mostre quantas pessoas estão na faixa etária:
a) 0 a 20
b) 21 a 40
c) 41 a 60
d) Acima de 60

Obs: Valide a idade, não permita que seja informada idade fora do intervalo entre 0 e 150.
 */

public class exe2 {
    public static void main(String[] args ) {
        int idadeInt = -1;
        int idade0e20 = 0;
        int idade21e40 = 0;
        int idade41e60 = 0;
        int idadeAcima60 = 0;
        while (true) {
            String idade = JOptionPane.showInputDialog("Informe a idade (digite -1 para terminar)");
            idadeInt = Integer.parseInt(idade);
            if (idadeInt > 150) {
                System.out.println("Somente idates entre 0 e 150");
            } else if (idadeInt >= 0 & idadeInt <= 20) {
                idade0e20++;
            } else if (idadeInt > 20 & idadeInt <= 40) {
                idade21e40++;
            } else if (idadeInt > 40 & idadeInt <= 60) {
                idade41e60++;
            } else if (idadeInt > 60) {
                idadeAcima60++;
            } else {
                break;
            }
        }
        System.out.println("Idades entre 0 e 20: " + idade0e20 +
                "\nIdades entre 21 e 40: " + idade21e40 +
                "\nIdades entre 41 e 60: " + idade41e60 +
                "\nIdades acima de 60: " + idadeAcima60);
    }
}

