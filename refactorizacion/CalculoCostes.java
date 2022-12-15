package es.studium.refactorizacion;

public class CalculoCostes
{

	private static final double SUELDO_TRABAJADORES = 1200.5;

	public static void main(String[] args)
	{
		System.out.println(costeTrabajadores(50));
	}
	
	public static double costeTrabajadores(int numeroTrabajadores)		//Función como programación.
	{																					
		return SUELDO_TRABAJADORES * numeroTrabajadores; // seleccionamos lo que queremos refactorizar, selecciono 1200.5 para extraer como constante
	}

}
