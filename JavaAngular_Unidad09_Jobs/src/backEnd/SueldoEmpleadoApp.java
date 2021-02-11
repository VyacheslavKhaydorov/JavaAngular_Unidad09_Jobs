/**
 * 
 */
package backEnd;

/**
 * @author viach
 *
 */
public class SueldoEmpleadoApp {
	
	
	
	public static void main(String[] args) {
		//Definimos unos vectores de prueba
		Junior empleadosJunior[] = new Junior[10];
		Mid empleadosMid[] = new Mid[10];
		Senior empleadosSenior[] = new Senior[10];
		
		empleadosJunior[0] = new Junior(2000, "Raquel", 1200, "employee", 8);
		empleadosJunior[1] = new Junior(2001, "Marta", 1000, "employee", 9);
		empleadosJunior[2] = new Junior(2002, "Jose", 1100, "employee", 7);
		empleadosJunior[3] = new Junior(2003, "Alvaro", 1400, "employee", 8);
		empleadosJunior[4] = new Junior(2004, "Miguel", 900, "volunteer", 5);
		
		empleadosMid[5] = new Mid(3000, "Alba", 1800, "employee", 4);
		empleadosMid[6] = new Mid(3001, "Lucia", 1900, "employee", 10);
		empleadosMid[7] = new Mid(3002, "Edgard", 1900, "employee", 4);
		empleadosMid[8] = new Mid(3003, "Francisco", 1800, "employee", 9);
		empleadosMid[9] = new Mid(3004, "Ana", 2000, "manager", 7);
		
		empleadosSenior[0] = new Senior(4000, "Beatriz", 2500, "employee");
		empleadosSenior[1] = new Senior(4000, "Olga", 4200, "manager");
		empleadosSenior[2] = new Senior(4000, "Maria Jose", 4000, "manager");
		empleadosSenior[3] = new Senior(4000, "Jorge", 2800, "employee");
		empleadosSenior[4] = new Senior(4000, "Gema", 3000, "employee");
		
		Empleado empleadoJefe = new Empleado(1234, "Julio", 7000, "boss");

	}
	
	
}
