/* 8 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa em JAVA
que leia o número de maçãs compradas, calcule e escreva o valor total da
compra. */


package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int macas;
        double preco;

        System.out.println("Digite o número de maçãs");
        macas = Integer.parseInt(in.nextLine());
        
        if ((macas < 12)&&(macas>0)) {
            preco = macas*0.3;
            System.out.println("R$"+preco);
        } else if (macas >= 12) {
            preco = macas*0.25;
            System.out.println("R$"+preco);
        } else {
            System.out.println("Erro");
        }

        in.close();
        
    }
}
