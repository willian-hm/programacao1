/* 11 - Faça um algoritmo para calcular e exibir o valor de uma prestação em atraso.
prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso), taxa é
o percentual de juros por dia, num_dias_atraso é o número de dias em atraso e
prestação é o valor da prestação normal. O valor da prestação, a taxa e o número
de dias em atraso devem ser fornecidos pelo usuário. */


package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double prestacao;
		double taxa;
		double atraso;
		double valor;
		
		System.out.println("Digite o valor da prestação: ");
		prestacao = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a taxa de percentual de juros por dia: ");
		taxa = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o número de dias de atraso: ");
		atraso = Double.parseDouble(in.nextLine());
		
		valor = prestacao + (prestacao*(taxa/100)*atraso);
		
		System.out.println("A prestação em atraso é de R$" + valor);
		
		in.close();
		
	}

}
