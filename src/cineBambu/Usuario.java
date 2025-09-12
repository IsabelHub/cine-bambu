package cineBambu;

//nombre y/o DNI/ID. (Puedes añadir edad/saldo si lo ves útil, pero no es obligatorio.)
public class Usuario {
	//Isabel
	private String nombre;
	private String dni;
	
	 // Nueva propiedad para la sala seleccionada
    private SalaDeCine salaSeleccionada;
    
 // número total de entradas compradas para esa sala/película
    private int entradasCompradas;
    
	//constructor:
	public Usuario(String nombre, String dni) {
		// TODO Auto-generated constructor stub

		this.nombre = nombre;
		this.dni = dni;

	}

	public String getNombre() {
		return nombre;
	}

	
	public String getDni() {
		return dni;
	}

	
	 // Nuevos métodos para sala seleccionada
    public void setSalaSeleccionada(SalaDeCine sala) {
        this.salaSeleccionada = sala;
    }

    public SalaDeCine getSalaSeleccionada() {
        return salaSeleccionada;
    }

    // Métodos para controlar entradas
    public void agregarEntradas(int cantidad) {
        entradasCompradas += cantidad;
    }

    public int getEntradasCompradas() {
        return entradasCompradas;
    }

}
