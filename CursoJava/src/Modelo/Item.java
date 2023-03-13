package Modelo;

public class Item {

	private Producto producto;
	private int cantidad;
	
	public Item() {
		
	}
	
	// Source > Generate Constructor using Fields
	public Item(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	// Source > Generate Getters and Setters
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String calcularTotal() {
		return String.valueOf(this.calcularTotalDouble());
	}
	
	public double calcularTotalDouble() {
		double total = this.getCantidad() * this.getProducto().getPrecio();
		if (this.getCantidad()>2) {
			//aplicar descuento si se cumple esa condición
			total = total-(total*30/100);
		}
		return total;
	}
	
	
	
}
