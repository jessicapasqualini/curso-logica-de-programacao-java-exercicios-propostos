package matrizes;

/**
 * Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
 * de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
 * elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
 * Mostrar o vetor gerado.
 */

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int M, N;

        M = input.nextInt();
        N = input.nextInt();

        double [][] matriz = new double[M][N];

        //leitura da matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }

        //vetor com a soma de cada linha da matriz
        double [] vetorSomaLinhas = new double [M];

        //cálculo da soma de cada linha da matriz
        for (int i = 0; i < M; i++) {

            double soma = 0.0;

            for (int j = 0; j < N; j++) {
                soma += matriz[i][j]; //adiciona cada elemento da linha
            }
            vetorSomaLinhas[i] = soma; //atribui ao vetor a soma
        }
        //mostra a soma de cada linha da matriz
        for (int i = 0; i < M; i++) { //M é a quantidade de elementos do vetor
            System.out.printf("%.1f%n", vetorSomaLinhas[i]);
        }
        input.close();
    }
}