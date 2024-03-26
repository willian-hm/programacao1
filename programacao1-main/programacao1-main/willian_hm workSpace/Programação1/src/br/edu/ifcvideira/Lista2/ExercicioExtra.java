// Verificar se um número é primo ou não

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int i;
        int div = 0;

        System.out.println("Digite um número");
        num = Integer.parseInt(in.nextLine());

        in.close();

        for (i=2;i<(num-1);i++){
            if (num%i==0) {
              div = 1;
              if (div==1) {
                break;
              }
            }
        } 
        if (div==0) {
            System.out.println("É número primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
