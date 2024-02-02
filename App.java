package ClinicaVeterinaria;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Perro>perros=new ArrayList<>();
		ArrayList<Gato>gatos=new ArrayList<>();
		
		// Crear mascotas

		Perro mascota1 = new Perro(3, 8, "caniche", "macho", "Cira", true, true);
		perros.add(mascota1);
		
		// Crear cliente
		Cliente cliente1 = new Cliente("Angel", "03453789B", "Cebolla", "angel@mejias.com");
		cliente1.agregarPerro(mascota1);

		clientes.add(cliente1);

		int op;
		String nombre;
		String dni;
		String direccion;
		String email;

		String clientebuscar;
		// Mascotas
		String mascota;
		String nombremas;
		int edad;
		int peso;
		String raza;
		String sexo;
		
		// Perros
		boolean seguroobligatorio;
		boolean chip;
		
		//Gatos
		boolean obesidad;
		
		//Conejo
		int longorejas;
		
		

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Elije una opcion");
			System.out.println("1.Dar de alta a un cliente");
			System.out.println("2.Atender a un cliente");
			System.out.println("3.Dar de alta a una mascota");
			System.out.println("4.Mostrar numero de animales de cada tipo");
			System.out.println("5.Mostrar perros de toda la clinica");
			System.out.println("6.Mostrar gatos obesos");
			System.out.println("7.Buscar animal por raza");
			System.out.println("8.Salir");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Escribe el nombre: ");
				nombre = sc.next();
				System.out.println("Escribe el DNI: ");
				dni = sc.next();
				System.out.println("Escribe la direccion: ");
				direccion = sc.next();
				System.out.println("Escribe el email: ");
				email = sc.next();

				Cliente clientenew = new Cliente(nombre, dni, direccion, email);
				clientes.add(clientenew);
				System.out.println("Cliente añadido con exito.");

				break;

			case 2:
				System.out.println("Escribe el nombre del cliente: ");
				nombre = sc.next();
				boolean clienteEncontrado = false;

				// Buscar el cliente en la lista por nombre
				for (Cliente cliente : clientes) {
					if (cliente.getNombre().equalsIgnoreCase(nombre)) {
						System.out.println("Cliente encontrado:");
						System.out.println(cliente);
						clienteEncontrado = true;
						break;
					}
				}

				if (!clienteEncontrado) {
					System.out.println("No se encontró ningún cliente con el nombre proporcionado.");
				}
				break;

			case 3:

				System.out.println("¿Quieres añadir un perro, un conejo o un gato?");
				mascota = sc.next();

				if ("perro".equals(mascota)) {
					System.out.println("***DATOS DE EL PERRO***");
					System.out.println("Escribe el nombre: ");
					nombremas = sc.next();
					System.out.println("Introduce la edad: ");
					edad = sc.nextInt();
					System.out.println("Introduce el peso: ");
					peso = sc.nextInt();
					System.out.println("Escribe su raza: ");
					raza = sc.next();
					System.out.println("Escribe su sexo: ");
					sexo = sc.next();
					System.out.println("¿Tiene el seguro obligatorio?");
					String seguroInput = sc.next();
					seguroobligatorio = seguroInput.equalsIgnoreCase("si");
					System.out.println("¿Tiene chip?");
					String chipInput = sc.next();
					chip=chipInput.equalsIgnoreCase("si");
					
					Perro newperro=new Perro(edad,peso,raza,sexo,nombremas,seguroobligatorio,chip);

					
					System.out.println("¿A que cliente quieres asignarle este perro?");
					clientebuscar=sc.next();
					
					boolean clienteexiste = false;

					// Buscar el cliente en la lista por nombre
					for (Cliente cliente : clientes) {
						if (cliente.getNombre().equalsIgnoreCase(clientebuscar)) {
							cliente.agregarPerro(newperro);
							System.out.println("PERRO ASIGANDO CORRECTAMENTE AL CLIENTE");
							clienteexiste = true;
							break;
						}
					}
				}
				
				if("gato".equals(mascota)) {
					System.out.println("***DATOS DE EL GATO***");
					System.out.println("Escribe el nombre: ");
					nombremas = sc.next();
					System.out.println("Introduce la edad: ");
					edad = sc.nextInt();
					System.out.println("Introduce el peso: ");
					peso = sc.nextInt();
					System.out.println("Escribe su raza: ");
					raza = sc.next();
					System.out.println("Escribe su sexo: ");
					sexo = sc.next();
					System.out.println("¿Tiene sobrepeso?");
					obesidad=sc.nextBoolean();
					
					
					Gato newgato=new Gato(edad,peso,raza,sexo,nombremas,obesidad);
					
					System.out.println("¿A que cliente quieres asignarle este gato?");
					clientebuscar=sc.next();
					
					boolean clienteexiste = false;

					// Buscar el cliente en la lista por nombre
					for (Cliente cliente : clientes) {
						if (cliente.getNombre().equalsIgnoreCase(clientebuscar)) {
							cliente.agregarGato(newgato);
							System.out.println("GATO ASIGANDO CORRECTAMENTE AL CLIENTE");
							clienteexiste = true;
							break;
						}
					}
				}

				if("conejo".equals(mascota)) {
					System.out.println("***DATOS DE EL CONEJO***");
					System.out.println("Escribe el nombre: ");
					nombremas = sc.next();
					System.out.println("Introduce la edad: ");
					edad = sc.nextInt();
					System.out.println("Introduce el peso: ");
					peso = sc.nextInt();
					System.out.println("Escribe su raza: ");
					raza = sc.next();
					System.out.println("Escribe su sexo: ");
					sexo = sc.next();
					System.out.println("Introduce la longitud de las orejas: ");
					longorejas=sc.nextInt();
					
					Conejo newconejo=new Conejo(edad,peso,raza,sexo,nombremas,longorejas);
					
					System.out.println("¿A que cliente quieres asignarle este conejo?");
					clientebuscar=sc.next();
					
					boolean clienteexiste = false;

					// Buscar el cliente en la lista por nombre
					for (Cliente cliente : clientes) {
						if (cliente.getNombre().equalsIgnoreCase(clientebuscar)) {
							cliente.agregarConejo(newconejo);
							System.out.println("CONEJO ASIGANDO CORRECTAMENTE AL CLIENTE");
							clienteexiste = true;
							break;
						}
					}
					
				}
				break;
				
			case 4:
				
				System.out.println("Introduce el nombre del cliente: ");
				String nombrecliente=sc.next();
				
				boolean clienteexiste = false;
				
				for (Cliente cliente : clientes) {
					if (cliente.getNombre().equalsIgnoreCase(nombrecliente)) {
						int numperros=cliente.getPerros().size();
						int numgatos=cliente.getGatos().size();
						int numconejos=cliente.getConejos().size();
						
						System.out.println("Numero de perros: "+numperros);
						System.out.println("Numero de gatos: "+numgatos);
						System.out.println("Numero de conejos: "+numconejos);
						clienteexiste = true;
						break;
					}
				}
				break;
				
			case 5:
				for(Perro perro: perros) {
					System.out.println("Nombre "+perro.getNombre());
					System.out.println("¿Tiene seguro obligatorio? "+(perro.tieneseguroobligatorio() ? "Sí":"No"));
					
				}
				break;
				
				
				
			case 6:
				System.out.println("Gatos con obesidad:");
				for (Gato gato : gatos) {
				    if (gato.tieneObesidad()) {
				        System.out.println("Nombre del gato: " + gato.getNombre());
				        System.out.println("Obesidad: Sí");
				        System.out.println("--------------------------");
				    }
				}

				System.out.println("Gatos sin obesidad:");
				for (Gato gato : gatos) {
				    if (!gato.tieneObesidad()) {
				        System.out.println("Nombre del gato: " + gato.getNombre());
				        System.out.println("Obesidad: No");
				        System.out.println("--------------------------");
				    }
				}
				
				break;
				
			case 7:
			    System.out.println("Introduce la raza a buscar:");
			    String razaBuscar = sc.next();

			    boolean animalEncontrado = false;

			    // Buscar animales en todas las listas (perros, gatos, conejos)
			    for (Cliente cliente : clientes) {
			        for (Perro perro : cliente.getPerros()) {
			            if (perro.getRaza().equalsIgnoreCase(razaBuscar)) {
			                System.out.println("Perro encontrado:");
			                System.out.println("Nombre: " + perro.getNombre());
			                System.out.println("Raza: " + perro.getRaza());
			                System.out.println("--------------------------");
			                animalEncontrado = true;
			            }
			        }

			        for (Gato gato : cliente.getGatos()) {
			            if (gato.getRaza().equalsIgnoreCase(razaBuscar)) {
			                System.out.println("Gato encontrado:");
			                System.out.println("Nombre: " + gato.getNombre());
			                System.out.println("Raza: " + gato.getRaza());
			                System.out.println("--------------------------");
			                animalEncontrado = true;
			            }
			        }

			        for (Conejo conejo : cliente.getConejos()) {
			            if (conejo.getRaza().equalsIgnoreCase(razaBuscar)) {
			                System.out.println("Conejo encontrado:");
			                System.out.println("Nombre: " + conejo.getNombre());
			                System.out.println("Raza: " + conejo.getRaza());
			                System.out.println("--------------------------");
			                animalEncontrado = true;
			            }
			        }
			    }

			    if (!animalEncontrado) {
			        System.out.println("No se encontraron animales con la raza proporcionada.");
			    }
			    break;

			}

		} while (op != 8);
	}
}
