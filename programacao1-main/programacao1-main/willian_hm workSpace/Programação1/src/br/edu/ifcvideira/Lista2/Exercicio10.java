/* 10 - Leia quantos gols o TIME A marcou em uma partida e leia quantos gols o
TIME B marcou. Escrever o nome do vencedor. Caso não haja vencedor deverá
ser impressa a palavra EMPATE. */

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int timeA;
        int timeB;
        
        System.out.println("Digite a quantidade de gols do Time A");
        timeA = Integer.parseInt(in.nextLine());

        System.out.println("Digite a quantidade de gols do Time B");
        timeB = Integer.parseInt(in.nextLine());

        if (timeA>timeB) {
            System.out.println("Time A foi o vencedor");
        } else if (timeB>timeA) {
            System.out.println("Time B foi o vencedor");
        } else {
            System.out.println("Empate");
        }

        in.close();
    }
}
