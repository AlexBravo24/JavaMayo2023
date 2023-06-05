import java.util.Scanner;

public class Ejercicio13_OBA {

	public static void main(String[] args) {  //institucion benefica
		
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Ingrese el monto de la donación: $");
		        double montoDonacion = scanner.nextDouble();
		        
		        double centroSalud, comedorNinos, inversionBolsa;
		        
		        if (montoDonacion >= 10000) {
		            centroSalud = montoDonacion * 0.3;
		            comedorNinos = montoDonacion * 0.5;
		            inversionBolsa = montoDonacion - centroSalud - comedorNinos;
		        } else {
		            centroSalud = montoDonacion * 0.25;
		            comedorNinos = montoDonacion * 0.6;
		            inversionBolsa = montoDonacion - centroSalud - comedorNinos;
		        }
		        
		        System.out.println("Distribución anual de la donación:");
		        System.out.println("Centro de salud: $" + centroSalud);
		        System.out.println("Comedor de niños: $" + comedorNinos);
		        System.out.println("Inversión en bolsa: $" + inversionBolsa);
		    }
		}

		

	


