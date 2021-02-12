/**
 * 
 */
package backEnd;

import java.util.Scanner;

/**
 * @author 	Cesar Torrelles
 * 			Ingrid DOminguez
 * 			Vyacheslav Khaydorov
 *
 */
public class SueldoEmpleadoApp {		
	
	public static void main(String[] args) {
		
		/*//Entrada de datos por teclado con Scanner
		String entradaDeDatos = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Hay bonus de salario para este año? (Y/N)");
		entradaDeDatos = "";
		
		//Si hay bonus
		if (entradaDeDatos == "Y") {
			Empleado tenemosBonus = new Empleado();
			tenemosBonus.setTenemosBonus(true);
		}*/
		
		//Mostramos los empleados almacenados en ArchivosEmpleado
		ArchivoEmpleados.mostramosEmpleados();
		
	}
	
}
