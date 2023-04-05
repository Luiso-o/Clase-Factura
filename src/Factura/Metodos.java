package Factura;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

	public static void crearFactura(ArrayList<Factura>nueva) {
		
		nueva.add(new Factura(pideString("Nombre del cliente"),
				pideString("direccion"),pideInt("numero de telefono")));
		
	}
	
	public static void crearLinea(Factura miFactura) {
		
		miFactura.getLineas().add(new Producto(pideString("nombre del articulo"),
				pideString("descripcion"), pideInt("cantidad"),pideFloat("precio")));
		
	}

	public static int pideInt(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextInt();
}
	
	public static float pideFloat(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextFloat();
}
	
	public static String pideString(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextLine();
}
	
	
}
