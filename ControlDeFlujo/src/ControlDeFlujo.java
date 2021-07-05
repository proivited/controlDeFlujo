import java.util.Scanner;

public class ControlDeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * if(condicion) si se cumple{
		 *  codigo
		 *  }
		 *  
		 *  if(condicion) si se cumple {
		 *  codigo 
		 *  codigo
		 *  } Si no se cumple la condicion se ejecuta
		 *  
		 *   else{
		 *  codigo
		 *  codigo
		 *  }
		 *  
		 *  if(condicion) si se cumple{
		 *  codigo
		 *  codigo
		 *  codigo
		 *  }
		 *  else if(Nueva condicion){
		 *  codigo
		 *  codigo
		 *  }
		 *  si no se cumple nada
		 *  else{
		 *  }
		 *  
		 *  
		 */
		
		/**
		 * Se lee la edad del usuiario por consola, si la edad es mayor a 18
		 * anos, se muestra un mensaje al usaurio que puedavotar,
		 * en caso contrario se mostrara un mensaje indicando que no puede 
		 * votar.
		 */
		String nombre;
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		Scanner leerNombre = new Scanner(System.in);
		System.out.println("Ingresa tu Nombre");
		int edad = leerEdad.nextInt();
		nombre = leerNombre.next();
		String mensaje = votar(edad, nombre);
		
		
		System.out.println(mensaje);
	}
	
	/**
	 * Escribir un programa que pia el nombre y la edad d eun paticipante si la 
	 * edad es mayo o igual a 18 y menor o igual a 29 mostrar un mensaje que 
	 * diga felicidades +nombre del ingresado a java full stak
	 * o que le diga tss no quedaste.
	 */
	
	public static String votar (int edad, String nombre) {
		String mensaje = "";
		if(edad >=18 && edad<=29) {
			mensaje = "Felicidades, " + nombre + " puedes participar en "
					+ "generation";
		} else {
			mensaje = "Lastima, " + nombre + " no puedes particiar en "
					+ "generation";
		}
		
				
		return mensaje;
		
	}

}
