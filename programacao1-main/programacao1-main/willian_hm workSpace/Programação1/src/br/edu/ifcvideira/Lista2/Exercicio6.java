// 6 - Ler 3 valores e escrever o maior deles (Considerando valores distintos).

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.println("Digite um número:");
        num1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite outro número:");
        num2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite um número:");
        num3 = Double.parseDouble(in.nextLine());

        if ((num1>num2)&&(num1>num3)) {
            System.out.println(num1 + " é o maior número");
        } else if ((num2>num1)&&(num2>num3)) {
            System.out.println(num2 + " é o maior número");
        } else {
            System.out.println(num3 + " é o maior número");
        }

        in.close();
    }
}
