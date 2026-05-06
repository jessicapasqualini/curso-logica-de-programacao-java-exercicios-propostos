package matrizes;


/**
 * Fazer um programa para ler dois números inteiros positivos M e N, depois ler uma
 * matriz de M linhas e N colunas contendo números inteiros. Em seguida, mostrar na
 * tela a matriz lida.
 */

import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int M, N;

        M = input.nextInt();
        N = input.nextInt();

        int [][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) { //percorre as linhas
            for (int j = 0; j < N; j++) { //percorre as colunas
                matriz[i][j] = input.nextInt(); //lê cada elemento da matriz
            }
        }

            for (int i = 0; i < M; i++){
                for (int j = 0; j < N; j++) {
                    System.out.print(matriz[i][j] + " "); //imprime cada elemento da matriz
                }
                System.out.println(); //quebra de linha após cada linha da matriz
            }
            input.close();
        }
    }