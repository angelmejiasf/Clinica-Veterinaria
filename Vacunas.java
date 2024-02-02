package ClinicaVeterinaria;

public class Vacunas extends Animal {
	private String nombre;
	private int fecha;
	private String laboratorio;
	private int precio;
	public Vacunas(int edad, int peso, String raza, String sexo, String nombre, String nombre2, int fecha,
			String laboratorio, int precio) {
		super(edad, peso, raza, sexo, nombre);
		nombre = nombre2;
		this.fecha = fecha;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vacunas [nombre=" + nombre + ", fecha=" + fecha + ", laboratorio=" + laboratorio + ", precio=" + precio
				+ "]";
	}
	
	
}
