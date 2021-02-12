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
	

	//constantes propias de esta sub-clase
	//los trabajadores senior tienen una reduccion del 5% sobre su sueldo
	protected final double REDUCCION_SENIOR = -0.05;
	
			
			
	//constructor		
			
	public Senior(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		
		 //reflejamos el valor del sueldo correspondiente a su experiencia
		// previamente le aplicamos el metodo "sueldoAjustadoPorCategoria"
		if(categoria.equals("volunteer" )) 
			
			this.sueldo = 0;
		else 
			
			this.sueldo = this.sueldo +(sueldo * REDUCCION_SENIOR);
				
		
	}

	
		
	
}
