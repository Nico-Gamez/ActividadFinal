package Actividad;

public abstract class Empleado { 

	// Declaracion de Variables 

	 

	public String Nombre, Apellido; 

	public int Id, SalarioBase, DiasLaborados, Sueldo;  

	public float Salud, Pension, Devengado,deducciones, Subsidio, TotalPagar;  

	  

	//Constructor 

	 

	public Empleado(String Nombre, String Apellido, int Id, int SalarioBase,int DiasLaborados,int Sueldo, float Salud, float Pension, float Devengado,float deducciones, float Subsidio, float TotalPagar) {  

	this.Nombre = Nombre;  

	this.Apellido= Apellido;  

	 

	this.Id = Id; 

	this.SalarioBase= SalarioBase;  

	this.DiasLaborados= DiasLaborados;  

	this.Sueldo= Sueldo;  

	this.Salud= Salud;  

	 

	this.Pension = Pension; 

	this.Devengado= Devengado;  

	this.deducciones= deducciones;  

	 

	this.Subsidio = Subsidio; 

	 

	this.TotalPagar = TotalPagar; 

	}  

	 

	 

	//Metodo abstracto 

	abstract public void Reporte(); 

	 

	// Getters y Setters// 

	 

	public float getSalud() {  

	return Salud;  

	}  

	public void setSalud(int Salud) {  

	this.Salud= Salud;  

	}  

	 

	public float getPension() {  

	return Pension;  

	}  

	public void setPension(int Pension) {  

	this.Pension= Pension;  

	}  

	public float getSueldo() {  

	return Sueldo;  

	}  

	public void setSueldo(float Sueldo) {  

	Salario suel = new Salario();  

	}  

	public float getDevengado() {  

	return Devengado;  

	}  

	public void setDevengado(float Devengado) {  

	this.Devengado= Devengado;  

	}  

	public float getDeducciones() {  

	return deducciones;  

	}  

	public void setDeducciones(float deducciones) {  

	this.deducciones= deducciones;  

	}  

	 

	public float getSubsidio() {  

	return deducciones;  

	}  

	public void setSubsidio(float Subsidio) {  

	this.Subsidio= Subsidio;  

	}  

	 

	public float getTotalPagar() {  

	return TotalPagar;  

	}  

	public void setTotalPagar(float TotalPagar) {  

	this.TotalPagar= TotalPagar;  

	}	
}
