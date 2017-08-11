import javax.swing.*;
public class entrada_ejempl2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Escribe tu nombre");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad_usuario = Integer.parseInt(edad);
		
		System.out.println("Hola " +nombre_usuario +", tu edad es: "+edad_usuario);
		

	}

}
