package estruturas.repetitiva;

/*
 * Enunciado:
 *
 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a
 * idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor
 * de idade negativa. Calcular e imprimir a Idade média deste grupo de indivíduos. Se for
 * entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular".
 *
 */

import java.util.Locale;
import java.util.Scanner;

public class MediaDeIdades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int idade, soma, contador;

        idade = input.nextInt();

        soma = 0;
        contador = 0;

        while (idade >= 0) {
            soma += idade;
            contador++;
            idade = input.nextInt();
        }
        if (contador > 0) {
            double mediaIdades;

            mediaIdades = (double) soma / contador;

            System.out.printf("%.2f%n", mediaIdades);
        }
        else{
            System.out.println("impossivel calcular");
        }
        input.close();
    }
}