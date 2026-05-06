package estruturas.condicional;

/**
 * Fazer um programa para ler as notas que um aluno obteve no primeiro e segundo semestre de uma disciplina anual.
 * Em seguida, mostrar a nota final que o aluno obteve no ano juntamente com um texto explicativo.
 * Caso a nota final seja menor que 60.0, mostrar a mensagem "REPROVADO".
 * Todos os valores devem ter uma casa decimal.*/

import java.util.Locale;
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double nota_primeiro_semestre, nota_segundo_semestre, notaFinal;

        nota_primeiro_semestre = input.nextDouble();
        nota_segundo_semestre = input.nextDouble();

        notaFinal = nota_primeiro_semestre + nota_segundo_semestre;

        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (notaFinal < 60.0){
            System.out.println("REPROVADO");
        }

        input.close();
    }
}