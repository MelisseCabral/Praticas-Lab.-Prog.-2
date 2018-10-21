package servicosAdicionais;

import java.time.LocalDate;

/**Classe para objetos do tipo AluguelDeCarro que implementam a interface de servico.*/
public class AluguelDeCarro implements Servico {
	private boolean tanqueCheio, assegurado,removeServico;
	private String tipoDeCarro;
	private int numeroDeDiarias;
	private LocalDate dataDoPedido;
	private Carro carro;
	private String descricao;
	
	public AluguelDeCarro(boolean tanqueCheio, boolean assegurado
			, String tipoDeCarro) throws Exception{
		this.assegurado = assegurado;
		this.tanqueCheio = tanqueCheio;
		this.dataDoPedido = LocalDate.now();
		numeroDeDiarias = getNumeroDeDiarias();
		
		if (getNumeroDeDiarias() <= 0){
			throw new Exception("Intervalo de tempo invalido.");
		}
		
		if (tipoDeCarro.equals("LUXO")){
			carro = new Carro(Carro.Tipo.LUXO);
			
		}else if(tipoDeCarro.equals("EXECUTIVO")){
			carro = new Carro(Carro.Tipo.EXECUTIVO);
			
		} else{
			throw new Exception ("Tipo De Carro Invalido");
		}
	}
	/** Double - calculaCustoTotal. 
	 * Metodo retorna o valor a ser pago pelo cliente.*/
	public double calculaCustoTotal(){
		double custo = numeroDeDiarias * carro.getTipo().getValorDiaria();
		
		if (assegurado == true){
			custo += 100;
		}
		if (tanqueCheio == true){
			custo += 150;
		}
		
		return custo;
	}
	/** String - getDescricao. 
	 * Metodo gera uma descricao do servico adicional acionado.*/
	public String getDescricao(){
		descricao = "Aluguel de carro " + carro.getTipo() + " por " + numeroDeDiarias +  " dias.";
		
		if (tanqueCheio == true){
			descricao += " Com tanque Cheio.";
		}
		if (assegurado == true){
			descricao += " Com seguro.";
		}
		return descricao;
	}
	/** String - dataDoPedido. 
	 * Metodo metodo retorna a data que o servico foi pedido.*/
	public String getDataQueFoiPedido() {
		return dataDoPedido.toString();
	}
	/** Int - getNumeroDeDiarias(). 
	 * Metodo retorna o numero de dias de servico que foram contratados.*/
	public int getNumeroDeDiarias(){
		return numeroDeDiarias;
	}
	/** boolean - isTanqueCheio(). 
	 * Metodo retorna a o estado do tanque do carro contratado.*/
	public boolean isTanqueCheio() {
		return tanqueCheio;
	}
	
	/** boolean - isAssegurado(). 
	 * Metodo retorna a o estado do seguro do carro contratado.*/
	public boolean isAssegurado() {
		return assegurado;
	}
	
	/** String - getTipoDeCarro(). 
	 * Metodo retorna a o tipo de carro contratado.*/
	public String getTipoDeCarro() {
		return tipoDeCarro;
	}
	
	/** Void - setNumeroDeDiarias(). 
	 * Metodo extende o contrato de aluguel de acordo com o numero passado.*/
	public void setNumeroDeDiarias(int numeroDeDiarias) {
		this.numeroDeDiarias = numeroDeDiarias;
	}
	
	public Carro getCarro() {
		return carro;
	}
	/** Void - isRemoveServico(). 
	 * Metodo encerra o contrato de aluguel.*/
	public boolean isRemoveServico() {
		return removeServico;
	}
	/** String - getDataDoPedido(). 
	 * Metodo retorna a data que o servico foi contratado.*/
	public String getDataDoPedido() {
		return dataDoPedido.toString();
	}
	@Override
	public String dataDoPedido() {
		// TODO Auto-generated method stub
		return null;
	}
}