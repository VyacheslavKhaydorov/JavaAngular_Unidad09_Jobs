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

class Junior extends Empleado {

	
	//constantes
	public final double REDUCCION_JUNIOR = 15 / 100;

	
	//constructor
	public Junior(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		this.sueldo += this.sueldo * REDUCCION_JUNIOR;
	}
	
}
