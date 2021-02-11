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
	 
	protected double REDUCCION_SENIOR = 10 / 100;
			
			
	//constructor		
			
	public Senior(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		sueldo += sueldo * REDUCCION_SENIOR;
			
	}

	
}
