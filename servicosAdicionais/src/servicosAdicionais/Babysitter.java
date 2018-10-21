package servicosAdicionais;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**Classe para objetos do tipo Babysitter que implementam a interface de serviço.*/
public class Babysitter implements Servico{
	private static final double HORA_NORMAL = 25;
	private static final double HORA_DOBRADA = 50;
	private static final LocalTime LIMITE_INICIO_HORA_DOBRADA = LocalTime.parse("18:00:00:000Z");
	private static final LocalTime LIMITE_FIM_HORA_DOBRADA = LocalTime.parse("07:00:00:000Z");
	private LocalDate dataDoPedido;
	private LocalTime horaDeEntrada;
	private LocalTime horaDeSaida;
	private double tempoUtilizado;
	private double valorTotal;
	private String descricao;
	private int duracaoHoraDobrada;
	private int duracaoHoraNormal;
	
	public Babysitter(String horaDeEntrada, String horaDeSaida){
		this.horaDeEntrada = LocalTime.parse(horaDeEntrada);
		this.horaDeSaida = LocalTime.parse(horaDeSaida);
		dataDoPedido = LocalDate.now();
		tempoUtilizado = getTempoUtilizado();
	}
	
	/** Double - calculaCustoTotal. 
	 * Metodo retorna o valor a ser pago pelo cliente.*/
	@Override
	public double calculaCustoTotal(){
		
		valorTotal = getDuracaoHoraNormal() * HORA_NORMAL + getDuracaoHoraDobrada() * HORA_DOBRADA;
		
		return valorTotal;
	}
	
	/** String - getDescricao. 
	 * Metodo gera uma descriçao do serviço adicional acionado.*/
	@Override
	public String getDescricao(){
		descricao = "Babysitter por " + tempoUtilizado + " horas.";
		return descricao;
		
	}
	
	/** String - dataDoPedido. 
	 * Metodo metodo retorna a data que o serviço foi pedido.*/
	@Override
	public String dataDoPedido(){
		return dataDoPedido.toString();
	}
	
	/** Int - getTempoUtilizado. 
	 * Metodo retorna a quantidade em horas utilizada do serviço.*/
	public double getTempoUtilizado(){
		tempoUtilizado = getDuracaoHoraNormal() + getDuracaoHoraDobrada();
		return tempoUtilizado;
	}
	
	/** Int - getDuracaoHoraDobrada(). 
	 * Metodo retorna o numero de horas utilizadas entre as 18h e as 07h.*/
	public int getDuracaoHoraDobrada() {
		if(horaDeEntrada.isAfter(LIMITE_INICIO_HORA_DOBRADA) && 
				horaDeSaida.isBefore(LIMITE_FIM_HORA_DOBRADA)){
			
			if(horaDeSaida.isBefore(LIMITE_FIM_HORA_DOBRADA) && 
					horaDeSaida.isAfter(LIMITE_INICIO_HORA_DOBRADA)){
				
				duracaoHoraDobrada = (int) Duration.between(horaDeEntrada, horaDeSaida).toHours();
				
			} else if(horaDeSaida.isAfter(LIMITE_FIM_HORA_DOBRADA) && 
					horaDeSaida.isBefore(LIMITE_INICIO_HORA_DOBRADA)){
				
				if(Duration.between(horaDeEntrada, horaDeSaida).toHours() > Duration.between
						(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours()){
					
					duracaoHoraDobrada = (int) Duration.between(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours();
				} 
			}
		} else if (horaDeEntrada.isAfter(LIMITE_FIM_HORA_DOBRADA) && 
				horaDeEntrada.isBefore(LIMITE_INICIO_HORA_DOBRADA)){
			
			if(horaDeSaida.isBefore(LIMITE_FIM_HORA_DOBRADA) && horaDeSaida.isAfter(LIMITE_INICIO_HORA_DOBRADA)){
				duracaoHoraDobrada = (int) Duration.between(LIMITE_INICIO_HORA_DOBRADA, horaDeSaida).toHours();
				
			} else if(horaDeSaida.isAfter(LIMITE_FIM_HORA_DOBRADA) && horaDeSaida.isBefore(LIMITE_INICIO_HORA_DOBRADA)){
				
				if(Duration.between(horaDeEntrada, horaDeSaida).toHours() > Duration.between(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours()){
					
					duracaoHoraDobrada = (int) Duration.between(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours();
				
				}
			} 
		} else {
			duracaoHoraDobrada = 0;
		}
		return duracaoHoraDobrada;
	}
	
	/** Int - getDuracaoHoraDobrada(). 
	 * Metodo retorna o numero de horas utilizadas entre as 7h e as 18h.*/
	public int getDuracaoHoraNormal() {
		if(horaDeEntrada.isAfter(LIMITE_INICIO_HORA_DOBRADA) && 
				horaDeSaida.isBefore(LIMITE_FIM_HORA_DOBRADA)){
			
			if(horaDeSaida.isBefore(LIMITE_FIM_HORA_DOBRADA) && 
					horaDeSaida.isAfter(LIMITE_INICIO_HORA_DOBRADA)){
				
				duracaoHoraNormal = (int) Duration.between(horaDeEntrada, horaDeSaida).toHours();
				
			} else if(horaDeSaida.isAfter(LIMITE_FIM_HORA_DOBRADA) && 
					horaDeSaida.isBefore(LIMITE_INICIO_HORA_DOBRADA)){
				
				if(Duration.between(horaDeEntrada, horaDeSaida).toHours() > Duration.between
						(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours()){
					
					duracaoHoraNormal = (int) Duration.between(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours();
				} 
			}
		} else if (horaDeEntrada.isAfter(LIMITE_FIM_HORA_DOBRADA) && 
				horaDeEntrada.isBefore(LIMITE_INICIO_HORA_DOBRADA)){
			
			if(horaDeSaida.isBefore(LIMITE_FIM_HORA_DOBRADA) && 
					horaDeSaida.isAfter(LIMITE_INICIO_HORA_DOBRADA)){
				duracaoHoraNormal = (int) Duration.between(LIMITE_INICIO_HORA_DOBRADA, horaDeSaida).toHours();
				
			} else if(horaDeSaida.isAfter(LIMITE_FIM_HORA_DOBRADA) && 
					horaDeSaida.isBefore(LIMITE_INICIO_HORA_DOBRADA)){
				
				if(Duration.between(horaDeEntrada, horaDeSaida).toHours() > Duration.between
						(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours()){
					
					duracaoHoraNormal = (int) Duration.between(LIMITE_INICIO_HORA_DOBRADA, LIMITE_FIM_HORA_DOBRADA).toHours();
				
				}
			}
		} else {
			duracaoHoraNormal = 0;
		}
		return duracaoHoraNormal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataDoPedido == null) ? 0 : dataDoPedido.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		long temp;
		temp = Double.doubleToLongBits(tempoUtilizado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((horaDeSaida == null) ? 0 : horaDeSaida.hashCode());
		result = prime * result
				+ ((horaDeEntrada == null) ? 0 : horaDeEntrada.hashCode());
		temp = Double.doubleToLongBits(valorTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Babysitter other = (Babysitter) obj;
		if (dataDoPedido == null) {
			if (other.dataDoPedido != null)
				return false;
		} else if (!dataDoPedido.equals(other.dataDoPedido))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (Double.doubleToLongBits(tempoUtilizado) != Double
				.doubleToLongBits(other.tempoUtilizado))
			return false;
		if (horaDeSaida == null) {
			if (other.horaDeSaida != null)
				return false;
		} else if (!horaDeSaida.equals(other.horaDeSaida))
			return false;
		if (horaDeEntrada == null) {
			if (other.horaDeEntrada != null)
				return false;
		} else if (!horaDeEntrada.equals(other.horaDeEntrada))
			return false;
		if (Double.doubleToLongBits(valorTotal) != Double
				.doubleToLongBits(other.valorTotal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Babysitter [dataDoPedido=" + dataDoPedido + ", horaDeEntrada="
				+ horaDeEntrada + ", horaDeSaida=" + horaDeSaida
				+ ", tempoUtilizado=" + tempoUtilizado + ", valorTotal=" + valorTotal
				+ ", descricao=" + descricao + "]";
	}
}