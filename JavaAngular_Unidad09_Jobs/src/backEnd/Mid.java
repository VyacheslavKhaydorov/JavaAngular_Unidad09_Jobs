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

}
