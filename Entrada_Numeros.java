import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10000.0;
		
		//Le da el resultados con 2 decimales
		
		System.out.printf("%1.2f",x/3);
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		
		double numero = Double.parseDouble(num1);
		
		System.out.print("La raiz de "+ numero + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(numero));

	}

}
