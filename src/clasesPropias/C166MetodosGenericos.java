package clasesPropias;

import java.util.GregorianCalendar;

//le paso al metodo generico primero un array del tipo String y luego uno del tipo Persona, se adapta
public class C166MetodosGenericos {

	public static void main(String[] args) {

		String nombres[]= {"pepe","jose","maria","albet"};
		System.out.println(MisMatrices.getElementos(nombres));
		
		Persona [] misEmpleados= {new Persona("juan"), new Persona("bety"),new Persona("albet")};
		System.out.println(MisMatrices.getElementos(misEmpleados));
		
		//uso el metodo generico
		System.out.println(MisMatrices.getMenor(nombres));
		
		//creo un array de GregorianCalendar que si implementa la interface comparable
		GregorianCalendar fechas[]= {new GregorianCalendar(2015,07,12),new GregorianCalendar(2010,07,12)};
		
		//puedo usar el metodo porque GC implementa la I comparable
		//aun falta transformar las fechas en un formato legible
		System.out.println(MisMatrices.getMenor(fechas));
		
	}

}

class MisMatrices{
	
	//metodo generico, static para no necesitar una instancia de la clase MisMatrices para usarlo, metodo de clase
	//argumento de tipo<>
	
	public static <T> String getElementos(T array[]) {
		
		return "el array tiene "+array.length+" elementos";
		
	}
	
	//que me devuelva el elemento menor del array que paso por parametro
	//compareTo pertenece a la I comparable. 
	//todos los argumentos que le pase al metodo tienen que implementar la interface Comparable para que pueda usar el metodo
	//se usa extends por mas que sea una interface. podemos usar clases que implementen la I o clases que hereden de esas clases
	public static <T extends Comparable> T getMenor(T[]a) {
		
		//evito posibles errores en caso de que le pase un array vacio
		if(a==null||a.length==0) {
			return null;
			
		}
		//compareTo: compara elementos de un array uno con otro para devolver si es mayor, menor o igual. 
		//pertenece a la I comparable
		//los ordena, devuelve - es menor, 0 son iguales, + es mayor
		
		//inicio menor con el elemento de la posicion 0 del array que paso como parametro
		T menor=a[0];
		
		//empiezo a recorrer el array desde la posicion 1 porque la posicion 0 ya esta almacenada
		for(int i=1; i<a.length; i++) {
			
			//si el resultado de la comparacion da un + : a[0] es mayor, entonces  a[i] es el nuevo menor
			//compareTo pertenece a la I comparable. 
			if(menor.compareTo(a[i])>0) {
				menor=a[i];
			}
			
		}
		
		//al salir del bucle tendre dentro de menor el elemento mas chico del array
		return menor;
		
		
		
	}
}