package estruturas.condicional;

/*
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre
 * os três números lidos. Em caso de empate, mostrar apenas uma vez.*/

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3;

        numero1 = input.nextInt();
        numero2 = input.nextInt();
        numero3 = input.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("MENOR = " + numero1);
        }
        else if (numero2 < numero3) {
            System.out.println("MENOR = " + numero2);
        }
        else{
            System.out.println("MENOR = " + numero3);
        }
        input.close();
    }
}