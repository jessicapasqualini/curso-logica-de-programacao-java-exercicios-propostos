import java.util.Locale;
import java.util.Scanner;

public class AlturaMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N;

        N = input.nextInt();

        String [] vetorNomes = new String[N];
        int [] vetorIdades = new int[N];
        double [] vetorAlturas = new double [N];

        for (int i = 0; i < N; i++) {
            vetorNomes[i] = input.next();
            vetorIdades[i] = input.nextInt();
            vetorAlturas[i] = input.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < N; i++) {
            soma += vetorAlturas[i];
        }
        double media = soma / N;
        System.out.printf("Altura média: %.2f%n", media);

        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (vetorIdades[i] < 16) {
                contador++;
            }
        }
        double porcentagem = (double) contador * 100.0 / N;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        input.close();
    }
}