/*8 – Faça um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
escrever o valor correspondente em graus Celsius ( C=(F-32)/1.8). */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double c;
		double f;
		
		System.out.println("Digite a temperatura em fahrenheit");
		f = Double.parseDouble(in.nextLine());
		
		c = (f-32)/1.8;
		
		System.out.println("A temperatura em Celsius é: " + c);
		
		in.close();
		
	}

}