package Factura;

public class App_Menu {

	public static void main(String[] args) {
		
		Factura factura1=new Factura("Mario","Paralel 82",657897654);
	
		factura1.getLineas().add(new Producto("Dove", "Jabon para ducha", 1 , 1.1f));
		factura1.getLineas().add(new Producto("Bananas", "Frutas", 8 , 1.5f));
		factura1.getLineas().add(new Producto("Azul", "Azul", 1 , 1.8f));
		factura1.getLineas().add(new Producto("Milka", "Chocolate", 2 , 2.3f));
		factura1.getLineas().add(new Producto("Dove", "Jabon para ducha", 1 , 1.1f));
		factura1.getLineas().add(new Producto("Redondo", "Arroz 1k", 1 , 1.2f));	
	
		System.out.println(factura1);
		 

	}

}
