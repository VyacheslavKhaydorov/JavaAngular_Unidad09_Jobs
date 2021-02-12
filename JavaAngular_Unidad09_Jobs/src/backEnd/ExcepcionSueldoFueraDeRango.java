/**
 * 
 */
package backEnd;

/**
 * @author Cesar Torrelles
 * 			Ingrid DOminguez
 * 			Vyacheslav Khaydorov
 */
public class ExcepcionSueldoFueraDeRango extends Exception {

	public ExcepcionSueldoFueraDeRango (String mensajeError) {
		super(mensajeError);
	}
	
}
