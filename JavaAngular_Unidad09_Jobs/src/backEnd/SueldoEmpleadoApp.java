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
public class SueldoEmpleadoApp {
		
	
	public static void main(String[] args) {
		//Definimos unos vectores de prueba
		Junior empleadosJunior[] = new Junior[5];
		Mid empleadosMid[] = new Mid[5];
		Senior empleadosSenior[] = new Senior[5];
		
		empleadosJunior[0] = new Junior(2000, "Raquel", 1200, "employee");
		empleadosJunior[1] = new Junior(2001, "Marta", 1000, "employee");
		empleadosJunior[2] = new Junior(2002, "Jose", 1100, "employee");
		empleadosJunior[3] = new Junior(2003, "Alvaro", 1400, "employee");
		empleadosJunior[4] = new Junior(2004, "Miguel", 900, "volunteer");
		
		empleadosMid[0] = new Mid(3000, "Alba", 1800, "employee");
		empleadosMid[1] = new Mid(3001, "Lucia", 1900, "employee");
		empleadosMid[2] = new Mid(3002, "Edgard", 1900, "employee");
		empleadosMid[3] = new Mid(3003, "Francisco", 1800, "employee");
		empleadosMid[4] = new Mid(3004, "Ana", 2000, "manager");
		
		empleadosSenior[0] = new Senior(4000, "Beatriz", 2500, "employee");
		empleadosSenior[1] = new Senior(4000, "Olga", 4200, "manager");
		empleadosSenior[2] = new Senior(4000, "Maria Jose", 4000, "manager");
		empleadosSenior[3] = new Senior(4000, "Jorge", 2800, "employee");
		empleadosSenior[4] = new Senior(4000, "Gema", 3000, "employee");
		
		Empleado empleadoJefe = new Empleado(1234, "Julio", 7000, "boss");

		System.out.println(empleadoJefe.toString());
		
		for (Junior empleado : empleadosJunior)
			System.out.println(empleado.toString());
		
		for (Mid empleado : empleadosMid)
			System.out.println(empleado.toString());
		
		for (Senior empleado : empleadosSenior)
			System.out.println(empleado.toString());
		
	}
	
}
