/**
 * 
 */
package backEnd;

/**
 * @author viach
 *
 */
public class ExcepcionSueldoFueraDeRango extends Exception {

	public ExcepcionSueldoFueraDeRango (String mensajeError) {
		super(mensajeError);
	}
	
}
