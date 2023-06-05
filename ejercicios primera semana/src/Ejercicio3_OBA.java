

		
		       import java.util.Scanner;

		       public class Ejercicio3_OBA {
			
		       public static void main(String[] args) {     //Crea un programa que pida al usuario 2 números 
		                                                 // y muestre el resultado de su división. Si el segundo número es cero
		                                                 //deve mostrar un mensaje de error.
		    	
		    	
		        Scanner scanner = new Scanner( System.in );
		        double numero1,numero2;

		        System.out.print("Tecleé el primer número: ");
		        numero1 = scanner.nextDouble();

		        System.out.print("Tecleé el segundo número: ");
		        numero2 = scanner.nextDouble();

		        if ( numero2 == 0 ) {
		            System.out.println("Error: No es posible dividir entre 0.");
		        } else {
		        	
		            double resultado = numero1 / numero2;
		            System.out.println("El resultado de la división es: " + resultado);
		            
		            
	}
    }
	}


