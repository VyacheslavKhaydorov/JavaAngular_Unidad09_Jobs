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
		
		//Definimos 3 Arrays para almacenar a todos los objeto empleado
		//hay 3 tipo junior, 3 tipo mid y 3 tipo senior
		//hacemos uno por cada tipo
		Junior empleadosJunior[] = new Junior[3];
		Mid empleadosMid[] = new Mid[3];
		Senior empleadosSenior[] = new Senior[3];
		
	
		empleadosJunior[0] = new Junior(2000, "Raquel", 1200, "employee");
		empleadosJunior[1] = new Junior(2001, "Marta", 1000, "employee");
		empleadosJunior[2] = new Junior(2002, "Jose", 1100, "volunteer");
		
		
		empleadosMid[0] = new Mid(3000, "Alba", 1800, "employee");
		empleadosMid[1] = new Mid(3001, "Lucia", 1900, "employee");
		empleadosMid[2] = new Mid(3002, "Edgard", 1900, "employee");
		
		
		empleadosSenior[0] = new Senior(4000, "Beatriz", 2500, "employee");
		empleadosSenior[1] = new Senior(4000, "Olga", 4200, "employee");
		empleadosSenior[2] = new Senior(4000, "Maria Jose", 4000, "employee");
		
		
		
		//Definimos un jefe
		Empleado empleadoJefe = new Empleado(1234, "Julio", 7000, "boss");
		

		//Definimos tambien un manager
		Empleado manager = new Empleado(2222, "Jacinto", 4000, "manager");
		
		
		//Imprimimos una lista preliminar de los empleados: 
		
		
		System.out.println("Sueldos Brutos Mensuales: "); 
		System.out.println(); 
	
		
		System.out.println(empleadoJefe.toString()+"\n");
		
		System.out.println(manager.toString()+"\n");
		
		for (Senior empleado : empleadosSenior)
			System.out.println(empleado.toString()+" Senior \n");
	
		for (Mid empleado : empleadosMid)
			System.out.println(empleado.toString()+" Mid \n");
		
		for (Junior empleado : empleadosJunior)
			System.out.println(empleado.toString()+" Junior \n");
		
		
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		
		
		System.out.println("Sueldos Netos Mensuales: "); 
		System.out.println(); 
		
			
		System.out.println(empleadoJefe.sueldoNetotoString()+"\n");
		
		System.out.println(manager.sueldoNetotoString()+"\n");
		
		for (Senior empleado : empleadosSenior)
			System.out.println(empleado.sueldoNetotoString()+" Senior \n");
	
		for (Mid empleado : empleadosMid)
			System.out.println(empleado.sueldoNetotoString()+" Mid \n");
		
		for (Junior empleado : empleadosJunior)
			System.out.println(empleado.sueldoNetotoString()+" Junior \n");
		
		
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		
		System.out.println("Sueldos Netos Anuales: "); 
		System.out.println(); 
		
			
		System.out.println(empleadoJefe.sueldoNetotoAnualesString()+"\n");
		
		System.out.println(manager.sueldoNetotoAnualesString()+"\n");
		
		for (Senior empleado : empleadosSenior)
			System.out.println(empleado.sueldoNetotoAnualesString()+" Senior \n");
	
		for (Mid empleado : empleadosMid)
			System.out.println(empleado.sueldoNetotoAnualesString()+" Mid \n");
		
		for (Junior empleado : empleadosJunior)
			System.out.println(empleado.sueldoNetotoAnualesString()+" Junior \n");
		
			
	}
	
}
