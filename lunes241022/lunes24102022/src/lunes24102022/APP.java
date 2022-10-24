package lunes24102022;

public class APP {

	public static void main(String[] args) {
	  Computadora pc1 = new Computadora();
	  
      pc1.ponerMarca("Dell");  
	  pc1.ponerCantidadRAM(8);
	  pc1.ponerEspacioDisco(1024);
	  pc1.ponerFrecuenciaTrabajo(3.5);
	  pc1.ponerPrecio(500.00);
	  pc1.ponervidaUtil(5);
	  
	  Computadora pc2 = new Computadora();
	 pc2.ponerCantidadRAM(12);
	pc2.ponerEspacioDisco(2048);
	pc2.ponerFrecuenciaTrabajo(3.9);
	pc2.ponerMarca("Asus");
	pc2.ponerPrecio(980.00);
	pc2.ponervidaUtil(4);
	
	Computadora pc3 = new Computadora();
	pc3.ponerCantidadRAM(512);
	pc3.ponerEspacioDisco(0);
	pc3.ponerFrecuenciaTrabajo(0);
	pc3.ponerMarca("Lenovo");
	pc3.ponerPrecio(0);
	pc3.ponervidaUtil(0);
	
	System.out.println("Marca de la pc1 = "  + pc1.mostrarMarca());
	System.out.println("Precio pc1 = " +  pc1.mostrarPrecio());
	System.out.println("Marca de la pc2 = "  + pc2.mostrarMarca());
	System.out.println("Precio pc2 = " +  pc2.mostrarPrecio());
	System.out.println("Marca de la pc3 = "  + pc3.mostrarMarca());
	System.out.println("Precio pc3 = " +  pc3.mostrarPrecio());
	}

}
