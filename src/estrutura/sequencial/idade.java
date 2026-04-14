package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class idade {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double mediaIdade;

        nome1 = input.next();
        idade1 = input.nextInt();

        nome2 = input.next();
        idade2 = input.nextInt();

        mediaIdade = (double) (idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, mediaIdade);

        input.close();
    }
}