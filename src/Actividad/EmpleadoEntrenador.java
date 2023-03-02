package Actividad;

public class EmpleadoEntrenador extends Empleado { 

	// Declaracion de Variables 

	public int SalarioBase = 1850000; 

	  

	//Constructor 

	public EmpleadoEntrenador(String Nombre, String Apellido, int Id, int SalarioBase, int DiasLaborados, int Sueldo, 

	float Salud, float Pension, float Devengado, float deducciones, float Subsidio, float TotalPagar) { 

	 

	super(Nombre, Apellido, Id, SalarioBase, DiasLaborados, Sueldo, Salud, Pension, Devengado, deducciones, Subsidio, 

	TotalPagar); 

	  

	} 

	 

	@Override 

	public void Reporte() { 

	System.out.println("\nNÓMINA DEL EMPLEADO ENTRENADOR\n NOMBRE: "+Nombre+"\n APELLIDO: "+Apellido+"\n SUELDO BASE: "+SalarioBase+"\n DÍAS LABORADOS: "+DiasLaborados+ 

	"\n TOTAL DEVENGADO: "+Devengado+"\n SALUD: "+Salud+"\n PENSIÓN: "+Pension+"\n SUBSIDIO: "+Subsidio+"\n DEDUCCIONES TOTALES: "+deducciones+"\n\n TOTAL A PAGAR: "+TotalPagar); 

	 

	} 

	} 