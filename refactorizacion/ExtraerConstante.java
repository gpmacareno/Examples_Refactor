package es.studium.refactorizacion;

public class ExtraerConstante // Pasaremos a continuacion a extraer una constante.
							  //En este caso extraeremos una cadena, ya que "el factorial de" y "es" lo estamos repitiendo. 
							  //Refactor - Extract Constant - seleccionando todo incluido en este caso las comillas. 
{
	private static final String ES = " es ";
	private static final String TEXTO = "El factorial de ";

	public static void main(String[] args)
	{

		int numero = 3;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
		numero = 5;
		System.out.println(TEXTO + numero + ES + calcularFactorial(numero));
	}

	public static double calcularFactorial(double n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
