package Clase4;

import java.util.Scanner;

public class Ejercicio1C {

	public static void main(String[] argumentos) {
		if (argumentos.length > 2) {
			int numeros[] = new int[argumentos.length-1];
			for (int i = 0 ; i < numeros.length ; i++) {
				numeros [i] = Integer.parseInt(argumentos[i]);
			}
			int resultado[] = new int[numeros.length];
			String letra = argumentos[argumentos.length-1];
				if (Character.isLetter(letra.charAt(0))) {
					boolean ordenAsc = orden(letra);
					System.out.println(ordenAsc);
					resultado = ordenado(numeros, ordenAsc);
			        for (int y=0; y < resultado.length; y++) {
			        	System.out.println(resultado[y]);
			        }
				} else {
					System.out.println("El último argumento debe ser un caracter (a = ascendente, d = descendente)");
					System.out.println("El último argumento escrito fue: " + letra);
				}

		} else {
			Scanner scn = new Scanner(System.in);
			System.out.println("Ingrese números separados por UN espacio");
			String[] ingreso1 = scn.nextLine().split(" ");
			int numeros[] = asignarValores(ingreso1);
			System.out.println("Ingrese orden (a = ascendente, d descendente)");
			String ingreso2 = scn.nextLine();
			boolean ordenAsc = orden(ingreso2);
			int[] resultado = ordenado(numeros, ordenAsc);
			for (int y=0; y < numeros.length; y++) {
				System.out.println(resultado[y]);
			}
			scn.close();
		}
		
	}
	private static boolean orden(String letra) {
		boolean ordenAsc;
		if (letra.equals("a")) {
			ordenAsc = true;
		} else {
			ordenAsc = false;
        }
		return ordenAsc;
	}
	
	private static int[] asignarValores(String[] vector){
		int respuesta[] = new int [vector.length];
		for (int i = 0 ; i < vector.length ; i++) {
			respuesta[i] = Integer.parseInt(vector[i]);
		}
		return respuesta;
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