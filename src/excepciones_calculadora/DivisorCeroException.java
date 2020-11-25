package excepciones_calculadora;

public class DivisorCeroException extends Exception {

	public DivisorCeroException() {
		super("no se pueda dividir por cero");
	}

}
