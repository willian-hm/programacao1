//7 – Faça um algoritmo para calcular o volume de um cone ((pi*r^2*h) / 3).

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double resultado;
		
		System.out.println("Digite a altura do cubo");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a lateral do cubo");
		altura = Double.parseDouble(in.nextLine());
		
		resultado = (Math.PI*Math.pow(raio, 2)*altura) / 3;
		
		System.out.println("O volume do cone é " + resultado);
		
		in.close();
		
	}

}