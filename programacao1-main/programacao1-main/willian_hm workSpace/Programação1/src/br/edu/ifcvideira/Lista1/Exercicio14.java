package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        double salarioFixo;
        double totalVendas;
        double comissao;
        double salarioTotal;

        System.out.println("Qual o nome do vendedor: ");
        nome = String.valueOf(in.nextLine());

        System.out.println("Qual o salário fixo de  " + nome);
        salarioFixo = Double.parseDouble(in.nextLine());

        System.out.println("Qual o total de vendas de " + nome);
        totalVendas = Double.parseDouble(in.nextLine());

        System.out.println("Qual o percentual da comissao de " + nome);
        comissao = Double.parseDouble(in.nextLine());

        salarioTotal = salarioFixo + (totalVendas * (comissao/100));
        System.out.println("O vendedor " + nome + " recebeu " + salarioTotal + " reais");

        in.close();
    }
}
