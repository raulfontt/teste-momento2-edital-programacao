/*
Autor: Francisco Raul Fontenele Morais
Desafio 02.
Escreva um programa que, dada uma matrix 3x3, armazena em cada posição da matriz,
a soma dos valores da linha e coluna que definem a posição. Por exemplo, na posição [1][2]
você deverá armazenar o valor 1+2 = 3 e assim por diante. Imprima a matriz na tela.
*/

package resolucao.questoes.esp;

public class Exercicio2 {
    public static void main(String[] args) {
        //Optei por declarar uma variável n que define o tamanho da matriz da questão.
        int n = 3;
        int[][] mat = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                mat[i][j] = i + j;
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }


    }
}
