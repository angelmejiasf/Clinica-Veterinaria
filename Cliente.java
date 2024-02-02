package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.List;

public class Cliente  {
	
	private String nombre;
	private String DNI;
	private String direccion;
	private String email;
	private List<Perro> perros;
	private List<Gato> gatos;
	private List<Conejo> conejos;
	
	
	
	public Cliente(String nombre, String dNI, String direccion, String email) {
        super();
        this.nombre = nombre;
        DNI = dNI;
        this.direccion = direccion;
        this.email = email;
        this.perros = new ArrayList<>(); // Inicializar con ArrayList
        this.gatos = new ArrayList<>();  // Inicializar con ArrayList
        this.conejos = new ArrayList<>();  // Inicializar con ArrayList
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Perro> getPerros() {
		return perros;
	}
	public void setPerros(List<Perro> perros) {
		this.perros = perros;
	}
	public List<Gato> getGatos() {
		return gatos;
	}
	public void setGatos(List<Gato> gatos) {
		this.gatos = gatos;
	}
	public List<Conejo> getConejos() {
		return conejos;
	}
	public void setConejos(List<Conejo> conejos) {
		this.conejos = conejos;
	}
	
	
	 public void agregarPerro(Perro perro) {
	        perros.add(perro);
	    }
	 
	 public void agregarGato(Gato gato) {
	        gatos.add(gato);
	    }
	 
	 public void agregarConejo(Conejo conejo) {
	        conejos.add(conejo);
	    }
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", email=" + email
				+ ", perros=" + perros + ", gatos=" + gatos + ", conejos=" + conejos + "]";
	}
	
	
}
