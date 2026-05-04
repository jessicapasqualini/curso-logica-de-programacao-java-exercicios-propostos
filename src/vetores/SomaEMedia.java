package vetores;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor.
 * Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */

import java.util.Locale;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N;

        N = input.nextInt();

        double [] vetor = new double [N];

        for (int i = 0; i < N; i++) {
            vetor[i] = input.nextDouble();
        }
        for (int i = 0; i < N; i++) {

            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma = soma + vetor[i];
        }
        System.out.printf("%.2f%n", soma);

        double media;
        media = soma / N;
        System.out.printf("%.2f%n", media);

        input.close();
    }
}
