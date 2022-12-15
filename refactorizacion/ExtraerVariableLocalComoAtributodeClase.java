package es.studium.refactorizacion;

public class ExtraerVariableLocalComoAtributodeClase
{
	private static int numero;

	// Diferencia entre Static y no Static. Extraemos una variable local como atributo de clase. Es local porque esta dentro del main. Si la intentamos usar dentro de la funcion no podriamos.
	// Seleccionamos la variable y seleccionamos refactor "Convert local variable to field" y dejara de ser local pasandose a global. 
	public static void main(String[] args)
	{
		ExtraerVariableLocalComoAtributodeClase refactor = new ExtraerVariableLocalComoAtributodeClase(); //(1)//La estatica no necesita esto porque esta llamando a la funcion directamente.																
		numero = 3;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
		numero = 5;
		System.out.println("El factorial de " + numero + " es " + refactor.calcularFactorial(numero));
	}

	public double calcularFactorial(double n) // Si quitamos static, creamos una nueva clase (1) . Como no es estatica,
												// instanciamos  una clase nueva con el objeto de la clase para poder llamar a la funcion. Como los metodos getter and setter.
	{
		 // numero = 10; al ser global ahora podemos poner "numero" dentro de la funcion. 
						
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
