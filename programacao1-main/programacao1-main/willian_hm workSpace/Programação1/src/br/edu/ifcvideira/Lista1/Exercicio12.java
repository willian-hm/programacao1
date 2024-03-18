// 12 - Faça um algoritmo que calcule a média de quatro números inteiros. Os números devem ser dados pelo usuário.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double num4;
        double result;

        System.out.println("Digite um número: ");
		num1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite outro número: ");
		num2 = Double.parseDouble(in.nextLine());

        System.out.println("Digite outro número: ");
		num3 = Double.parseDouble(in.nextLine());

        System.out.println("Digite mais um número: ");
		num4 = Double.parseDouble(in.nextLine());

        result = (num1 + num2 + num3 + num4)/4;
        System.out.println("A média dos 4 números são: " + result);

        in.close();

    }
    
}
