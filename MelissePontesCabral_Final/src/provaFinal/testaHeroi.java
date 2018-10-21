package provaFinal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testaHeroi {
	private Heroi heroi1;
	private Heroi heroi2;
	
	@Before
	public void criaHeroi() throws Exception {
		heroi1 = new Heroi("Mestre dos magos");
		heroi2 = new Heroi("Arqueiro");
	}
}
