package ClinicaVeterinaria;

public class Conejo extends Animal {
	private int longorejas;

	public Conejo(int edad, int peso, String raza, String sexo, String nombre, int longorejas) {
		super(edad, peso, raza, sexo, nombre);
		this.longorejas = longorejas;
	}

	public int getLongorejas() {
		return longorejas;
	}

	public void setLongorejas(int longorejas) {
		this.longorejas = longorejas;
	}

	@Override
	public String toString() {
		return super.toString()+ "longorejas=" + longorejas + "";
	}
	
	
}
