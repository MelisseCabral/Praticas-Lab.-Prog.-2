package servicosAdicionais;

/** Classe para criar um carro */
public class Carro {

	public enum Tipo {
		
		EXECUTIVO(60.0), LUXO(100.0);
		
		double valorDiaria;
		
		Tipo(double valorDiaria) {
			this.valorDiaria = valorDiaria;
		};
		
		double getValorDiaria() {
			return this.valorDiaria;
		}
	}
	
	private Tipo tipo;

	public Carro(Tipo tipo) {
		super();
		this.setTipo(tipo);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
}