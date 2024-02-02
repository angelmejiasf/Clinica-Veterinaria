package ClinicaVeterinaria;

public class Perro extends Animal {
	private boolean segobligatorio;
	private boolean chip;
	
	public Perro(int edad, int peso, String raza, String sexo, String nombre, boolean segobligatorio, boolean chip) {
		super(edad, peso, raza, sexo, nombre);
		this.segobligatorio = segobligatorio;
		this.chip = chip;
	}
	public Perro(int edad, int peso, String raza, String sexo, String nombre) {
		super(edad, peso, raza, sexo, nombre);
	}
	public boolean isSegobligatorio() {
		return segobligatorio;
	}
	
	public boolean tieneseguroobligatorio() {
		return segobligatorio;
	}
	public void setSegobligatorio(boolean segobligatorio) {
		this.segobligatorio = segobligatorio;
	}
	public boolean isChip() {
		return chip;
	}
	public void setChip(boolean chip) {
		this.chip = chip;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ "segobligatorio=" + segobligatorio + ", chip=" + chip + "";
	}
	
	public static void main(String[] args) {
	    Perro mascota1 = new Perro(3, 8, "caniche", "macho", "Cira", true, true);
	    System.out.println(mascota1);
	}

}
