import java.util.Scanner;

public class Ejercicio8_OBA {

	public static void main(String[] args) {   /*Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
“ERROR: número incorrecto”.*/
		
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
		        int resultado = scanner.nextInt();
		        
		        if (resultado >= 1 && resultado <= 6) {
		            String caraOpuesta = obtenerCaraOpuesta(resultado);
		            System.out.println("La cara opuesta al resultado obtenido es: " + caraOpuesta);
		        } else {
		            System.out.println("ERROR: número incorrecto");
		        }
		    }
		    
		    public static String obtenerCaraOpuesta(int resultado) {
		        String caraOpuesta;
		        
		        switch (resultado) {
		            case 1:
		                caraOpuesta = "6";
		                break;
		            case 2:
		                caraOpuesta = "5";
		                break;
		            case 3:
		                caraOpuesta = "4";
		                break;
		            case 4:
		                caraOpuesta = "3";
		                break;
		            case 5:
		                caraOpuesta = "2";
		                break;
		            case 6:
		                caraOpuesta = "1";
		                break;
		            default:
		                caraOpuesta = "";
		                break;
		        }
		        
		        return caraOpuesta;
		    }
		

		
		
		

	}


