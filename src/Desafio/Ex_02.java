package Desafio;

import java.util.Scanner;

/**
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde, informado um número,
 * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
 * se o número informado pertence ou não a sequência.
 *
    IMPORTANTE:
 * 	Esse número pode ser informado através de qualquer entrada de sua preferência
 * 	ou pode ser previamente definido no código;
 */

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na sequência de Fibonacci:");
        int n = input.nextInt();

        int ant = 0, atual = 1, f = 0, i = 0;

        while(f < n) {
            f = ant + atual;
            ant = atual;
            atual = f;
            i++;
        }

        if (f == n) {
            System.out.printf("%d é o esimo número na sequência de Fibonacci.", n, i);
        } else {
            System.out.printf("%d não está na sequência de Fibonacci.", n);
        }
    }
}
