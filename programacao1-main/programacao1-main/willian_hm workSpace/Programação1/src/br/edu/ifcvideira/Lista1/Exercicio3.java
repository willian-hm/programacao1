//3 – Faça um algoritmo para calcular a área superficial de uma esfera (4*pi*r^2)

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double area;
		
		System.out.println("Digite o raio da esfera:");
		raio = Double.parseDouble(in.nextLine());
		
		area = 4 * Math.PI * Math.pow(raio, 2);
		System.out.println("A area da esfera é: " + area);
		
		in.close();
	}
}
