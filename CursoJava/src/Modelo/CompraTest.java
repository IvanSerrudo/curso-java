package Modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompraTest {
	private Compra objCompraTest;
	
	@BeforeEach
	public void setUp() {
		objCompraTest = new Compra();
	}
	
	@Test
	void testCalcularTotalCompra() {
		Item it = new Item();
		it.setCantidad(3);
		it.setProducto(new Producto("Cepillo", 10));
		objCompraTest.getItems()[0]=it;
		Item it2 = new Item();
		it2.setCantidad(2);
		it2.setProducto(new Producto("Pasta", 100));
		objCompraTest.getItems()[1]=it2;
		double expectedResult=221.0;
		boolean result = objCompraTest.calcularTotalCompraDouble()==expectedResult;
		System.out.println(result);
		assertTrue(result);
	}

}
