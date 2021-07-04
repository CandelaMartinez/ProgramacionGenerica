package clasesPropias;

public class C167HerenciaGenericos {

	public static void main(String[] args) {
		//principio de sustitucion en clases normales
		Empleado administrativa= new Empleado("elena",45,1500);
		Jefe directora =new Jefe("ana",27,3500);
		
		//gracias a que un jefe siempre es un empleado puedo almacenar a un jefe dentro de un empleado
		Empleado nuevoEmpleado= directora;

		
		//esto no es asi cuando manejamos clases genericas
		
		C165Pareja<Empleado> administrativa2= new C165Pareja<Empleado>();
		
		C165Pareja<Jefe> directora2= new C165Pareja<Jefe>();
		
		//esto da un error
		//C165Pareja<Empleado> nuevoEmpleado2= directora2;
		
		//uso metodo de la clase pareja
		C165Pareja.imprimirTrabajador(administrativa2);
		
		//puedo usar el metodo porque tengo un tipo comodin como argumento
		C165Pareja.imprimirTrabajador(directora2);
		
		
		
	}

}
