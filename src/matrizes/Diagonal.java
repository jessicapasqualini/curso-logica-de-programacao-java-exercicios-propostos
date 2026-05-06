package matrizes;

/**
 * Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
 * de valores negativos da matriz.
 */

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;

        N = input.nextInt();

        int [][] matriz = new int[N][N];

        //fazer a leitura da matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        //imprimir a diagonal principal [0][0], [1][1], [2][2], ...
        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int negativos = 0; //acumula quantos elementos negativos há na matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < 0) { //verifica se cada elemento da matriz é negativo
                    negativos++;
                }
            }
        }
        System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);
        input.close();
    }
}
