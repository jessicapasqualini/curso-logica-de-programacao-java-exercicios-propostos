package estrutura.sequencial;

/*
    * Enunciado:
    *
    * Fazer um programa para ler as medidas da base e altura de um retângulo.
    * Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo,
    * com quatro casas decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double base, altura, valorArea, perimetro, diagonal;

        base = input.nextDouble();
        altura = input.nextDouble();

        valorArea = base * altura;
        perimetro = 2.0 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.printf("AREA = %.4f%n", valorArea);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        input.close();
    }
}