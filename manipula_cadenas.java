
public class manipula_cadenas {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String nombre = "Ezequiel";
		
		System.out.println("Mi nombre es: " + nombre);
	
		System.out.println("Mi nombre tiene " +nombre.length() +" letras");
		
		System.out.println("Mi primer letra del nombre es " +nombre.charAt(0));
		
		int ultima_letra = nombre.length();
		
		System.out.println("La ultima letra del nombre es " + nombre.charAt(ultima_letra - 1));
	
	}

}
