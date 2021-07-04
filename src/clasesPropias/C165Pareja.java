package clasesPropias;
//clase generica propia
//agrego parametro de tipo en mayusculas: T U K
public class C165Pareja<T> {

	private T primero;
	
	//constructor
	public C165Pareja() {
		primero=null;
	}
	
	//setter que cambien valor inicial
	public void setPrimero(T nuevoValor) {
		
		primero=nuevoValor;
	}
	
	//getter
	public T getPrimero() {
		
		return primero;
	}
	
	//el argumento es un generico de tipo empleado o cualquier subclase perteneciente a empleado
	//tipo comodin
	public static void imprimirTrabajador(C165Pareja<? extends Empleado>p) {
		
		Empleado primero= p.getPrimero();
		System.out.println(primero);
		
	}
	
}
