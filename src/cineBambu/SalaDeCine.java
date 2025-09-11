package cineBambu;

public class SalaDeCine {
	//Ana
	//código/nombre, capacidad (entera), pelicula proyectada, butacas (array de Usuario del tamaño de la capacidad; null indica asiento libre).
	
	private int numSala;
	private Pelicula pelicula;
	private Usuario[][] butacas;
	private int capacidad;
	
	//Genero un constructor con todos los atributos para que las peliculas no se generen con un campo por defecto
	public SalaDeCine(int numSala, Pelicula pelicula, Usuario[][] butacas) {
		
		this.numSala = numSala;
		this.pelicula = pelicula;
		this.butacas = butacas;
		this.capacidad = butacas.length*butacas[0].length;
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
	public Usuario[][] getButacas() {
		return butacas;
	}
	
	public void asientosLibres() {
		int contador = 0;
		for (int i = 0; i < butacas.length; i++) { // Recorre filas
			
		    for (int j = 0; j < butacas[i].length; j++) { // Recorre columna
		    	if(j==0) {
		    		System.out.print(i);
		    	}
		        if (butacas[i][j]==null) {
		        	contador++;
		        	System.out.print("X ");
		        } else {
		        	System.out.println(j);
		        }
		    }
		    System.out.println("Dispones de "+contador+" asientos libres");
		}

		
	}
	
	
	

}
