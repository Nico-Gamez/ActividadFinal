package Actividad;

import java.util.Scanner; 

public class Principal {
	
	public static void main(String[] args) { 

		 

		EmpleadoGeneral eg = new EmpleadoGeneral(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0); 

		EmpleadoGerente eger = new EmpleadoGerente(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0); 

		EmpleadoEntrenador entr = new EmpleadoEntrenador(null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0); 

		Salario salario = new Salario(); 

		 

		Scanner scanner = new Scanner (System.in);  

		 

		System.out.println("Ingresa el Nombre de la persona"); 

		String Nombre = scanner.nextLine(); 

		 

		System.out.println("Ingresa el Apellido de la persona"); 

		String Apellido = scanner.nextLine(); 

		 

		System.out.println("Ingresa el ID, de la persona"); 

		int Id = scanner.nextInt(); 

		 

		System.out.println("Cantidad de Días Laborados"); 

		int DiasLaborados = scanner.nextInt(); 

		 

		System.out.println("Qué tipo de empleado es? (Ingresa el número) \n 1. General \n 2. Gerente \n 3. Entrenador"); 

		int tipoEmpleado = scanner.nextInt(); 

		if(tipoEmpleado == 1) { 

			int SalarioBase = eg.SalarioBase; 

			salario.calcularSueldo(SalarioBase, DiasLaborados);

			EmpleadoGeneral empleadoGeneral = new EmpleadoGeneral(Nombre, Apellido, Id, SalarioBase, DiasLaborados, salario.Sueldo, salario.Salud, salario.Pension, salario.TotalDevengado, 

					salario.TotalDeducciones,salario.SubTrans, salario.TotalPagar); 

			empleadoGeneral.Reporte(); 

			 

		}else if(tipoEmpleado == 2) { 

			 

			int SalarioBase = eger.SalarioBase; 

			salario.calcularSueldo(SalarioBase, DiasLaborados); 

			EmpleadoGerente empleadoGerente = new EmpleadoGerente(Nombre, Apellido, Id, SalarioBase, DiasLaborados, salario.Sueldo, salario.Salud, salario.Pension, salario.TotalDevengado, 

					salario.TotalDeducciones,salario.SubTrans, salario.TotalPagar); 

			empleadoGerente.Reporte(); 

			 

		}else if(tipoEmpleado == 3) { 

			 

			int SalarioBase = entr.SalarioBase; 
 

			salario.calcularSueldo(SalarioBase, DiasLaborados);

			EmpleadoEntrenador empleadoEntrenador = new EmpleadoEntrenador(Nombre, Apellido, Id, SalarioBase, DiasLaborados, salario.Sueldo, salario.Salud, salario.Pension, salario.TotalDevengado, 

					salario.TotalDeducciones,salario.SubTrans, salario.TotalPagar); 

			empleadoEntrenador.Reporte(); 

		} 

		 

	} 
}
