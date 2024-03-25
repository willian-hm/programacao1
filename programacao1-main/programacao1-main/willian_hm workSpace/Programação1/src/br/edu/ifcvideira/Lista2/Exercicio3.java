/* 3 - Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma
mensagem que diga se ela poderá ou não votar este ano (não é necessário
considerar o mês em que a pessoa nasceu). */

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int atual;
        int nascimento;
        int idade;

        System.out.println("Digite o ano atual:");
        atual = Integer.parseInt(in.nextLine());

        System.out.println("Digite o ano de nascimento");
        nascimento = Integer.parseInt(in.nextLine());

        idade = atual - nascimento;

        if (idade >= 18) {
            System.out.println("Voto obrigatório");
        } else if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não vota");
        }

        in.close();
    }
}
