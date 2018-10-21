package lp2.lab04;

import java.util.Scanner;

public class ExplorandoMundoDasSeries {
	private static String opcao;
	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.print("ESCOLHA UMA OPÇÃO:\n1. PA\n2.FIBONACCI");
		opcao = sc.next();
		
		if (opcao.equals("2")){
			Fibonacci fib = new Fibonacci(10);
			System.out.print("Fibonacci:\n " + fib.geraSequencia());
		} else if (opcao.equals("1")){
			ProgressaoAritmetica pa = new ProgressaoAritmetica(2, 4);
		
			//mostra 5 primeiros termos da PA, gerando um por vez
			System.out.println("5 primeiros termos da PA: um por vez...");
			System.out.println("Primeiro: " + pa.primeiro());
			for (int i = 2; i <=5; i++) {
			System.out.println("Termo " + i + ": " + pa.proximo());
			}
		
			//mostra um termo qualquer e seu proximo
			System.out.println("Um termo qualquer (8): " + pa.termo(8));
			System.out.println("Proximo: " + pa.proximo());
		
			//mostra 5 primeiros termos da PA, gerando todos de uma vez
			System.out.println("5 primeiros termos da PA: todos de uma vez...");
			System.out.println(pa.geraTermos(5));
			System.out.println("Proximo: " + pa.proximo());
			
			//reinicia a PA
			System.out.println("Primeiro: " + pa.primeiro());
			System.out.println("Proximo: " + pa.proximo());
		}
	}
}
	