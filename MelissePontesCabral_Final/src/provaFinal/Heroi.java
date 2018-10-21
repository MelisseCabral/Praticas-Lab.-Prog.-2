package provaFinal;

import java.util.List;
import java.util.ArrayList;

public class Heroi {
	private String nome;
	private int hp = 100;
	private List<Habilidade> habilidades = new ArrayList<Habilidade>();
	
	public Heroi(String nome)throws Exception{
		if(nome.equals("")|| nome.equals(null)){
			throw new Exception("Nome de heroi invalido.");
		}
		this.nome = nome;
	}
	@SuppressWarnings("unused")
	private String usaHabilidade(Habilidade hab) throws Exception{
		if(habilidades.contains(hab)){
			setHp(getHp() - hab.calculaEfeito());
			return getNome() + " usou " + hab.getNome() + ": " + hab.efeitoHabilidade() + " " + hab.calculaEfeito() + 
					" de vida " + "(max: " + hab.getDado().numDeFaces() + ").";
			
		} else {
			throw new Exception("Heroi nao possui essa habilidade.");
		}
	}
	
	@SuppressWarnings("unused")
	private boolean aprendeHabilidade(Habilidade hab){
		if(habilidades.contains(hab) || habilidades.size() == 5){
			return false;
		} if (habilidades.size() <= 4){
			habilidades.add(hab);
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("unused")
	private boolean esqueceHabilidade(Habilidade hab){
		return habilidades.remove(hab);
	}
	
	private String imprimiHabilidades(){
		return habilidades.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Habilidade> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((habilidades == null) ? 0 : habilidades.hashCode());
		result = prime * result + hp;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Heroi other = (Heroi) obj;
		if (habilidades == null) {
			if (other.habilidades != null)
				return false;
		} else if (!habilidades.equals(other.habilidades))
			return false;
		if (hp != other.hp)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Heroi [nome=" + nome + ", hp=" + hp + ", habilidades="
				+ habilidades + ", imprimiHabilidades()="
				+ imprimiHabilidades() + ", getNome()=" + getNome()
				+ ", getHabilidades()=" + getHabilidades() + ", getHp()="
				+ getHp() + "]";
	}
	
}
