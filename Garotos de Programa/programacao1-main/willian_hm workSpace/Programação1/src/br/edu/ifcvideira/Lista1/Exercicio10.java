/* 10 - Faça um algoritmo para calcular e exibir do salário líquido de um professor,
onde o número de horas, o valor da hora e o percentual do INSS devem ser
fornecidos pelo usuário:
salario_bruto <- num_hora_aula * valor_hora_aula
salario_liquido <- salario_bruto – (salario_bruto * percentual_INSS).  */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double horas;
		double valorh;
		double percINSS;
		double salbruto;
		double salliqui;
		
		System.out.println("Quantas horas você trabalha por semana?");
		horas = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o valor da hora por aula?");
		valorh = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o percentual do INSS atual?");
		percINSS = Double.parseDouble(in.nextLine());
		
		salbruto = horas * valorh;
		
		salliqui = salbruto - (salbruto * percINSS);
		
		System.out.println("Seu salário bruto é: R$" + salbruto);
		System.out.println("Seu salário líquido é: R$" + salliqui);
		
		in.close();
		
	}

}