/* 9 - Faça um algoritmo para calcular e exibir um salário reajustado em 23,75%. O
salário atual deve ser fornecido pelo usuário. */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario;
		double reajuste;
		
		System.out.println("Digite o seu salário: ");
		salario = Double.parseDouble(in.nextLine());
		
		reajuste = salario * 1.2375;
		
		System.out.println("Seu salário com reajuste é de: R$" + reajuste);
		
		in.close();
		
	}

}