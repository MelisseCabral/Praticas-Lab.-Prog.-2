/* Aluna: Melisse Pontes Cabral */

package lp2.lab02;

import java.util.Scanner;

public class PedraPapelTesoura {
	private static String jogador1;
	private static String jogador2;

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String Jogador1 = "", Jogador2 = "";
		
		// Criar laço para empates
		
		while (Jogador1.equals(Jogador2)){
			recebejogadas(input);
			avaliajogadas(Jogador1, Jogador2);
	}
		
}

	private static void avaliajogadas(String Jogador1, String Jogador2) {
		// Avalia jogadas
		if (Jogador1.equals("0")){
			if (Jogador2.equals("1")){
				System.out.println("PEDRA - PAPEL");
				System.out.println("Jogador 2 ganhou!");
			} else if (Jogador2.equals("2")){
				System.out.println("PEDRA - TESOURA");
				System.out.println("Jogador 1 ganhou!");
			} 
		} else if (Jogador1.equals("1")){
			if (Jogador2.equals("0")){
				System.out.println("PAPEL - PEDRA");
				System.out.println("Jogador 1 ganhou!");
			}else if (Jogador2.equals("2")){
				System.out.println("PAPEL - TESOURA");
				System.out.println("Jogador 2 ganhou!");
				}
		} else if (Jogador1.equals("2")){
			if (Jogador2.equals("0")){
				System.out.println("TESOURA - PEDRA");
				System.out.println("Jogador 2 ganhou!");
			} else if (Jogador2.equals("1")){
				System.out.println("TESOURA - PAPEL");
				System.out.println("Jogador 1 ganhou!");
		}
}
	}

	private static void recebejogadas(Scanner input) {
		// receber jogadas
		System.out.println("Jogador 1: ");
		System.out.println("Pedra(0), Papel(1), Tesoura(2)? ");
		jogador1 = input.next();
		System.out.println("Jogador 2: ");
		System.out.println("Pedra(0), Papel(1), Tesoura(2)? ");
		jogador2 = input.next();
	}
}
