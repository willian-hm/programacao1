/*
 */

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double altura;
        int sexo;
        double ideal;

        System.out.println("Qual é o seu sexo? Escolha o número 1:'Masculino', 2:'Feminino'");
        sexo = Integer.parseInt(in.nextLine());

        System.out.println("Digite a altura");
        altura = Double.parseDouble(in.nextLine());

        if (sexo==1) {
            ideal = (72.7*altura)-58;
            System.out.println("O peso ideal é de " + ideal + "kg");
        } else if (sexo==2) {
            ideal = (62.1*altura)-44.7;
            System.out.println("O peso ideal é de " + ideal + "kg");
        } else {
            System.out.println("Erro");
        }

        in.close();

    }
}
