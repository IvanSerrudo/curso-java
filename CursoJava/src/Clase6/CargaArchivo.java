package Clase6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Modelo.Compra;
import Modelo.Item;
import Modelo.Producto;

public class CargaArchivo {

	public static void main(String[] args) {
		try {
			Compra compra = new Compra();
			int i = 0;
			for (String linea: Files.readAllLines(Paths.get("src\\Archivos\\items.txt"))) {
				
				String nombre = linea.split(";")[0];
				int cantidad = Integer.parseInt(linea.split(";")[1]);
				double precio = Double.parseDouble(linea.split(";")[2]);
				
				Producto prod = new Producto(nombre, precio);
				Item item = new Item(prod, cantidad);
				compra.getItems()[i]=item;
				i++;
				
				//System.out.println("total sin objetos: $"+cantidad*precio);
				System.out.println("total con objetos: $"+item.calcularTotal());
			}
			System.out.println("total de la compra: $"+String.valueOf(compra.calcularTotalCompraDouble()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
