package cineBambu;

import java.util.Scanner;

//nombre, salas (array de SalaDeCine).
public class Cine {
	
	private String nombre;
	private SalaDeCine[] salas;
	
	//constructor
	public Cine(String nombre, SalaDeCine[] salas)
	{
		this.nombre=nombre;
		this.salas=new SalaDeCine [5];
	}

	public String getNombre() {
		return nombre;
	}


	public SalaDeCine[] getSalas() {
		return salas;
	}

	
	  
	// 1. Listar películas y disponibilidad
	public void listarSalas() {
		System.out.println("---- Listado de Salas ----");
		for (SalaDeCine sala : salas) {
			//recoger en una variable los asientos libres 
			int libres = sala.asientosLibres();
			
			//calculo las plazas ocupadas 
			int ocupados = sala.getCapacidad() - libres;

			System.out.println("Sala #" + sala.getNumSala());
			System.out.println("Película: " + sala.getPelicula().getTitulo());
			System.out.println("Asientos ocupados: " + ocupados);
			System.out.println("Asientos libres: " + libres);
			System.out.println("------------------------------");
		}
	}
	
	/*

	// 2. Obtener salas con al menos 'cantidad' asientos libres (sin ArrayList)
	public SalaDeCine[] getSalasConEspacio(int cantidad) {
		// Primero, contar cuántas salas cumplen la condición
		int contador = 0;
		for (int i = 0; i < salas.length; i++) {
			if (salas[i].asientosLibres     (cantidad)) {
				contador++;
			}
		}

		// Crear un array con el tamaño justo
		SalaDeCine[] disponibles = new SalaDeCine[contador];
		int indice = 0;
		for (int i = 0; i < salas.length; i++) {
			if (salas[i].hayEspacio(cantidad)) {
				disponibles[indice] = salas[i];
				indice++;
			}
		}

		return disponibles;
	}

	// 3. Mostrar ocupación por sala
	public void mostrarOcupacionSalas() {
		System.out.println("---- Mapa de ocupación por sala ----");
		for (int i = 0; i < salas.length; i++) {
			salas[i].mostrarMapaButacas();
			System.out.println();
		}
	}

	// 4. Obtener una sala por número (útil para seleccionar sala)
	public SalaDeCine getSalaPorNumero(int numSala) {
		for (int i = 0; i < salas.length; i++) {
			if (salas[i].getNumSala() == numSala) {
				return salas[i];
			}
		}
		return null; // Sala no encontrada
	}
	*/
}