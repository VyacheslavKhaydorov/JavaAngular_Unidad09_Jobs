/**
 * 
 */
package backEnd;

/**
 * @author Cesar Torrelles Ingrid DOminguez Vyacheslav Khaydorov
 *
 *         Superclase empleado.
 */
public class Empleado {

	// Constantes

	// estas constantes definen la categoria del empleado
	protected final String CATEGORIA_MANAGER = "MANAGER";
	protected final String CATEGORIA_BOSS = "BOSS";
	protected final String CATEGORIA_EMPLOYEE = "EMPLOYEE";
	protected final String CATEGORIA_VOLUNTEER = "VOLUNTEER";

	// Luego tenemos una categoria por defecto
	protected final String CATEGORIA_DEFAULT = CATEGORIA_VOLUNTEER; // Categoria por defecto

	// en estas constantes definimos los porcentajes de incremento/reduccion
	// salarial por categorias
	protected final double AJUSTE_SUELDO_MANAGER = 0.10;
	protected final double AJUSTE_SUELDO_BOSS = 0.50;
	protected final double AJUSTE_SUELDO_EMPLOYEE = -(0.15);
	protected final double AJUSTE_SUELDO_VOLUNTEER = 0;
	
	// en estas constantes definimos los porcentajes de IRPF
		// salarial por categorias
	protected final double IRPF_MANAGER = 0.26;
	protected final double IRPF_BOSS = 0.32;
	protected final double IRPF_SENIOR = 0.24;
	protected final double IRPF_MID = 0.15;
	protected final double IRPF_JUNIOR = 0.02;

	// aqui definimos los valores salariales minimos y maximos entre las categorias
	// boss, manager y volunteer
	protected final int SUELDO_BOSS_MIN = 8000;
	protected final int SUELDO_MANAGER_MAX = 5000;
	protected final int SUELDO_MANAGER_MIN = 3000;
	protected final int SUELDO_VOLUNTEER = 0;
	
	//double sueldoNeto;

	// Atributos de la clase Empleado: ID, nombre, sueldo y categoria
	protected int ID;
	protected String nombre;
	protected double sueldo;
	protected String categoria;
	protected double sueldoNeto;

	// Constructores de la clase empleado
	public Empleado(int ID, String nombre, double sueldo, String categoria) {
		this.ID = ID;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.categoria = categoria;
		this.sueldoNeto = sueldo;

		// A continuacion hacemos una llamada al metodo de control de categoria
		this.categoria = categoriaCorrecta(this.categoria);

		// y posteriormente hacemos una llamada al metodo de ajuste de sueldo por
		// categoria
		this.sueldo = sueldoAjustadoPorCategoria(this.sueldo, this.categoria);

		// de esta manera al crear una clase empleado nos aseguraremos de que la
		// categoria estara bien introducida
		// y que los sueldos cumplen con las condiciones de categoria
	}

	// Getters y setters
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
	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	} 
	// METODOS:

	// Metodo de control de categoria
	// con este metodo controlamos que la categoria que se asigna a cada objeto
	// empleado, coincide con los atributos
	public String categoriaCorrecta(String categoria) {

		// usamos un switch, y un metodo .toUpperCase para evitar errores
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
			
			//en caso de que ninguna coincida se asiga la categoria por defecto
			categoria = CATEGORIA_DEFAULT;
		}

		return categoria.toUpperCase();

	}

	// Metodo para ajustar el sueldo segun la categoria:
	public  double sueldoAjustadoPorCategoria(double sueldo, String categoria) {

		// realizamos un switch para discriminar al empleado por categoria
		// en funcion de su categoria le añadiremos el porcentaje correspondiente a su
		// sueldo
		// y guardaremos el valor en el sueldo
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
			sueldo = sueldo*AJUSTE_SUELDO_VOLUNTEER; // Los voluntarios no cobran!
			break;
		default:
			categoria = CATEGORIA_DEFAULT; // en caso de que ninguno coincida se emplea la categoria default
		}

		return sueldo;

	}

	// Metodo de control sobre el rango de sueldos:
	// usaremos los parametros de sueldo y categoria
	public boolean controlRangoSueldo(double sueldo, String categoria) {

		// creamos una variable booleana para que nos diga si se encuentra dentro del
		// rango establecido
		boolean sueldoCorrecto = false;

		// Comprobamos los sueldos por categorias con un switch
		switch (categoria) {

		// usamos las constantes de maximos y minimos sobre los sueldos en funcion de
		// sus categorias

		case "MANAGER":
			if (sueldo > SUELDO_MANAGER_MIN && sueldo < SUELDO_MANAGER_MAX)
				sueldoCorrecto = true;
		case "BOSS":
			if (sueldo > SUELDO_BOSS_MIN)
				sueldoCorrecto = true;
		}

		return sueldoCorrecto;

	}

	// Metodo toString(), este metodo servira para imprimir los datos de los
	// empleados:
	public String toString() {
		return "ID: " + this.ID + " | Nombre: " + this.nombre + " | Sueldo: " + this.sueldo + " | Categoria: "
				+ this.categoria ;
	}
	
	public  double sueldoNeto(double sueldo, String categoria) {

		// realizamos un switch para discriminar al empleado por categoria
		// en funcion de su categoria le restaremos el porcentaje correspondiente a su
		// sueldo bruto
		// y guardaremos el valor en el sueldo
		
		
		switch (categoria) {
		case "MANAGER":
			sueldo -= sueldo * IRPF_MANAGER;
			break;
		case "BOSS":
			sueldo -= sueldo * IRPF_BOSS;
			break;
		case "SENIOR":
			sueldo -= sueldo * IRPF_SENIOR;
			break;
		case "MID":
			sueldo -= sueldo* IRPF_MID; 
			break;
		case "JUNIOR":
			sueldo -= sueldo* IRPF_JUNIOR; 
			break;
		default:
			categoria = CATEGORIA_DEFAULT; // en caso de que ninguno coincida se emplea la categoria default
		}

		return sueldoNeto;

	}
	
	public String sueldoNetotoString() {
		return "ID: " + this.ID + " | Nombre: " + this.nombre + " | Sueldo Neto: " + this.sueldoNeto+" | Categoria: "
				+ this.categoria ;
	}

	public String sueldoNetotoAnualesString() {
		return "ID: " + this.ID + " | Nombre: " + this.nombre + " | Sueldo Neto Anual: " + (this.sueldoNeto*12)+" | Categoria: "
				+ this.categoria ;
	
	}
}
