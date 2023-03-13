package Clase4;

public class Ejercicio1A {

	public static void main(String[] argumentos) {
		
		int vector[] = new int[argumentos.length-1];
		boolean ordenAsc = true;
		char letra = argumentos[argumentos.length-1].charAt(0);
		int resultado[] = new int[vector.length];
		if (vector.length > 1) {
			if (Character.isLetter(letra)) {
				if (letra == 'a') {
					ordenAsc = true;
				} else {
					ordenAsc = false;
		        }
				for (int i = 0 ; i < vector.length ; i++) {
					vector [i] = Integer.parseInt(argumentos[i]);
				}
				resultado = ordenado(vector, ordenAsc);
		        
		        
		        for (int y=0; y < vector.length; y++) {
		        	System.out.println(resultado[y]);
		        }
				
			} else {
				System.out.println("El último argumento debe ser un caracter (a = ascendente, d = descendente)");
				System.out.println("El último argumento escrito fue: " + letra);
			}
			
		} else {
			System.out.println("Los argumentos deben ser al menos dos números y un caracter (a = ascendente, d = descendente)");
		}
		
	}
	
	private static int[] ordenado(int[] vector, boolean orden) {
        int valor = 0;
		for (int i = 0; i < vector.length; i++) {
        	for (int x = i; x < vector.length; x++) {
	        	if (orden == true) {
	        		if (vector[x] <= vector[i]) {
	        			valor = vector[i];
	        			vector[i] = vector[x];
	        			vector[x] = valor;
	        		}
	        	} else {
	        		if (vector[x] >= vector[i]) {
	        			valor = vector[i];
	        			vector[i] = vector[x];
	        			vector[x] = valor;
	        		} 
	        	}
        	}
        }
		return vector;
	}

}
