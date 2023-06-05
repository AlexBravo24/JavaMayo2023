import java.util.Scanner;

public class Ejercicio14_OBA {

	public static void main(String[] args) { /* Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
		                                       horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
	                                           primeras 40 horas y $20 por cada hora extra.*/
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
		        int horasTrabajadas = scanner.nextInt();

		        double salario = calcularSalario(horasTrabajadas);

		        System.out.println("El salario semanal del obrero es: $" + salario);
		    }

		    public static double calcularSalario(int horasTrabajadas) {
		        double salario;
		        int horasNormales = Math.min(horasTrabajadas, 40); // Horas normales (40 horas o menos)
		        int horasExtras = Math.max(horasTrabajadas - 40, 0); // Horas extras (más de 40 horas)

		        salario = horasNormales * 16; // Pago por horas normales
		        salario += horasExtras * 20; // Pago por horas extras

		        return salario;
		    }
		

		
		
		
	}


