package servicosAdicionais;

import java.time.LocalDate;
/**Classe para objetos do tipo restaurante que implementam a interface de servi�o.*/
public class Restaurante implements Servico{
	private double custo;
	private final String descricao;
	private LocalDate dataDoPedido;
	
	public Restaurante(double custo) throws Exception{
		this.custo = custo;
		dataDoPedido = LocalDate.now();
		descricao = "Refeicao";
	
		if (custo <= 0){
			throw new Exception("Custo invalido, consumo deve ser acima de 0.");
		}
	}
	/** Double - calculaCustoTotal. 
	 * Metodo retorna o valor a ser pago pelo cliente.*/
	@Override
	public double calculaCustoTotal() {
		return custo;
	}
	/** String - dataDoPedido. 
	 * Metodo metodo retorna a data que o servi�o foi pedido.*/
	@Override
	public String dataDoPedido() {
		return dataDoPedido.toString();
	}
	/** String - getDescricao. 
	 * Metodo gera uma descri�ao do servi�o adicional acionado.*/
	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Restaurante [custo=" + custo + ", descricao=" + descricao
				+ ", dataDoPedido=" + dataDoPedido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(custo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime
				* result
				+ ((dataDoPedido == null) ? 0 : dataDoPedido.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Restaurante other = (Restaurante) obj;
		if (Double.doubleToLongBits(custo) != Double
				.doubleToLongBits(other.custo)){
			return false;
		} if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	
}