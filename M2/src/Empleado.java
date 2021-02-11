
public class Empleado {
	//Atributos
	protected String nombre;
	protected int sueldo;
	protected String categoria;
	protected double reduccion;
	
	//Constructores
	public Empleado(String nombre, int sueldo, String categoria, double reduccion) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.categoria = categoria;
		this.reduccion = reduccion;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", categoria=" + categoria + "]";
	}
	
}
