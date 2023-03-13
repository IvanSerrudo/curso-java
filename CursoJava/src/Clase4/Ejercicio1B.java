package Clase4;

import java.util.Scanner;

public class Ejercicio1B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean ordenAsc = true;
		System.out.println("Ingrese números separados por UN espacio");
		String[] ingreso1 = scn.nextLine().split(" ");
		int numeros[] = new int [ingreso1.length];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(ingreso1[i]);
		}
		System.out.println("Ingrese orden (a = ascendente, d descendente)");
		String ingreso2 = scn.nextLine();
		if (ingreso2.equals("a")) {
			ordenAsc = true;
		} else if (ingreso2.equals("d")) {
			ordenAsc = false;
		}
		int[] resultado = ordenado(numeros, ordenAsc);
		for (int y=0; y < numeros.length; y++) {
			System.out.println(resultado[y]);
		}
		scn.close();
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