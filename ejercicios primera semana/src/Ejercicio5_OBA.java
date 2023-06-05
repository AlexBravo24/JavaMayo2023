import java.util.Scanner;

public class Ejercicio5_OBA {

	public static void main(String[] args) { //Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
											 //parámetros: edad, nota y sexo.
											 //* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
											 //* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
											 //* Otros casos -> NO ACEPTADA 
		
		
        Scanner scanner = new Scanner(System.in);      // Importar Scanner       		        
		        System.out.print("Ingrese la edad: "); // Obtener la edad del solicitante
		        int edad = scanner.nextInt();          // int para guardar numeros

		        System.out.print("Ingrese la nota: ");  // Obtener la nota del solicitante
		        int nota = scanner.nextInt();           // guardar nota con int

		       
		        System.out.print("Ingrese el sexo (M/F): "); // Obtener el sexo del solicitante
		        String sexo = scanner.next();                // guardar sexo con String para letras

		    
		        if (nota >= 5 && edad >= 18) {         // Verificar si la solicitud es aceptada con if		            
		            if (sexo.equalsIgnoreCase("M")) {  // Verificar el sexo del solicitante
		               
		                System.out.println("La solicitud es POSIBLE."); // Mostrar resultado si el sexo es masculino
		            } else if (sexo.equalsIgnoreCase("F")) {
		                
		                System.out.println("La solicitud es ACEPTADA.");// Mostrar resultado si el sexo es femenino
		            } else {
		               
		                System.out.println("La solicitud es NO ACEPTADA."); // Mostrar resultado si el sexo no es válido
		            }
		        } else {
		            
		            System.out.println("La solicitud es NO ACEPTADA.");  // Mostrar resultado si no se cumplen los requisitos mínimos
		            
		            
		        }
		    }
		


	}
	


