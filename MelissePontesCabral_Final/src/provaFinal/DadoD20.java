package provaFinal;

public class DadoD20 implements Dado{
	private int numDeFaces;
	
	public DadoD20(){
		numDeFaces = 20;
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
		return "DadoD20 [numDeFaces=" + numDeFaces + ", numDeFaces()="
				+ numDeFaces() + "]";
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
		DadoD20 other = (DadoD20) obj;
		if (numDeFaces != other.numDeFaces)
			return false;
		return true;
	}
}
