/**
 * 
 */
package backEnd;

import javax.swing.JOptionPane;

/**
 * @author 	Cesar Torrelles
 * 			Ingrid DOminguez
 * 			Vyacheslav Khaydorov
 *
 * Superclase empleado.
 */
public class Empleado {

	//Constantes
	protected final static String CATEGORIA_MANAGER = "MANAGER";
	protected final static String CATEGORIA_BOSS = "BOSS";
	protected final static String CATEGORIA_EMPLOYEE = "EMPLOYEE";
	protected final static String CATEGORIA_VOLUNTEER = "VOLUNTEER";
	protected final static String CATEGORIA_DEFAULT = CATEGORIA_VOLUNTEER;	//Categoria por defecto
	protected final static double AJUSTE_SUELDO_MANAGER = 0.1;
	protected final static double AJUSTE_SUELDO_BOSS = 0.5;
	protected final static double AJUSTE_SUELDO_EMPLOYEE = -0.15;
	protected final static double AJUSTE_SUELDO_VOLUNTEER = 0;	//IMPORTANTE: los voluntarios no cobran!
	protected final static int SUELDO_BOSS_MIN = 8000;
	protected final static int SUELDO_MANAGER_MAX = 5000;
	protected final static int SUELDO_MANAGER_MIN = 3000;
	protected final static int SUELDO_VOLUNTEER = 0;
	protected final static double IRPF_BOSS = 0.32;
	protected final static double IRPF_MANAGER = 0.26;
	protected final static int NUMERO_PAGAS = 12;
	
	
	//Atributos
	protected int ID;
	protected String nombreEmpleado;
	protected double sueldoBrutoMensual;
	protected double sueldoNetoMensual;
	protected double sueldoBrutoAnual;
	protected double sueldoNetoAnual;
	protected String categoriaEmpleado;
	protected double IRPF;
	
	
	//Constructores
	public Empleado(int ID, String nombre, double sueldo, String categoria) {
		this.ID = ID;
		this.nombreEmpleado = nombre;
		this.sueldoBrutoMensual = sueldo;
		this.categoriaEmpleado = categoria;
		
		//Llamada al metodo de control de categoriaEmpleado
		this.categoriaEmpleado = categoriaCorrecta(this.categoriaEmpleado);
		
		//Llamada al metodo asignarIRPF
		this.IRPF = asignarIRPF(this.categoriaEmpleado);
				
		//Llamada al metodo de ajuste de sueldoBrutoMensual
		this.sueldoBrutoMensual = sueldoAjustadoPorCategoria(this.sueldoBrutoMensual, this.categoriaEmpleado);
	
		//Llamada al metodo controlRangoSueldo
		try {
			controlRangoSueldo(this.sueldoBrutoMensual, this.categoriaEmpleado);
		} catch (Exception ExcepcionSueldoFueraDeRango) {
			JOptionPane.showMessageDialog(null, ExcepcionSueldoFueraDeRango);
		}
		
		//Llamada al metodo calcularSueldoNetoMensual
		this.sueldoNetoMensual = calcularSueldoNetoMensual(this.sueldoBrutoMensual, this.IRPF);
		
		//Llamada al metodo calcularSueldoBrutoAnual
		this.sueldoBrutoAnual = calcularSueldoBrutoAnual(this.sueldoBrutoMensual);
		
		//Llamada al metodo calcularSueldoNetoAnual
		this.sueldoNetoAnual = calcularSueldoNetoAnual(this.sueldoBrutoMensual, this.IRPF);
	
	}


	//METODOS
	//Metodo toString()
	public String toString() {
		return "ID: " + this.ID + " | Nombre: " + this.nombreEmpleado + " | Categoria: "
				+ this.categoriaEmpleado + "\nSueldo bruto mensual: " + this.sueldoBrutoMensual
				+ "\nSueldo neto mensual: " + this.sueldoNetoMensual
				+ "\nSueldo bruto anual: " + this.sueldoBrutoAnual
				+ "\nSueldo neto anual: " + this.sueldoNetoAnual;
	}
	
	
	//Método para ajustar el sueldoBrutoMensual según la categoriaEmpleado
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
	
	
	//Metodo de control sobre el rango de sueldos
	public void controlRangoSueldo (double sueldo, String categoria)
			throws ExcepcionSueldoFueraDeRango {
		
		//Comprobamos los sueldos por categorias
		switch (categoria) {
		case "MANAGER":
			if (sueldo > SUELDO_MANAGER_MIN && sueldo < SUELDO_MANAGER_MAX)
				break;
			else
				throw new ExcepcionSueldoFueraDeRango(sueldo + " de sueldo de manager no esta"
						+ " dentro del rango (mayor a " + SUELDO_MANAGER_MIN + " y menor a "
						+ SUELDO_MANAGER_MAX + ")");
		case "BOSS":
			if (sueldo > SUELDO_BOSS_MIN)
				break;
			else {
				throw new ExcepcionSueldoFueraDeRango(sueldo + " de sueldo de " + categoria
						+ " no esta dentro del rango (mayor a " + SUELDO_BOSS_MIN + ")");	
			}
		}
		
	}
	
	
	//Metodo para asignar el IRPF por categoria
	public double asignarIRPF (String categoria) {
		
		double IRPF = 0;
		
		switch (categoria) {
			case "MANAGER":
				IRPF = IRPF_MANAGER;
				break;
			case "BOSS":
				IRPF = IRPF_BOSS;
		}
		
		return IRPF;
		
	}
	
	
	//Metodo de control de categoriaEmpleado
	//Comprueba que la categoria es una de las correctas y la devuelve en UpperCase
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
	
	
	//Metodo para calcular el sueldoNetoMensual
	public double calcularSueldoNetoMensual(double sueldoBrutoMensual, double IRPF) {
		
		sueldoNetoMensual = sueldoBrutoMensual - (sueldoBrutoMensual * IRPF);
		
		return sueldoNetoMensual;
		
	}
	
	
	//Metodo para calcular el sueldoBrutoAnual
	public double calcularSueldoBrutoAnual(double sueldoBrutoMensual) {
		
		sueldoBrutoAnual = sueldoBrutoMensual * NUMERO_PAGAS;
		
		return sueldoBrutoAnual;
				
	}
	
	
	//Metodo para calcular el sueldoNetoAnual
	public double calcularSueldoNetoAnual(double sueldoBrutoMensual, double IRPF) {
		
		sueldoNetoAnual = (sueldoBrutoMensual - (sueldoBrutoMensual * IRPF)) * NUMERO_PAGAS;
		
		return sueldoNetoAnual;
		
	}


	//Getters y setters
	public int getID() {
		return ID;
	}


	public void setID(int ID) {
		this.ID = ID;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	public double getSueldoBrutoMensual() {
		return sueldoBrutoMensual;
	}


	public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
		this.sueldoBrutoMensual = sueldoBrutoMensual;
	}


	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}


	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}


	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}


	public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
		this.sueldoBrutoAnual = sueldoBrutoAnual;
	}


	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}


	public void setSueldoNetoAnual(double sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}


	public String getCategoriaEmpleado() {
		return categoriaEmpleado;
	}


	public void setCategoriaEmpleado(String categoriaEmpleado) {
		this.categoriaEmpleado = categoriaEmpleado;
	}


	public double getIRPF() {
		return IRPF;
	}


	public void setIRPF(double iRPF) {
		IRPF = iRPF;
	}


	public static String getCategoriaManager() {
		return CATEGORIA_MANAGER;
	}


	public static String getCategoriaBoss() {
		return CATEGORIA_BOSS;
	}


	public static String getCategoriaEmployee() {
		return CATEGORIA_EMPLOYEE;
	}


	public static String getCategoriaVolunteer() {
		return CATEGORIA_VOLUNTEER;
	}


	public static String getCategoriaDefault() {
		return CATEGORIA_DEFAULT;
	}


	public static double getAjusteSueldoManager() {
		return AJUSTE_SUELDO_MANAGER;
	}


	public static double getAjusteSueldoBoss() {
		return AJUSTE_SUELDO_BOSS;
	}


	public static double getAjusteSueldoEmployee() {
		return AJUSTE_SUELDO_EMPLOYEE;
	}


	public static double getAjusteSueldoVolunteer() {
		return AJUSTE_SUELDO_VOLUNTEER;
	}


	public static int getSueldoBossMin() {
		return SUELDO_BOSS_MIN;
	}


	public static int getSueldoManagerMax() {
		return SUELDO_MANAGER_MAX;
	}


	public static int getSueldoManagerMin() {
		return SUELDO_MANAGER_MIN;
	}


	public static int getSueldoVolunteer() {
		return SUELDO_VOLUNTEER;
	}


	public static double getIrpfBoss() {
		return IRPF_BOSS;
	}


	public static double getIrpfManager() {
		return IRPF_MANAGER;
	}


	public static int getNumeroPagas() {
		return NUMERO_PAGAS;
	}
	
	
}
