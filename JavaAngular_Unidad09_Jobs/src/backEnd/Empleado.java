/**
 * 
 */
package backEnd;

/**
 * @author 	Cesar Torrelles
 * 			Ingrid DOminguez
 * 			Vyacheslav Khaydorov
 *
 * Superclase empleado.
 */
public class Empleado {

	//Constantes
	protected final String CATEGORIA_MANAGER = "MANAGER";
	protected final String CATEGORIA_BOSS = "BOSS";
	protected final String CATEGORIA_EMPLOYEE = "EMPLOYEE";
	protected final String CATEGORIA_VOLUNTEER = "VOLUNTEER";
	protected final String CATEGORIA_DEFAULT = CATEGORIA_VOLUNTEER;	//Categoria por defecto
	protected final double AJUSTE_SUELDO_MANAGER = 10 / 100;
	protected final double AJUSTE_SUELDO_BOSS = 50 / 100;
	protected final double AJUSTE_SUELDO_EMPLOYEE = -(15 / 100);
	protected final double AJUSTE_SUELDO_VOLUNTEER = 0;	//IMPORTANTE: los voluntarios no cobran!
	protected final int SUELDO_BOSS_MIN = 8000;
	protected final int SUELDO_MANAGER_MAX = 5000;
	protected final int SUELDO_MANAGER_MIN = 3000;
	protected final int SUELDO_VOLUNTEER = 0;
	
	
	//Atributos
	protected int ID;
	protected String nombre;
	protected double sueldo;
	protected String categoria;
	
	
	//Constructores
	public Empleado(int ID, String nombre, double sueldo, String categoria) {
		this.ID = ID;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.categoria = categoria;
		
		//Llamada al método de control de categoria
		this.categoria = categoriaCorrecta(this.categoria);
		
		//Llamada al método de ajuste de sueldo
		this.sueldo = sueldoAjustadoPorCategoria(this.sueldo, this.categoria);
	}
	
	
	//Getters y setters
	public int getID() {
		return ID;
	}



	public void setID(int ID) {
		this.ID = ID;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	//METODOS
	//Metodo toString()
	public String toString() {
		return "ID: " + this.ID + " | Nombre: " + this.nombre + " | Sueldo: " + this.sueldo
				+ " | Categoria: " + this.categoria;
	}
	
	
	//Método para ajustar el sueldo según la categoria
	public double sueldoAjustadoPorCategoria (double sueldo, String categoria) {
		
		switch (categoria) {
		case "MANAGER":
			sueldo += sueldo * AJUSTE_SUELDO_MANAGER;
			break;
		case "BOSS":
			sueldo += sueldo * AJUSTE_SUELDO_BOSS;
			break;
		case "EMPLOYEE":
			sueldo += sueldo * AJUSTE_SUELDO_EMPLOYEE;
			break;
		case "VOLUNTEER":
			sueldo = AJUSTE_SUELDO_VOLUNTEER;	//IMPORTANTE: los voluntarios no cobran!
			break;
		default:
			categoria = CATEGORIA_DEFAULT;
		}	
		
		return sueldo;
		
	}
	
	
	//Método de control sobre el rango de sueldos
	public boolean controlRangoSueldo (double sueldo, String categoria) {
		//Variables
		boolean sueldoCorrecto = false;
		
		//Comprobamos los sueldos por categorias
		switch (categoria) {
		case "MANAGER":
			if (sueldo > SUELDO_MANAGER_MIN && sueldo < SUELDO_MANAGER_MAX)
				sueldoCorrecto = true;
		case "BOSS":
			if (sueldo > SUELDO_BOSS_MIN)
				sueldoCorrecto = true;
		}
		
		return sueldoCorrecto;
		
	}
	
	
	/*
	 * @param: this.categoria
	 */
	//Metodo de control de categoria
	public String categoriaCorrecta (String categoria) {
		
		switch (categoria.toUpperCase()) {
			case "MANAGER":
				break;
			case "BOSS":
				break;
			case "EMPLOYEE":
				break;
			case "VOLUNTEER":
				break;
			default:
				categoria = CATEGORIA_DEFAULT;
		}
		
		return categoria.toUpperCase();
		
	}
	
	
}
