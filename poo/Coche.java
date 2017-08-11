package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero,climatizador;
	
	public Coche(){
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
		
	}
	
	public String get_largo(){
		
		return "El largo del coche es " + largo;
		
	}
	
	
	public String dime_datos_generales(){
		
		return "La plataforma del vehiculos tiene " +ruedas+ " ruedas" +
		". Mide " + largo/1000 + " Metros con un ancho de " +ancho+ " cm y un peso "
				+ "de plataforma de " +peso_plataforma+ " kg";
		
	}
	
	public void set_color(String color_coche){
		
		color = color_coche;
		
	}
	
	public String get_color(){
		
		return "El color del coche es " + color;
		
	}
	
	public void set_asientos_cuero(String asientos_cuero){
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			
			this.asientos_cuero = true;
			
		}else{
			
			this.asientos_cuero = false;
		}
		
				
	}
	
	public String get_asientos_cuero(){
		
		if(asientos_cuero){
			
			return "El coche tiene asientos de cuero";
			
		}else{
			
			return "El coche no tiene asientos de cuero";
		}
		
	}
	
	public void set_climatizador(String climatizador){
		
		if(climatizador.equalsIgnoreCase("si")){
			
			this.climatizador = true;
			
		}else{
			
			this.climatizador = false;
			
		}
		
	}
	
	public String get_climatizador(){
		
		if(climatizador){
			
			return "El coche incorpora climatizador";			
			
		}else{
			
			return "El coche lleva aire acondicionado";
			
		}
		
	}
	
	public String dime_peso_coche(){ //Metodo set y get a la vez (no recomendable)
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero){
			
			peso_total = peso_total + 50;			
			
		}
		
		if(climatizador){
			
			peso_total = peso_total + 20;
			
		}
				
		return "El peso del coche es " + peso_total;
		
	}	
	
	public int precio_coche(){
		
		int precio_final = 10000;
		
		if(asientos_cuero){
			
			precio_final += 2000;
		}
		
		if(climatizador){
			
			precio_final += 1500;
			
		}		
		
		return precio_final;
	}
	
	

}
