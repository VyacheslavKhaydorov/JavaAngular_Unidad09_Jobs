/**
 * 
 */
package models;

import backEnd.ExcepcionSueldoFueraDeRango;

/**
 * @author 	Cesar Torrelles
 * 			Ingrid DOminguez
 * 			Vyacheslav Khaydorov
 *
 */
public class Senior extends Empleado{

	//Constantes
	protected final double REDUCCION_SENIOR = 0.05;
	protected final static int SUELDO_SENIOR_MAX = 4000;
	protected final static int SUELDO_SENIOR_MIN = 2700;
	protected final double IRPF_SENIOR = 0.24;
	
	
	//Constructor				
	public Senior(int ID, String nombre, double sueldo) {
		super(ID, nombre, sueldo, CATEGORIA_EMPLOYEE);
		this.sueldoBrutoMensual += this.sueldoBrutoMensual * REDUCCION_SENIOR;
			
	}


	//Getters
	public double getREDUCCION_SENIOR() {
		return REDUCCION_SENIOR;
	}


	public double getIRPF_SENIOR() {
		return IRPF_SENIOR;
	}
	
	
	public static int getSueldoSeniorMax() {
		return SUELDO_SENIOR_MAX;
	}


	public static int getSueldoSeniorMin() {
		return SUELDO_SENIOR_MIN;
	}


	//Metodo de control sobre el rango de sueldos
	public void controlRangoSueldo (double sueldo, String CATEGORIA_EMPLOYEE)
			throws ExcepcionSueldoFueraDeRango {
		
		if (sueldo > SUELDO_SENIOR_MIN && sueldo < SUELDO_SENIOR_MAX)
			throw new ExcepcionSueldoFueraDeRango(this.getNombreEmpleado() + " tiene "
					+ sueldo + " de sueldo de senior: no esta dentro del rango (mayor "
					+ "a " + SUELDO_SENIOR_MIN + " y menor a " + SUELDO_SENIOR_MAX + ")");
		
	}
	
	
	//Metodo para asignar el IRPF por categoria
	public double asignarIRPF (String categoria) {
		
		double IRPF = IRPF_SENIOR;
		
		return IRPF;
		
	}

	
}
