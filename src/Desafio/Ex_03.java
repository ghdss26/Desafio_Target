package Desafio;

/**
 * 3) Descubra a lógica e complete o próximo elemento:
 * a) 1, 3, 5, 7, 9
 * b) 2, 4, 8, 16, 32, 64, 128
 * c) 0, 1, 4, 9, 16, 25, 36, 49
 * d) 4, 16, 36, 64, 256
 * e) 1, 1, 2, 3, 5, 8, 13
 * f) 2,10, 12, 16, 17, 18, 19, ____
 *
 */

public class Ex_03 {

    public static void main(String[] args) {

        // letra a)

        int n = 1;
        int i;

        for(i = 0; i < 4; i++) {

            n += 2;
        }

        System.out.println("a) O número é: " + n);

        // letra b)

        int n1 = 64;
        int i1;
        for(i1 = 0; i1 < 1 ; i1++) {

            n1 *= 2;
        }

        System.out.println("b) O número é: " + n1);

        // letra c)
        int n2 = 6;
        int i2;
        for (i2 = 0; i2 < 1; i2++) {

           n2++;
           n2 = n2 * n2;
        }

        System.out.println("c) O Número é: " + n2);

        // letra d)
        int n3 = 8;
        int i3;
        for (i3 = 0; i3 < 1; i3++) {

            n3 += 8;
        }

        System.out.println("d) O Número é: " + n3 * n3);

        // letra e)
        int n4 = 5;
        int n5 = 8;
        int i4;

        int numerosoma = n4 + n5;

        System.out.println("e) O Número é: " + numerosoma);

        // f) Não é possível determinar a lógica da sequência, logo,
        // não há uma resposta única para o próximo número.
    }
}
