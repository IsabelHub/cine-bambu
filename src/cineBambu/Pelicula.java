package cineBambu;

public class Pelicula {
	//Ana
	//título, duración (min), clasificación por edad (opcional), precio (opcional), id/código.
	private String titulo;
	private int duracion;
	private int edad;
	private int precio;
	private int id;
	
	//Genero un constructor con todos los atributos para que las peliculas no se generen con un campo por defecto
	public Pelicula(String titulo, int duracion, int edad, int precio, int id) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edad = edad;
		this.precio = precio;
		this.id = id;
	}
	//No creamos set para que no se puedan modificar los atributos de la pelicula
	public String getTitulo() {
		return titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public int getEdad() {
		return edad;
	}
	public int getPrecio() {
		return precio;
	}
	public int getId() {
		return id;
	}
	
	
}
