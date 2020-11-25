package excepciones_calculadora;

public class Calculadora_excepcion {
	private Double numerador;
	private Double denominador;
	
	
	public Calculadora_excepcion() {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	
	public Double divisionDeLaCalculadora(Double numerador, Double denominador) throws DivisorCeroException {
		if(denominador.equals(0.0)) {
			throw new DivisorCeroException ();
		}
		return numerador/denominador;
	}
	
}
