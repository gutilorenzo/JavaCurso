
public class Arrays_Bidireccionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[4] [5];
		
		for(int i = 0; i < 4; i++){
			
			for(int j = 0; j < 5; j++){
				
				matrix[i][j] = (int)Math.round(Math.random() * 100);
			}			
		}
		//Recorrerlo con FOR
		/*for(int i = 0; i < 4; i++){
			
			System.out.println();
			
			for(int j = 0; j < 5; j++){
				
				System.out.print(matrix[i][j] + " ");
			}		*/	
			
			//Recorrerlo con FOR EACH
		for(int[]fila:matrix){
			
			System.out.println();
			
			for(int z: fila){
				
				System.out.print(z + " ");
				
			}
			
		}

	}

}
