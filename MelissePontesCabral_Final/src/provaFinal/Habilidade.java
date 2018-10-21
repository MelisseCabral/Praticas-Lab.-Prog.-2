package provaFinal;

public abstract class Habilidade {
	private String nome;
	private String tipoDeDado;
	private Dado dado;
	
	public Habilidade(String nome, String tipoDeDado)throws Exception {
		if(nome.equals(null)|| nome.equals("")){
			throw new Exception("Nome invalido.");
		} else if(!(tipoDeDado.equals("d6") || tipoDeDado.equals("d10") || tipoDeDado.equals("d20"))){
			throw new Exception("Dado incorreto.");
		}
		
		CriaDado(tipoDeDado);
		
		this.setNome(nome);
		this.setTipoDeDado(tipoDeDado);
	}

	private Dado CriaDado(String tipoDeDado) {
		if (tipoDeDado.equals("d6")){
			dado = new DadoD6();
			
		} else if (tipoDeDado.equals("d10")){
			dado = new DadoD10();
			
		} else if (tipoDeDado.equals("d20")){
			dado = new DadoD20();
		}
		return dado;
	}
	
	public abstract int calculaEfeito();
	
	public abstract String efeitoHabilidade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception{
		this.nome = nome;
	}

	public String getTipoDeDado() {
		return tipoDeDado;
	}

	public void setTipoDeDado(String tipoDeDado) throws Exception{
		this.tipoDeDado = tipoDeDado;
	}

	public Dado getDado() {
		return dado;
	}

	public void setDado(Dado dado) {
		this.dado = dado;
	}

	@Override
	public String toString() {
		return "Habilidade [nome=" + nome + ", tipoDeDado=" + tipoDeDado
				+ ", dado=" + dado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dado == null) ? 0 : dado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((tipoDeDado == null) ? 0 : tipoDeDado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habilidade other = (Habilidade) obj;
		if (dado == null) {
			if (other.dado != null)
				return false;
		} else if (!dado.equals(other.dado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoDeDado == null) {
			if (other.tipoDeDado != null)
				return false;
		} else if (!tipoDeDado.equals(other.tipoDeDado))
			return false;
		return true;
	}
}
