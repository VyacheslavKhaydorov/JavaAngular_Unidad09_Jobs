/**
 * 
 */
package backEnd;

/**
 * @author viach
 *
 */
class Mid extends Empleado {
	
	
	//constantes
		protected double reduccionMid;
		
		
		
	//constructor
			
	public Mid(int ID, String nombre, double sueldo, String categoria, double reduccionMid) {
		super(ID, nombre, sueldo, categoria);
	}



	public double getReduccionMid() {
		return reduccionMid;
	}



	public void setReduccionMid(double reduccionMid) {
		this.reduccionMid = reduccionMid;
	}
		
		
		

}
