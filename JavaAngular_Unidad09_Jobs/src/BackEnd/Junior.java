package BackEnd;

class Junior extends Empleado {

	
	//constantes
	protected double reduccionJunior;
	
	
	
	//constructor
	
	public Junior(int ID, String nombre, double sueldo, String categoria) {
		super(ID, nombre, sueldo, categoria);
	}



	public double getReduccionJunior() {
		return reduccionJunior;
	}



	public void setReduccionJunior(double reduccionJunior) {
		this.reduccionJunior = reduccionJunior;
	}
	
	
	

}
