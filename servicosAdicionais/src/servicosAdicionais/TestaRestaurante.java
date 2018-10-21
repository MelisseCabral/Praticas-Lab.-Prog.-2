package servicosAdicionais;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestaRestaurante {

	private Restaurante refeicao1;
	private Restaurante refeicao2;
	
	@Before
	public void CriaServicoRestaurante() throws Exception{
		Restaurante refeicao1 = new Restaurante(15);
		
	}
	
	@Test
	public void testaCriaServicoRestaurante() {
		Restaurante refeicao1;
		Restaurante refeicao2;
	}

}
