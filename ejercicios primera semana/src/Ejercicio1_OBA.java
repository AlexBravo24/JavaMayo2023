
		
		 import java.util.Scanner;

		 public class Ejercicio1_OBA {
			
		 public static void main(String[] args) {             //Realiza un programa que reciba dos números por teclado e 
		    	                                                 //indique cuál es mayor o si son iguales.
		    	
		 Scanner scanner = new Scanner(System.in);          //pedimos importar Scanner
		 
		 double  numero1,numero2;                           // creamos dos variables de tipo double

		 System.out.print("Ingrese el primer número: ");    //pedimos el primer numero
		 numero1 = scanner.nextDouble();                    //Scanner lo guarda en la variable numero1

		 System.out.print("Ingrese el segundo número: ");   //pedimos el segundo numero
		 numero2 = scanner.nextDouble();                    //lo guarda en numero2
		 
		 if (numero1 > numero2)	{ System.out.println("El primer número es mayor."); //si se cumple la condicion de el primer numero es mayor
		 }
		 
		 else if (numero1 < numero2) { System.out.println("El segundo número es mayor.");
	     }
         
		 else { System.out.println("Los números son iguales.");    
		 }   
		        
		    }
	     }
		    
		


	


