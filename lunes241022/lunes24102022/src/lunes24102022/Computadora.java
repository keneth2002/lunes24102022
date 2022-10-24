package lunes24102022;

public class Computadora {
       //Campos / Atributos
	private String marca;
	private int vidaUtil;
	private double precio;
	private int cantidadRAM;
	private int espacioDisco;
	private double frecuenciaTrabajo;
	
	
	//Metodos / Comportamiento
	     //Setters - Modificar el valor de una variable
	
	public void ponerMarca(String marca){
		this.marca = marca;
	}
	public void ponervidaUtil(int vidaUtil) {
		this.vidaUtil = vidaUtil;
	}
	public void ponerPrecio(double precio) {
		this.precio = precio;
	}
	public void ponerCantidadRAM(int cantidadRAM) {
		this.cantidadRAM = cantidadRAM;
	}
	public void ponerEspacioDisco(int espacioDisco) {
		this.espacioDisco = espacioDisco;
	}
	public void ponerFrecuenciaTrabajo(double frecuenciaTrabajo) {
		this.frecuenciaTrabajo = frecuenciaTrabajo;
	}
	//Getters - Mostrar los valores de una variable
	public String mostrarMarca() {
		return this.marca;
	}
	public int mostrarVidaUtil() {
		return this.vidaUtil;
	}
	public double mostrarPrecio() {
		return this.precio;
		
	}
	public int mostrarCantidadRAM() {
		return this.cantidadRAM;
	}
	public int mostrarEspacioDisco() {
		return this.espacioDisco;
	}
	public double mostrarFrecuenciaTrabajo() {
		return this.frecuenciaTrabajo;
	}
}
