/* Aluna: Melisse Pontes Cabral */

import java.util.Scanner;

public class IdadeParaVotacaoInteligente{
	public static void main (String[] agrs) {
		Scanner input = new Scanner(System.in);
		int anonascimento = input.nextInt();
		int idade = 2014 - anonascimento;
		if (idade >= 16) {
			System.out.println("Esta apto a votar");
		} else{ 
			System.out.println("Nao esta apto a votar");
		}
	}
}
