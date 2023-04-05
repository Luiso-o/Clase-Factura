package Factura;

public class Producto {
	
	private static int contadorLinea=1;
	private final int numeroLinea;
	private String nombreArticulo;
	private String descripcion;
	private int cantidad;
	private float precio;
	private float totalProducto;
	
	public Producto(String nombreArticulo, String descripcion, int cantidad, float precio) {
		
		this.numeroLinea = contadorLinea++;
		this.nombreArticulo = nombreArticulo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.totalProducto=cantidad*precio;
		
	}

	public static int getContadorLinea() {
		return contadorLinea;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public int getNumeroLinea() {
		return numeroLinea;
	}

	public double getTotalProducto() {
		return totalProducto;
	}
	
	@Override
	public String toString() {
		return numeroLinea + "-" + nombreArticulo + " = "
				+ descripcion + ", unidades = " + cantidad + 
				", precio unidad= " + precio + ", precio total= " + totalProducto+"\n";
	}
	
}
