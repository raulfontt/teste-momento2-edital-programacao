/*
Autor: Francisco Raul Fontenele Morais
Desafio 01.
Fa�a um programa que preencha um vetor com 6 valores distintos digitados pelo usu�rio.
Em seguida, exiba o maior e o menor valor do vetor, indicando em qual posi��o eles se encontram.
Depois, imprima os itens no vetor em ordem crescente.
*/

package resolucao.questoes.esp;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vect = new int[6];

        //Valores distintos digitados pelo usu�rio.

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite o " + (i + 1)+ "�" + " valor do seu vetor:");
            vect[i] = sc.nextInt();

            for(int k = 0; k <= i - 1; k++){
                if(vect[i] == vect[k]){
                    System.out.printf("Valor %d j� existe no conjunto\n", vect[i]);
                    i -= 1;
                }
            }
        }

        //Impress�o do vetor

        System.out.print("Vetor:");

        for(int i = 0; i < vect.length; i++){
            System.out.printf(" %d ", vect[i]);
        }

        System.out.println("");

        int maior = vect[0];
        int posicaoMaior = 0;
        int menor = vect[0];
        int posicaoMenor = 0;

        for(int i = 0; i < vect.length; i++){
            if(vect[i] > maior){
                maior = vect[i];
                posicaoMaior = i;
            }else if (vect[i] < menor){
                menor = vect[i];
                posicaoMenor = i;
            }
        }

        //Valores maior e menos do vetor.

        System.out.println("O maior valor do vetor �: " + maior + ", localizado na posi��o: [" + posicaoMaior + "]");
        System.out.println("O menor valor do vetor �: " + menor + ", localizado na posi��o: [" + posicaoMenor + "]");

        //Ordena��o do vetor, utilizando o m�todo de ordena��o bubble sort.

        for(int i = 1; i < vect.length; i++){
            for(int j = 0; j < i; j++){
                if(vect[i] < vect[j]) {
                    int temp = vect[i];
                    vect[i] = vect[j];
                    vect[j] = temp;
                }
            }
        }

        //Impress�o do vetor Ordenado.
        System.out.printf("Vetor ordenado: ");

        for(int i = 0; i < vect.length; i++){
            System.out.printf(" %d ", vect[i]);
        }
        sc.close();
    }
}
