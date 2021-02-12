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


	//Metodo de control sobre el rango de sueldos
	public void controlRangoSueldo (double sueldo, String categoria) {
		
		
		
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
				break;
		}
		
		return IRPF;
		
	}
	
}
