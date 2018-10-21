package lp2.lab04;
/*Aluna: Melisse Pontes Cabral*/

/**
 * Classe cria sequecias de progressão aritmetica
* 
 * @author Melisse Cabral
 * 
 */
public class ProgressaoAritmetica {
	
	private final int primeiro;
	private int razao;
	private int termoAtual;
	private int n;
	private String termos;
	
	/** Construtor padrão. */
	public ProgressaoAritmetica(int primeiro, int razao) {
		this.primeiro = primeiro;
		this.razao = razao;
		termoAtual = primeiro;
	}
	/** Gera sequencia P.A com n elementos. */
	public String geraTermos(int n){
		termoAtual = primeiro;
		for (int i = 1; i < n; i++){
			if (i == 1){
				termos += ("[" + String.valueOf(primeiro()) + ", ");
			} else if (i <(n-1)){
				termos += String.valueOf(proximo() + ", ");
			} else if (i < n){
				termos += String.valueOf(proximo() + "]");
			}
		}
		return termos;
	}
	/** Calcula proximo termo da P.A. */
	public int proximo(){
		return termoAtual = termoAtual + razao;
	}
	/** Calcula um termo especifico da sequencia. */
	public int termo(int n){
		termoAtual = primeiro + (n - 1) * razao;
		return termoAtual;
	}
	/** Define primeiro termo  */
	public int primeiro (){
		termoAtual = primeiro;
		return primeiro;
	}
	/** Pega o número da razão. */
	public int getRazao(){
		return razao;
	}
	/** Pega o numero de N. */
	public int getN() {
		return n;
	}
	/** Altera o valor de N */
	public void setN(int n) {
		this.n = n;
	}
}