package interfaces_basico;

public class Suma implements Operable{

	@Override
	public double operar(double d1, double d2) {
		double resultado = d1 + d2;
		return resultado;
	}
	
}
