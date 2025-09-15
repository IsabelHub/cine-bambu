package cineBambu;

import java.util.Scanner;

public class CineBambu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TOTAL_USUARIOS = 1;
		Pelicula pelicula1 = new Pelicula("La princesa Mononoke", 90, 14, 5, 1);
		Pelicula pelicula2 = new Pelicula("El viaje de Chihiro", 100, 14, 5, 2);
		Pelicula pelicula3 = new Pelicula("Amelie", 120, 18, 5, 3);
		
		Usuario[][] butacas = new Usuario[8][10];
		
		SalaDeCine sala1 = new SalaDeCine(1,pelicula1 , butacas);
		SalaDeCine sala2 = new SalaDeCine(2,pelicula2 , butacas);
		SalaDeCine sala3 = new SalaDeCine(3,pelicula3 , butacas);
		
		SalaDeCine[] salas = {sala1, sala2, sala3};
		
		Cine cine = new Cine("Bambu",salas);

		for (int i = 0; i < TOTAL_USUARIOS; i++) {

			System.out.println("----- Turno del Usuario " + i + " -----");

			
			System.out.print("Ingrese su nombre: ");
			String nombreUsuario = sc.nextLine();
			System.out.print("Ingrese su DNI: ");
			String dniUsuario = sc.nextLine();
			Usuario usuario= new Usuario (nombreUsuario, dniUsuario);
			int opcion;

			do {
				 System.out.println("\nHola, " + nombreUsuario + ". ¿Qué desea hacer?");
				System.out.println("\nElige una opción:");
				System.out.println("1. Peliculas disponibles:");
				System.out.println("2. Comprar entradas: ");
				System.out.println("3. Butacas disponibles por Sala: ");
				System.out.println("4. Salir");
				System.out.print("\nOpción: \n");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:

					cine.listarSalas();
					break;
				case 2:
					cine.elegirPelicula(usuario);
					break;
				case 3:
					cine.mostrarOcupacionSalas();
					break;
				case 4:
					System.out.println("Adiós "+usuario.getNombre());
					break;
					
				
				default:
					System.out.println("Opción incorrecta, inténtalo de nuevo.");
				}

			} while (opcion != 4);
			

		}
		sc.close();
		
	}
}
	
	

