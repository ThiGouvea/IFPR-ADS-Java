package Trabalho200103;
import javax.swing.JOptionPane;

/*
3) Em um jogo de tabuleiro, cada palavra formada por um jogador vale uma certa pontuação, que depende das letras usadas.
 Crie um programa para receber 1 palavra via JOptionPane (interface visual) e mostre quantos pontos a palavra vale.
 Considere:
- Cada vogal na palavra (a, e, i, o, u) vale 5 pontos.
- Cada consoante na palavra vale 3 pontos.

OBS: Desconsidere palavras com caracteres especiais (acentos, ç, ...)
 */
public class exe3 {
    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        palavra = palavra.toLowerCase();
        int pontos = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                pontos += 5;
            } else if (letra >= 'a' && letra <= 'z') {
                pontos += 3;
            }
        }
        System.out.println("A palavra '" + palavra + "' vale: " + pontos + " pontos");
    }
}


