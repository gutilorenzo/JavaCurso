package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Ana");
		
		Empleados trabajador3 = new Empleados("Antonio");
		
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.set_seccion("RRHH");
		
		System.out.println(trabajador1.get_informacion());		
	
		System.out.println(trabajador2.get_informacion());		
		
		System.out.println(trabajador3.get_informacion());
		
		System.out.println(trabajador4.get_informacion());

	}
	
	
}

class Empleados{
	
	public Empleados(String nom){
		
		nombre = nom;
		
		seccion = "Administración";
		
		Id = idSiguiente;
		
		idSiguiente++;
		
	}
	
	public void set_seccion(String seccion){ //Setter
		
		this.seccion = seccion;
		
	}
	
	/*public void set_nombre(String nombre){ //Setter
		
		this.nombre = nombre;				//Sin el FINAL funciona bien
		
	}*/
	
	public String get_informacion(){ //Getter
		
		return "El nombre del empleado es: "+nombre+ ". Y trabaja en la seccion: "+seccion+". Y el Id es igual a: "+Id;
		
	}
	
	
	private final String nombre; //Dejo constante el nombre, no me va a dejar modificar el valor que almacenamos en el contructor
	
	private String seccion;
	
	private int Id;
	
	private static int idSiguiente = 1;
	
}
