package Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		String texto = "";
		int desplazamiento = 0;
		Path entrada = Paths.get("src\\Archivos\\Clase4Entrada.txt");
		Path salida = Paths.get("src\\Archivos\\Clase4Salida.txt");
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingrese si desea codificar (c) o decodificar (d) un texto:");
		String opcion = scn.nextLine();
		System.out.println("Ingrese la cantidad de desplazamientos que tendrá su codificación:");
		String despl = scn.nextLine();
		
		System.out.println("Ingrese la ruta del archivo de entrada (solo una linea):");
		String url1 = scn.nextLine();
		if (url1.length() > 1) {
			entrada = Paths.get(url1);
		}
		System.out.println("Ingrese la ruta del archivo de salida:");
		String url2 = scn.nextLine();
		if (url2.length() > 1) {
			salida = Paths.get(url2);
		}
		scn.close();
		
		for (String lineas: Files.readAllLines(entrada)) {
			texto = lineas;
		}
		
		try {
			desplazamiento = Integer.parseInt(despl);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		if (opcion.equals("c")) {
			String textoCodificado = codificar(texto, desplazamiento);
			Files.writeString(salida, textoCodificado);
		} else if (opcion.equals("d")) {
			String textoDecodificado = decodificar(texto, desplazamiento);
			Files.writeString(salida, textoDecodificado);
		}
		
		
	}
    
    private static String codificar(String texto, int desplazamiento) {
    	
    	String abc = "abcdefghijklmnñopqrstuvwxyz ";
    	
		String resultado = "";
		
		for (int i = 0; i < texto.length();i++) {
			char caracter = texto.charAt(i);
			
			for (int x = 0; x < abc.length(); x++) {
				if (abc.charAt(x) == caracter) {
					resultado += abc.charAt((x + desplazamiento)% abc.length());
				}
			}
		}
		return resultado;
    }
    
    private static String decodificar(String texto, int desplazamiento) {
        return codificar(texto, 28 - desplazamiento);
    }

}
