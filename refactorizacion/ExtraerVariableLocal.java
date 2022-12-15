package es.studium.refactorizacion;

public class ExtraerVariableLocal
{

	private static String mensaje;
	public static void main(String[] args)
	{
		int numero = 3;
		mensaje = "El factorial de ";
		String es = " es ";					 // Seleccionamos lo que queramos convertir a variable y nos crea la variable el programa solo.
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
		numero = 5;
		System.out.println(mensaje + numero + es + calcularFactorial(numero));
	}
	public static double calcularFactorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
