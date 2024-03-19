/* 15 - Faça um algoritmo que leia o nome de um piloto, leia a distância percorrida em
km e o tempo que o piloto levou para percorrê-la (em horas). O algoritmo deve
calcular a velocidade média (velocidade = distancia / tempo) - em km/h, e exibir a
seguinte frase: */


package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        double distancia;
        double tempo;
        double velocidade;

        System.out.println("Qual o nome do piloto: ");
        nome = String.valueOf(in.nextLine());

        System.out.println("Qual foi a distância percorrida: ");
        distancia = Double.parseDouble(in.nextLine());

        System.out.println("Qual a duração da viagem (em horas): ");
        tempo = Double.parseDouble(in.nextLine());

        velocidade = distancia/tempo;

        System.out.println("A velocidade média do " + nome + " foi " + velocidade + "km/h");

        in.close();

    }
}
