// 1 – Ler um valor e escrever se é positivo, negativo ou zero.

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int num;

        System.out.println("Informe o número:");
        num = Integer.parseInt(in.nextLine());

        if (num > 0) {
            System.out.println("É positivo");
        }
        else if (num < 0) {
            System.out.println("É negativo");
        } 
        else {
            System.out.println("É zero");
        }

        in.close();
    }
}