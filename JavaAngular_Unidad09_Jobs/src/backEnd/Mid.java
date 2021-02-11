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
	
	//constantes
	public final double REDUCCIN_MID = 10 / 100;;
			
		
	//constructor	
	public Mid(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
		this.sueldo += this.sueldo * REDUCCIN_MID;
		
	}

}
