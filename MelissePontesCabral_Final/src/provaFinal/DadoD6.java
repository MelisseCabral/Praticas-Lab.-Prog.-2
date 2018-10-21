package provaFinal;

public class DadoD6 implements Dado{

private int numDeFaces;
	
	public DadoD6(){
		numDeFaces = 6;
	}
	
	@Override
	public int numDeFaces() {
		return numDeFaces;
	}

	@Override
	public int rolarDado() {
		return (int) ((Math.random()) * numDeFaces) + 1;
	}

	@Override
	public String toString() {
		return "DadoD6 [numDeFaces=" + numDeFaces + ", numDeFaces()="
				+ numDeFaces() + ", rolarDado()=" + rolarDado() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numDeFaces;
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
		DadoD6 other = (DadoD6) obj;
		if (numDeFaces != other.numDeFaces)
			return false;
		return true;
	}

}
