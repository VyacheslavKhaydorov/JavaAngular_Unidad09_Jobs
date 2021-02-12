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
class Senior extends Empleado{

	//Constantes
	protected final double REDUCCION_SENIOR = 0.05;
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

	
}
