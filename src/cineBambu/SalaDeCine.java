package cineBambu;

public class SalaDeCine {
	//Ana
	//código/nombre, capacidad (entera), pelicula proyectada, butacas (array de Usuario del tamaño de la capacidad; null indica asiento libre).
	
	private int numSala;
	private int capacidad;
	private Pelicula pelicula;
	private int[][] butacas;
	
	//Genero un constructor con todos los atributos para que las peliculas no se generen con un campo por defecto
	public SalaDeCine(int numSala, int capacidad, Pelicula pelicula, int[][] butacas) {
		
		this.numSala = numSala;
		this.capacidad = capacidad;
		this.pelicula = pelicula;
		this.butacas = butacas;
	}
	//No creamos set para que no se puedan modificar los atributos de la pelicula
	public int getNumSala() {
		return numSala;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public int[][] getButacas() {
		return butacas;
	}
	
	
	

}
