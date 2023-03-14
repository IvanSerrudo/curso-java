package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int sumatoria = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese la dirección de un archivo:");
		String url = scn.nextLine();
		Path archivo = Paths.get(url);
		if (url.length() < 1) {
			archivo = Paths.get("src\\Archivos\\numeros.txt");
		}
		System.out.println("Desea sumar (s) o multiplicar (m) los números?");
		String accion = scn.nextLine();
		scn.close();
		try {
			if (accion.equals("s")) {
				for (String numeros: Files.readAllLines(archivo)) {
					sumatoria += Integer.parseInt(numeros);
				}
				System.out.println("La suma de los numeros del archivo es: "+sumatoria);
			} else {
				sumatoria = 1;
				for (String numeros: Files.readAllLines(archivo)) {
					sumatoria = sumatoria * Integer.parseInt(numeros);
				}
				System.out.println("El producto de los numeros del archivo es: "+sumatoria);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
