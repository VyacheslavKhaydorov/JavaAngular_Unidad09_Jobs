/**
 * 
 */
package backEnd;

/**
 * @author 	Cesar Torrelles
 * 			Ingrid DOminguez
 * 			Vyacheslav Khaydorov
 *
 */
public class Mid extends Empleado {
	
	//constantes
	protected final double REDUCCIN_MID = 0.1;
	protected final static int SUELDO_MID_MAX = 2500;
	protected final static int SUELDO_MID_MIN = 1800;
	protected final double IRPF_MID = 0.15;
	

	//constructor	
	public Mid(int ID, String nombre, double sueldo) {
		super(ID, nombre, sueldo, CATEGORIA_EMPLOYEE);
		this.sueldoBrutoMensual += this.sueldoBrutoMensual * REDUCCIN_MID;
		
	}
	
	
	//Getters
	public double getREDUCCIN_MID() {
		return REDUCCIN_MID;
	}


	public double getIRPF_MID() {
		return IRPF_MID;
	}
	
	
	public static int getSueldoMidMax() {
		return SUELDO_MID_MAX;
	}


	public static int getSueldoMidMin() {
		return SUELDO_MID_MIN;
	}


	//Metodo de control sobre el rango de sueldos
	public void controlRangoSueldo (double sueldo, String CATEGORIA_EMPLOYEE)
			throws ExcepcionSueldoFueraDeRango {
		
		if (sueldo > SUELDO_MID_MIN && sueldo < SUELDO_MID_MAX)
			throw new ExcepcionSueldoFueraDeRango(this.getNombreEmpleado() + " tiene " + sueldo
					+ " de sueldo de mid: no esta dentro del rango (mayor a " + SUELDO_MID_MIN + " y menor a "
					+ SUELDO_MID_MAX + ")");
		
	}
	
		
	//Metodo para asignar el IRPF por categoria
	public double asignarIRPF (String categoria) {
		
		double IRPF = IRPF_MID;
		
		return IRPF;
		
	}

}
