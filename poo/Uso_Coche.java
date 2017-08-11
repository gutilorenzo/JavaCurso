package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche = new Coche(); //Asi se instancia una clase
		
		miCoche.set_color("blanco");
		
		System.out.println(miCoche.dime_datos_generales());
		
		System.out.println(miCoche.get_color());
		
		miCoche.set_asientos_cuero("no");
		
		System.out.println(miCoche.get_asientos_cuero());
		
		System.out.println("El precio del coche es "+miCoche.precio_coche());

	}

}
