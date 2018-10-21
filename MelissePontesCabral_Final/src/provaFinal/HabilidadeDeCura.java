package provaFinal;

public class HabilidadeDeCura extends Habilidade{

	private Dado dado;
	private int cura;

	public HabilidadeDeCura(String nome, String tipoDeDado) throws Exception {
		super(nome, tipoDeDado);
		dado = super.getDado();
	}
	
	@Override
	public int calculaEfeito() {
		cura = dado.rolarDado();
		return cura;
	}
	
	@Override
	public String efeitoHabilidade() {
		return "recupera";
	}

	public int getCura() {
		return cura;
	}

	public void setCura(int cura) {
		this.cura = cura;
	}

	@Override
	public String toString() {
		return "HabilidadeDeCura [dado=" + dado + ", cura=" + cura
				+ ", calculaEfeito()=" + calculaEfeito()
				+ ", efeitoHabilidade()=" + efeitoHabilidade() + ", getCura()="
				+ getCura() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cura;
		result = prime * result + ((dado == null) ? 0 : dado.hashCode());
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
		HabilidadeDeCura other = (HabilidadeDeCura) obj;
		if (cura != other.cura)
			return false;
		if (dado == null) {
			if (other.dado != null)
				return false;
		} else if (!dado.equals(other.dado))
			return false;
		return true;
	}

}
