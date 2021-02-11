
public class MainApp {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado ("Julio", 1200, "Boss", 400);
		empleado1.toString();

	}
	
	//Método
	public boolean validacion (String nombre, int sueldo, String categoria, Empleado empleado1) {
		boolean bien = false;
		if (empleado1.categoria = "Boss" && empleado1.sueldo > 8000) {
			bien = true;
		}
		if (empleado1.categoria = "Manager") && (empleado1.sueldo >= 3000 && empleado1.sueldo < 5000)) {
			bien = true;
		}
		if (empleado1.categoria = "Senior" && (empleado1.sueldo >= 2700 && empleado1.sueldo < 3000)) {
			bien = true;
		}
		if (empleado1.categoria = "Mid" && (empleado1.sueldo >= 1800 && empleado1.sueldo < 2500)) {
			bien = true;
		}
		if (empleado1.categoria = "Junior" && (empleado1.sueldo >= 900 && empleado1.sueldo < 1600)) {
			bien = true;
		}
		if (empleado1.categoria = "Volunteer") {
			bien = true;
		}
		
		return bien;
		
		}
}
