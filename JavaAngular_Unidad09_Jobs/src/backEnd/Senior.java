/**
 * 
 */
package backEnd;

/**
 * @author viach
 *
 */
class Senior extends Empleado{
	
	

	

	//constantes
	 
	protected double reduccionSenior;
			
			
	//constructor		
			
	public Senior(int ID, String nombre, double sueldo, String categoria, double reduccionSenior) {
		super(ID, nombre, sueldo, categoria);		
			
}


	public double getReduccionSenior() {
		return reduccionSenior;
	}


	public void setReduccionSenior(double reduccionSenior) {
		this.reduccionSenior = reduccionSenior;
	}
	
	
}
