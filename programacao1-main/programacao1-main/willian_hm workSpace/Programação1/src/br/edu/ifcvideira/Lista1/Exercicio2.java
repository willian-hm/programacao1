//2 – Faça um algoritmo para calcular a área de um cubo retangular ((h*l)+(h*b)+(l*b))*2.

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double altura;
		double lateral;
		double base; 
		double resultado;
		
		System.out.println("Digite a altura do cubo: ");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a lateral do cubo: ");
		lateral = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a base do cubo: ");
		base = Double.parseDouble(in.nextLine());
		
		resultado = ((altura*lateral)+(altura*base)+(lateral*base))*2;
		
		System.out.println("A área do Cubo é " + resultado);
		
		in.close();
		
	}

}
