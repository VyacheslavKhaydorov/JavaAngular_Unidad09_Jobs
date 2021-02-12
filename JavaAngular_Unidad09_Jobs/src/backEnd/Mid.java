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
class Mid extends Empleado {
	
	//constantes propias de esta sub-clase
	//los trabajadores mid tienen una reduccion del 10% sobre su sueldo
	public final double REDUCCION_MID = -0.10;
			
		
	//constructor	
	public Mid(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		
		
		 //reflejamos el valor del sueldo correspondiente a su experiencia
		// previamente le aplicamos el metodo "sueldoAjustadoPorCategoria"
		if(categoria.equals("volunteer" )) 
			
			this.sueldo = 0;
		else 
			
			this.sueldo = this.sueldo +(sueldo * REDUCCION_MID);
		
	}

}
