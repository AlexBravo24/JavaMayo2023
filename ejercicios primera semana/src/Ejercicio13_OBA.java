import java.util.Scanner;

public class Ejercicio13_OBA {

	public static void main(String[] args) {  //institucion benefica
		
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Ingrese el monto de la donaci�n: $");
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
		        
		        System.out.println("Distribuci�n anual de la donaci�n:");
		        System.out.println("Centro de salud: $" + centroSalud);
		        System.out.println("Comedor de ni�os: $" + comedorNinos);
		        System.out.println("Inversi�n en bolsa: $" + inversionBolsa);
		    }
		}

		

	


