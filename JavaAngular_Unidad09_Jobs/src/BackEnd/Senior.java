package BackEnd;

 class Senior extends Empleado{
	
	

	

	//constantes
	 
			protected double reduccionSenior;
			
			
	//constructor		
			
	public Senior(int ID, String nombre, double sueldo, String categoria) {
	super(ID, nombre, sueldo, categoria);
				
			

}


	public double getReduccionSenior() {
		return reduccionSenior;
	}


	public void setReduccionSenior(double reduccionSenior) {
		this.reduccionSenior = reduccionSenior;
	}
	
	
}
