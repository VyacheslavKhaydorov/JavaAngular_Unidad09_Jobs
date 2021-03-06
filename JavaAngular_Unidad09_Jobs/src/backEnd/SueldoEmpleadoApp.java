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
		
		Empleado empleadoJefe = new Empleado(1234, "Julio", 1000, "BOSS");
		
		empleadosJunior[0] = new Junior(2000, "Raquel", 1200);
		empleadosJunior[1] = new Junior(2001, "Marta", 1000);
		empleadosJunior[2] = new Junior(2002, "Jose", 1100);
		empleadosJunior[3] = new Junior(2003, "Alvaro", 1400);
		empleadosJunior[4] = new Junior(2004, "Miguel", 900);
		
		empleadosMid[0] = new Mid(3000, "Alba", 1800);
		empleadosMid[1] = new Mid(3001, "Lucia", 1900);
		empleadosMid[2] = new Mid(3002, "Edgard", 1900);
		empleadosMid[3] = new Mid(3003, "Francisco", 1800);
		empleadosMid[4] = new Mid(3004, "Ana", 2000);
		
		empleadosSenior[0] = new Senior(4000, "Beatriz", 2500);
		empleadosSenior[1] = new Senior(4000, "Olga", 4200);
		empleadosSenior[2] = new Senior(4000, "Maria Jose", 4000);
		empleadosSenior[3] = new Senior(4000, "Jorge", 2800);
		empleadosSenior[4] = new Senior(4000, "Gema", 3000);
		
		
		System.out.println(empleadoJefe.toString());
		
		for (Junior empleado : empleadosJunior)
			System.out.println(empleado.toString());
		
		for (Mid empleado : empleadosMid)
			System.out.println(empleado.toString());
		
		for (Senior empleado : empleadosSenior)
			System.out.println(empleado.toString());
		
	}
	
}
