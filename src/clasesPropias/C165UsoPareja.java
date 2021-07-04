package clasesPropias;

//programacion generica
public class C165UsoPareja {

	public static void main(String[] args) {
		
		//instancio la clase generica
		//primero esta inicializado en null
		C165Pareja <String> una= new C165Pareja<String>();
		
		//cambio el valor de la variable de clase primero
		//la clase generica se adapta a recibir el String 
		una.setPrimero("hola");
		
		//obtengo el valor de primer
		System.out.println(una.getPrimero());
		
		//creo instancia de la clase persona
		Persona per1= new Persona("ana");
		
		//2 instancia de clase Pareja como clase Persona
		//la clase generica se adapta al tipo Persona
		C165Pareja<Persona> dos =new C165Pareja<Persona>();
		
		dos.setPrimero(per1);
		System.out.println(dos.getPrimero().toString());
		
		

	}

}

class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre= nombre;
		
	}
	
	public String toString(){
		
		return nombre;
		
	}
}