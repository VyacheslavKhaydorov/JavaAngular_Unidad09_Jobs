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
	

	//constantes
	 
	protected double REDUCCION_SENIOR = 5 / 100;
			
			
	//constructor		
			
	public Senior(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		this.sueldo += this.sueldo * REDUCCION_SENIOR;
			
	}

	
}
