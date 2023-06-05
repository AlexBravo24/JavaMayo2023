import java.util.Scanner;

public class Ejercicio9_OBA {

	public static void main(String[] args) {   /*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		introducimos otro número nos da un error.*/
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el número del día de la semana (1 al 7): ");
		        int numeroDia = scanner.nextInt();
		        
		        String diaSemana = obtenerDiaSemana(numeroDia);
		        
		        if (diaSemana.equals("ERROR")) {
		            System.out.println("ERROR: número incorrecto");
		        } else {
		            System.out.println("El día correspondiente al número ingresado es: " + diaSemana);
		        }
		    }
		    
		    public static String obtenerDiaSemana(int numeroDia) {
		        String diaSemana;
		        
		        switch (numeroDia) {
		            case 1:
		                diaSemana = "Lunes";
		                break;
		            case 2:
		                diaSemana = "Martes";
		                break;
		            case 3:
		                diaSemana = "Miércoles";
		                break;
		            case 4:
		                diaSemana = "Jueves";
		                break;
		            case 5:
		                diaSemana = "Viernes";
		                break;
		            case 6:
		                diaSemana = "Sábado";
		                break;
		            case 7:
		                diaSemana = "Domingo";
		                break;
		            default:
		                diaSemana = "ERROR";
		                break;
		        }
		        
		        return diaSemana;
		    }
		

		
		
		

	}


