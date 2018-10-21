package lp2.lab04;
/**
 * Classe gera sequencia de fibonacci
* 
 * @author Melisse Cabral
 * 
 */
public class Fibonacci {
	private String termos;
	private int n;
	public Fibonacci(int n){
	    this.n = n;
	}
	/** metodo gera o proximo numero da sequencia*/
	private long fib(int n) {
		if (n <= 1){
			return n;
		}else {
			return fib(n-1) + fib(n-2);
		}
	}
	/** Metodo cria sequencias e agrupa em uma string*/
	public String geraSequencia(){
		for (int i = 0; i <= n; i++)
			if (i == 0){
				termos += ("[" + String.valueOf(fib(i)) + ", ");
			} else if (i == n){
				termos += String.valueOf(fib(i) + "]");
			}else{
				termos += String.valueOf(fib(i)) + ", ";
		}
		return termos;
	}
}