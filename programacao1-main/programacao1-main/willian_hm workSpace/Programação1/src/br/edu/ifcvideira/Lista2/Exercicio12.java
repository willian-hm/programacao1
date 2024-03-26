/* 12 - Faça um programa que receba um valor qualquer, ao usuário digitar 1
converta para m2 (valor * 0.0001), ao usuário digitar 2, converta para m3 (valor * 0.000001). */

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tipo;
        double num;
        double m;

        System.out.println("Digite '1' para converter para m2 e '2' para m3");
        tipo = Integer.parseInt(in.nextLine());

        System.out.println("Digite o tamanho a ser convertido");
        num = Double.parseDouble(in.nextLine());

        if (tipo==1) {
            m = num*0.0001;
            System.out.println("Vai ser" + m + "m quadrados");
        } else if (tipo==2) {
            m = num*0.000001;
            System.out.println("Vai ser" + m + "m cúbicos");
        } else {
            System.out.println("Erro");
        }

        in.close();
    }   
}
