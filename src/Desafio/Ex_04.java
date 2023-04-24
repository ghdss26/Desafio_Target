package Desafio;

import java.util.Scanner;

/**
 * 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia.
 * O carro de Ribeirão Preto em direção a Franca,
 * a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto
 * a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia,
 * qual estará mais próximo a cidade de Ribeirão Preto?

 * IMPORTANTE:
 *
 * a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
 *
 * b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos
 * a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
 *
 * c) Explique como chegou no resultado.
 *
 * 4 - Dois veículos (um carro e um caminhão)
 * saem respectivamente de cidades opostas pela mesma rodovia.
 * O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h
 * e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h.
 * Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
 *
 * IMPORTANTE:
 *
 * a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
 *
 * b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos
 * a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
 *
 * c) Explique como chegou no resultado.
 */

public class Ex_04 {

    public static void main(String[] args) {

        int dt = 100; // Distância entre Ribeirão Preto e Franca em km
        int velCarro = 110; // Velocidade do carro em km/h
        int velCaminhao = 80; // Velocidade do caminhão em km/h
        double temPed = 5.0 / 60.0; // Tempo que o caminhão leva em cada pedágio em horas

        // Tempo que cada veiculo leva para percorrer a distância entr as cidades (sem contar os pedágios)
        double temCarro = (double) dt / velCarro;
        double temCaminhao = (double) dt / velCaminhao;

        // Tempo total que o caminhão leva para percorrer a distância entre as cidades (contando os pedágios)
        double temTotalCaminhao = temCaminhao + 2 * temPed;

        // Distância percorrida pelo carro quando os veículos se cruzam
        double dtCarro = velCarro * (temTotalCaminhao / 2.0);

        // Distância restante para a cidade de Ribeirão Preto
        double dtRestante = dt - dtCarro;

        // Verifica qual veiculo está mais próximo de Ribeirão Preto
        if (dtCarro <= dtRestante) {

            System.out.println("O Carro está mais próximo de Ribeirão Preto.");

        } else {

            System.out.println("O caminhão está mais próximo de Ribeirão Preto");
        }
    }

    /*
    * Cheguei com a seguinte conclusão:
    *
    * Primeiramente, é possível calcular o tempo que cada veículo leva para percorrer a distância
    * entre as cidades,
    * sem contar os pedágios.
    * Para isso, basta dividir a distância pela velocidade correspondente.

        Em seguida, é necessário levar em conta que o caminhão leva 5 minutos a mais para passar
        * em cada pedágio, enquanto o carro possui tag de pedágio (Sem Parar).
        * Isso significa que o tempo total que o caminhão leva para percorrer a distância entre as cidades
        * será maior do que o tempo calculado anteriormente.

        Com essas informações, é possível calcular a distância percorrida pelo carro quando os veículos se cruzam.
        * Isso pode ser feito multiplicando a velocidade do carro pelo tempo que o caminhão leva para percorrer metade da distância total
        * (ou seja, até o ponto em que os veículos se encontram).
        * A distância restante para a cidade de Ribeirão Preto é então calculada subtraindo
        * a distância percorrida pelo carro da distância total entre as cidades.

        Por fim, basta verificar qual veículo está mais próximo de Ribeirão Preto comparando
        * a distância percorrida pelo carro com a distância restante para a cidade.
        * Se a distância percorrida pelo carro for menor ou igual à distância restante,
        * o carro está mais próximo. Caso contrário, o caminhão está mais próximo.
     */
}


