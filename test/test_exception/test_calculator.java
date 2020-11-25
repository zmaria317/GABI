package test_exception;

import static org.junit.Assert.*;

import org.junit.Test;

import excepciones_calculadora.Calculadora_excepcion;
import excepciones_calculadora.DivisorCeroException;

public class test_calculator {

	@Test
	public void queElDenominadorDeCero() throws Exception  {
		
		Calculadora_excepcion casio = new Calculadora_excepcion();
		
		Double resultado = casio.divisionDeLaCalculadora(1.0, 0.0);
		
		assertEquals(0.0, resultado, 0.01);
		
		
	}
	

	@Test (expected = DivisorCeroException.class)
	public void queAlDividirPorCeroTermineConUnaExcepcion() throws DivisorCeroException {
		
		Calculadora_excepcion casio = new Calculadora_excepcion();
		
		Double resultado = casio.divisionDeLaCalculadora(1.0, 0.0);
		
	}

}








