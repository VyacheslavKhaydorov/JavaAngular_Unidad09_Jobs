/**
 * 
 */
package backEnd;

/**
 * @author 	 Cesar Torrelles
 * 			 Ingrid DOminguez
 * 			 Vyacheslav Khaydorov
 *
 */

public class Junior extends Empleado {
	
	//constantes
	protected final double REDUCCION_JUNIOR = 0.15;
	protected final static int SUELDO_JUNIOR_MAX = 1600;
	protected final static int SUELDO_JUNIOR_MIN = 900;
	protected final double IRPF_JUNIOR = 0.02;

	
	//constructor
	public Junior(int ID, String nombre, double sueldo) {
		super(ID, nombre, sueldo, CATEGORIA_EMPLOYEE);
		this.sueldoBrutoMensual += this.sueldoBrutoMensual * REDUCCION_JUNIOR;
	}


	//Getters
	public double getREDUCCION_JUNIOR() {
		return REDUCCION_JUNIOR;
	}
	
	
	public double getIRPF_JUNIOR() {
		return IRPF_JUNIOR;
	}


	public static int getSueldoJuniorMax() {
		return SUELDO_JUNIOR_MAX;
	}


	public static int getSueldoJuniorMin() {
		return SUELDO_JUNIOR_MIN;
	}


	//Metodo de control sobre el rango de sueldos
	public void controlRangoSueldo (double sueldo, String CATEGORIA_EMPLOYEE)
			throws ExcepcionSueldoFueraDeRango {
		
		if (sueldo > SUELDO_JUNIOR_MIN && sueldo < SUELDO_JUNIOR_MAX)
			throw new ExcepcionSueldoFueraDeRango(this.getNombreEmpleado() + " tiene " + sueldo
					+ " de sueldo de junior: no esta dentro del rango (mayor a "
					+ SUELDO_JUNIOR_MIN + " y menor a " + SUELDO_JUNIOR_MAX + ")");
		
	}
	
	
	//Metodo para asignar el IRPF por categoria
	public double asignarIRPF (String categoria) {
		
		double IRPF = IRPF_JUNIOR;
		
		return IRPF;
		
	}
	
}
