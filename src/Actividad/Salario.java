package Actividad;

public class Salario implements CalculadoraSueldo {

	// Declaracion de Variables 

	 

			public int Sueldo = 0;  

			public float Pension, Salud, TotalPagar, TotalDevengado, TotalDeducciones = 0;  

			public static final int SMLV = 1160000; // Salario Minimo Legal Vigente 2023  

			public float SubTrans = 140000; // Subsidio Transporte  

			  

			// Metodos 

			 @Override
			public void calcularSueldo(int SalarioBasico, int DiasLaborados) {
				 	
				 	int dial, salario;  

					Sueldo = (SalarioBasico / 30) * DiasLaborados;  

					dial = DiasLaborados;  

					salario = SalarioBasico;  

					 

					 

					CalcularSalud(SalarioBasico); 

					CalcularPension(salario); 

					CalcularSubsidio (salario, dial); 	 
					
			}
			 


			public void CalcularSubsidio(int SalarioBasico, int DiasLaborados) {  

				if(Sueldo <= SMLV * 2) {  

					SubTrans = DiasLaborados * (140000 / 30);  

				}else {  

					SubTrans=0;  

				}  

				 

				CalcularDevengado(SubTrans);  

			}  

			 

			public void CalcularSalud(int SalarioBasico) {  

				 

				 Salud = SalarioBasico * 0.04f;  

			 

			}  

			  

			 

			public void CalcularPension(int Sueldo) {  

				Pension= Sueldo * 0.04f;  

				 

				CalcularDeducciones(Salud, Pension);  

				  

			}  

			public void CalcularDeducciones(float Salud, float pension) {  

				TotalDeducciones= Salud + Pension;  

				 

			}  

			 

			 

			public void CalcularDevengado(float SubTrans) {  

				float deducciones;  

				deducciones = (float)TotalDeducciones;  

				TotalDevengado= Sueldo + SubTrans;  

				 

				CalcularTotal((float)TotalDevengado, deducciones);  

		 }  

			  

			 

			public void CalcularTotal(float TotalDevengado, float TotalDeducciones) {  

				TotalPagar= (float)(TotalDevengado- TotalDeducciones);  

				 

			  

			}  

			 

			 

			 

			 

			// Getters y Setters//  

			 

			public int getSueldo() {  

			 

				 return Sueldo;  

			 

			}  

			 

			public void setSueldo(int Sueldo) {  

			 

				 this.Sueldo= Sueldo;  

			 

			}  

			 

			public float getSubTrans() {  

			 

				 return SubTrans;  

			 

			}  

			 

			public void setSubTrans(float SubTrans) {  

			 

				 this.SubTrans= SubTrans;  

			 

			}  

			 

			public float getSalud() {  

			 

				 return Salud;  

			 

			}  

			 

			public void setSalud(float Salud) {  

			 

				 this.Salud = Salud;  

			 

			}  

			 

			public float getPension() {  

			 

				 return Pension;  

			 

			}  

			 

			public void setPension(float Pension) {  

			 

				 this.Pension =Pension;  

			 

			}  

			 

			public double getTotalPagar() {  

			 

				 return TotalPagar;  

			 

			}  

			 

			public void setTotalPagar(float TotalPagar) {  

			 

				 this.TotalPagar = TotalPagar;  

			 

			}  

			 

			public double getTotalDevengado() {  

			 

				 return TotalDevengado;  

			 

			}  

			 

			public void setTotalDevengado (float TotalDevengado) {  

			 

				 this.TotalDevengado= TotalDevengado;  

			 

			}  

			 

			public double getTotalDeducciones() {  

			 

				 return TotalDeducciones;  

			 

			}  

			 

			public void setTotalDeducciones(float TotalDeducciones) {  

			 

				 this.TotalDeducciones = TotalDeducciones;  

			 

			}  

			  

		 

	
}
