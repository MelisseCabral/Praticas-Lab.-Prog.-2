package provaFinal;

public class HabilidadeDeDano extends Habilidade{
	
	private Dado dado;
	private int dano;

	public HabilidadeDeDano(String nome, String tipoDeDado) throws Exception {
		super(nome, tipoDeDado);
		dado = super.getDado();
	}
	
	@Override
	public int calculaEfeito() {
		dano = dado.rolarDado();
		return dano;
	}
	
	@Override
	public String efeitoHabilidade() {
		return "causa";
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	@Override
	public String toString() {
		return "HabilidadeDeDano [dado=" + dado + ", dano=" + dano
				+ ", calculaEfeito()=" + calculaEfeito()
				+ ", efeitoHabilidade()=" + efeitoHabilidade() + ", getDano()="
				+ getDano() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dado == null) ? 0 : dado.hashCode());
		result = prime * result + dano;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabilidadeDeDano other = (HabilidadeDeDano) obj;
		if (dado == null) {
			if (other.dado != null)
				return false;
		} else if (!dado.equals(other.dado))
			return false;
		if (dano != other.dano)
			return false;
		return true;
	}
}
