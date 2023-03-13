package Clase4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileTime;

public class Test {

	public static void main(String[] args) throws IOException {
		
		//String arch = "D:\\Desktop\\test.txt";
		/*for (String linea: Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea);
		}
		Files.writeString(Paths.get(archivo), "hola /n que tal /n");
		*/
		/*Path archivo = Paths.get(arch);
		Path unArchivo = Paths.get("..");
		System.out.println(unArchivo.toAbsolutePath());
		FileTime Modificado = Files.getLastModifiedTime(archivo);
		System.out.println(Files.exists(Modificado));
		Path otroArchivo = Paths.get("D:\\Desktop\\test2.txt");
		System.out.println(Files.exists(otroArchivo));
		Files.createFile(otroArchivo);
		System.out.println(Files.exists(otroArchivo));*/
		
		/*Path unTemporal = Files.createTempFile("Prefijo",".txt");
		System.out.println(unTemporal);*/
		
		/*Path utfFile = Files.createTempFile("JavaTest", ".txt");
		Files.write(utfFile, "un texto \ncon aña ".getBytes());
		Files.write(utfFile, (System.lineSeparator() +"y acentos á ").getBytes(),StandardOpenOption.APPEND);
		System.out.println(Files.readAllLines(utfFile) .size()); // Cantidad de lineas del archivo
		for (String line: Files.readAllLines(utfFile) ) {
			System.out.println(line);
		}
		Path iso88591File = Files.createTempFile("some", ".txt");
		Files.write(iso88591File, "otro texto con eñes y acentos á".getBytes(StandardCharsets.ISO_8859_1));*/
		
		
		
	}

}
