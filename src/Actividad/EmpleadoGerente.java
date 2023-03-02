package Actividad;

public class EmpleadoGerente extends Empleado {

	// Declaracion de Variables 

	public int SalarioBase = 2500000; 

	public float Subsidio = 0; 

	  

	//Constructor 

	public EmpleadoGerente(String Nombre, String Apellido, int Id, int SalarioBase, int DiasLaborados, int Sueldo, 

	float Salud, float Pension, float Devengado, float deducciones, float Subsidio, float TotalPagar) { 

	 

	super(Nombre, Apellido, Id, SalarioBase, DiasLaborados, Sueldo, Salud, Pension, Devengado, deducciones, Subsidio, 

	TotalPagar); 

	} 

	 

	@Override 

	public void Reporte() { 

	System.out.println("\nNÓMINA DEL EMPLEADO GERENTE\n NOMBRE: "+Nombre+"\n APELLIDO: "+Apellido+"\n SALARIO BASE: "+SalarioBase+"\n DÍAS LABORADOS: "+DiasLaborados+ 

	"\n TOTAL DEVENGADO: "+Devengado+"\n SALUD: "+Salud+"\n PENSIÓN: "+Pension+"\n DEDUCCIONES TOTALES: "+deducciones+"\n\n TOTAL A PAGAR: "+TotalPagar); 

	 

	} 
}
