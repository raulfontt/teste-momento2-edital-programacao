/*
Escreva um programa que lê 2 matrizes A e B, cada uma com 3 linhas e 2 colunas.
Construir uma matriz C de mesma dimensão (3x2) onde C é formada pela soma dos elementos da matriz A
com os elementos da matriz B (exemplo: C[1][1] = A[1][1] + B[1][1]).
Apresentar ao final as 3 matrizes (A, B e C).
*/
package resolucao.questoes.esp;
import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] matA = new int[3][2];
        int[][] matB = new int[3][2];
        int[][] matC = new int[3][2];

        // Construção da matriz A:
        for (int i=0; i < matA.length; i++) {
            for (int j=0; j < 2; j++) {
                matA[i][j] = gerador.nextInt(26);
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                System.out.printf("%d ", matA[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //Construção da matriz B:
        for (int i=0; i < matB.length; i++) {
            for (int j=0; j < 2; j++) {
                matB[i][j] = gerador.nextInt(26);
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                System.out.printf("%d ", matB[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //Construção da matriz C(soma de elementos da matriz A com os elementos da matriz B);

        for (int i=0; i < matC.length; i++) {
            for (int j=0; j < 2; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                System.out.printf("%d ", matC[i][j]);
            }
            System.out.println();
        }


    }
}
