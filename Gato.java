package ClinicaVeterinaria;

public class Gato extends Animal{
	private boolean obesidad;

	public Gato(int edad, int peso, String raza, String sexo, String nombre, boolean obesidad) {
		super(edad, peso, raza, sexo, nombre);
		this.obesidad = obesidad;
	}

	
	public Gato(int edad, int peso, String raza, String sexo, String nombre) {
		super(edad, peso, raza, sexo, nombre);
	}


	public boolean isObesidad() {
		return obesidad;
	}
	
	public boolean tieneObesidad() {
        return obesidad;
    }

	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}


	@Override
	public String toString() {
		return super.toString()+ "obesidad=" + obesidad + "";
	}
	
	
	
}
