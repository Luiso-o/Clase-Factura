package Factura;

import java.util.ArrayList;

public class Factura {
	
	private static int idFactura=1;
	private final int numeroFactura;
	private String nombreCliente;
	private String direccion;
	private int telefono;
	private ArrayList<Producto>lineas;
	
	public Factura(String nombreCliente, String direccion, int telefono) {
		
		this.numeroFactura = idFactura++;
		this.nombreCliente = nombreCliente;
		this.direccion = direccion;
		this.telefono = telefono;
		this.lineas=new ArrayList<Producto>();
		
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public ArrayList<Producto> getLineas() {
		return lineas;
	}
	
	//----------------------------------------------------->>
		
	public float calculaTotal() {
		
		double total=0;
		
		for(int i=0; i<lineas.size(); i++) {
			
			total+=lineas.get(i).getTotalProducto();
			
		}
		
		return (float) total;
	}
			
	@Override
	public String toString() {
		
		return "<<Factura # " + numeroFactura + ">> ,Cliente " + nombreCliente + 
				", direccion: "+ direccion + ", telefono " + telefono  + "\n\n" +
				lineas +"\n<<Total>>= " + calculaTotal() +" euros.\n";
		
	}
	
	


}
