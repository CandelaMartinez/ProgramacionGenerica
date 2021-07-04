package arrayList;

import java.util.*;
//clase ArrayList crea listas dinamicas, crece a medida que incluyo elementos en su interior
//si quiero agregar otro elemento mas lo unico que debo hacer el add, solo ira creciendo

public class C161UsoEmpleado {
public static void main(String [] args) {
	
	
	
	//arrayList: permiten almacenar objetos pero no tipos primitivos
	//constructo por defecto: crea una lista vacia que reserva espacio en memoria para 10 elementos.
	//si agrego 11 elementos: crea una copia. los almacena y borra el de 10
	
	ArrayList <Empleado> listaEmpleados= new ArrayList<Empleado>();
	
	//conviene indicar que voy a agregar mas de 10 elementos
	//listaEmpleados.ensureCapacity(11);
	
	
	//almacenar datos en su interior
	listaEmpleados.add(new Empleado("juan",67,3000));
	listaEmpleados.add(new Empleado("jose",76,6000));
	listaEmpleados.add(new Empleado("maria",27,2000));
	listaEmpleados.add(new Empleado("juan",67,3000));
	listaEmpleados.add(new Empleado("jose",76,6000));
	listaEmpleados.add(new Empleado("maria",27,2000));
	listaEmpleados.add(new Empleado("juan",67,3000));
	listaEmpleados.add(new Empleado("jose",76,6000));
	listaEmpleados.add(new Empleado("maria",27,2000));
	listaEmpleados.add(new Empleado("maria",27,2000));
	listaEmpleados.add(new Empleado("pedro",27,2000));
	
	//agregar en una posicion en concreto: empieza desde 0, reemplaza la posicion 3
	listaEmpleados.set(2, new Empleado("olga",55,1400));
	
	
	//obtener elemento en una posicion en concreto
	System.out.println(listaEmpleados.get(2).dameDatos());
	
	
	
	
	//si ya se que no voy a incluir mas elementos cuando termine
	//para optimizar recursos, cierro el arrayList para que el recolector de basura borre el exceso de memoria
	listaEmpleados.trimToSize();
	
	//ver cuanto elementos tiene
	System.out.println(listaEmpleados.size());
	
	
	//recorro el arrayList, con for each
	
			/*for(Empleado e: listaEmpleados) {
				
				System.out.println(e.dameDatos());
			}*/
	
	//creo un iterador para recorrer el arrayList
	//devuelve un objeto de tipo iterator, la guardo en un objeto
	Iterator<Empleado> miIterador= listaEmpleados.iterator();
	
	//hasNext() tiene mas? next() proximo elemento
	while(miIterador.hasNext()) {

		System.out.println(miIterador.next().dameDatos());

	
	}
	
	
	//recorro el arrayList con for
			/*for(int i=0;i<listaEmpleados.size();i++) {
				
				Empleado e= listaEmpleados.get(i);
				
				System.out.println(e.dameDatos());
			}*/
			
	//copiar lo que tenemos dentro de un array convencional y recorrer el array convencional
			//Empleado arrayEmpleados[]= new Empleado[listaEmpleados.size()];
			
			//copio lo que hay en el ArrayList dentro de arrayEmpleados
			/*listaEmpleados.toArray(arrayEmpleados);
	
			for(int i=0; i<arrayEmpleados.length;i++) {
				
				System.out.println(arrayEmpleados[i].dameDatos());
			}*/
}
}
class Empleado{
	
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	public String dameDatos() {
		
		return "El empleado se llama: "+nombre+" tiene: "+edad+" años, y un salario de "+ salario;
	}
	
}
