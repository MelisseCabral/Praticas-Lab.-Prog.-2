package lp2.lab05;

public class Sala {
	private int NUM_LINHAS, NUM_COLUNAS;
	private String [][] sala;
	
	public Sala(int NUM_LINHAS, int NUM_COLUNAS) throws Exception {
		if (NUM_LINHAS < 0 || NUM_LINHAS < 0){ 
			throw new Exception ("Parametros incorretos para a criacao da sala. As dimensoes da sala devem ser representadas por valores positivos maiores que zero");
		}
		this.NUM_LINHAS = NUM_LINHAS;
		this.NUM_COLUNAS = NUM_COLUNAS;
		sala = CriaSala();
	}
	public String[][] CriaSala() {
		for (int i = 0; NUM_LINHAS > i; i++){
			for (int j = 0; NUM_LINHAS > j; j++){
				this.sala[i][j] = " ";
			}
		}
		return sala;

	}
	public void DimensoesDaSala() {
		getNumPosicoesVerticais(NUM_COLUNAS);
		getNumPosicoesHorizontais(NUM_LINHAS);
	}
	public void IsVazia() {
		
	}
	public boolean VerificaPosicaoValida() {
		if (NUM_LINHAS < 0|| NUM_COLUNAS < 0){
			return false;
		}
		return true; 
		
	}
	public void InserirObstaculos() throws Exception {
		
	}
	public void SetPosicao() throws Exception {
		
	}
	public void IsPosicaoLivre() throws Exception {
		
	}
	public int getNumPosicoesVerticais(int NUM_COLUNAS) {
		this.NUM_COLUNAS = NUM_COLUNAS;
		return NUM_COLUNAS;
	}
	public int getNumPosicoesHorizontais(int NUM_LINHAS) {
		this.NUM_LINHAS = NUM_LINHAS;
		return NUM_LINHAS;
		
	}
}