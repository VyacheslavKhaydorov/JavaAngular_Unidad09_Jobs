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

	
	//constantes propias de esta sub-clase
	//los trabajadores junior tienen una reduccion del 15% sobre su sueldo
	public final double REDUCCION_JUNIOR = -0.15;
	
	
	//constructor
	public Junior(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		
		
		
		 //reflejamos el valor del sueldo correspondiente a su experiencia
		// previamente le aplicamos el metodo "sueldoAjustadoPorCategoria"
		if(categoria.equals("volunteer" )) 
			
			this.sueldo = 0;
		else 
			
			this.sueldo = this.sueldo +(sueldo * REDUCCION_JUNIOR);
	}
	
}
