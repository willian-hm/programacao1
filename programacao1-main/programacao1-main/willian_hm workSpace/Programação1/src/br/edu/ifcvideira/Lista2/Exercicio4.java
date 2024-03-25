// 4 - Ler 2 valores e escrever o maior deles

package br.edu.ifcvideira.Lista2;
 
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite um número:");
        num1 = Double.parseDouble(in.nextLine());

        System.out.println("Digite outro número:");
        num2 = Double.parseDouble(in.nextLine());

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println(num1 + " e " + num2 + " são iguais");
        }

        in.close();
    }
}
