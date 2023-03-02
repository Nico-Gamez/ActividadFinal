package Actividad;

public class EmpleadoGeneral extends Empleado{ 

	// Declaracion de Variables 

	public int SalarioBase = 1140000; 

	  

	//Constructor 

	public EmpleadoGeneral(String Nombre, String Apellido, int Id, int SalarioBase, int DiasLaborados, int Sueldo, 

	float Salud, float Pension, float Devengado, float deducciones, float Subsidio, float TotalPagar) { 

	 

	super(Nombre, Apellido, Id, SalarioBase, DiasLaborados, Sueldo, Salud, Pension, Devengado, deducciones, Subsidio, 

	TotalPagar); 

	} 

	 

	@Override 

	public void Reporte() { 

	System.out.println("\nNÓMINA DEL EMPLEADO GENERAL\n NOMBRE: "+Nombre+"\n APELLIDO: "+Apellido+"\n SUELDO BASE: "+SalarioBase+"\n DÍAS TRABAJADOS: "+DiasLaborados+"\n TOTAL DEVENGADO: "+Devengado+ 

	"\n SALUD: "+Salud+"\n PENSIÓN: "+Pension+"\n TOTAL DEDUCCIONES: "+deducciones+"\n SUBSIDIO: "+Subsidio+"\n\n TOTAL A PAGAR: "+TotalPagar); 

	 

	} 

	} 
