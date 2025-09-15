package cineBambu;

import java.util.Scanner;
//Isa

//nombre, salas (array de SalaDeCine).
public class Cine {

	private String nombre;
	private SalaDeCine[] salas;

	// constructor
	public Cine(String nombre, SalaDeCine[] salas) {
		this.nombre = nombre;
		this.salas = salas;
	}

	public String getNombre() {
		return nombre;
	}

	public SalaDeCine[] getSalas() {
		return salas;
	}

	// 1. Listar películas y disponibilidad

	public void  listarSalas() {	
			System.out.println("---- Listado de Peliculas ----");
			for (SalaDeCine sala : salas) {
				if(sala == null)
				{
					continue;
				}
				if (sala != null) {
			        System.out.println("Sala #" + sala.getNumSala());
			        System.out.println(sala.getPelicula().getId() + " Película: " + sala.getPelicula().getTitulo());
			        System.out.println("------------------------------");
			    }		
		}
	}

	// 2. Listar películas y disponibilidad
	public void elegirPelicula(Usuario usuario) {
		System.out.println("¿Para que pelicula quieres entradas? Inserta número: ");
		Scanner sc = new Scanner(System.in);
		int numPelicula = sc.nextInt();
		
		for (int i = 0; i < salas.length; i++) {
			if (salas[i] != null &&numPelicula == salas[i].getPelicula().getId()&&salas[i].asientosLibres() > 0) {
				System.out.println("Has elegido la pelicula numero " + salas[i].getPelicula().getId() + " con titulo "
						+ salas[i].getPelicula().getTitulo());
				salas[i].asignarButacas(usuario);

			}
		}

	}

	// 3. Mostrar ocupación por sala
	public void mostrarOcupacionSalas() {
		System.out.println("---- Mapa de ocupación por sala ----");
		for (int i = 0; i < salas.length; i++) {
			
			salas[i].asientosLibres();
			System.out.println();
		}
	}

	/*
	 * // 4. Obtener una sala por número (útil para seleccionar sala) public
	 * SalaDeCine numeroSala(int numSala) { for (int i = 0; i < salas.length; i++) {
	 * if (salas[i].getNumSala() == numSala) { return salas[i]; } } return null; //
	 * Sala no encontrada }
	 */
}