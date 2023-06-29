import java.util.Scanner;

public class Ejercicio9_OBA {

	public static void main(String[] args) {   /*Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
		introducimos otro n�mero nos da un error.*/
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el n�mero del d�a de la semana (1 al 7): ");
		        int numeroDia = scanner.nextInt();
		        
		        String diaSemana = obtenerDiaSemana(numeroDia);
		        
		        if (diaSemana.equals("ERROR")) {
		            System.out.println("ERROR: n�mero incorrecto");
		        } else {
		            System.out.println("El d�a correspondiente al n�mero ingresado es: " + diaSemana);
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
		                diaSemana = "Mi�rcoles";
		                break;
		            case 4:
		                diaSemana = "Jueves";
		                break;
		            case 5:
		                diaSemana = "Viernes";
		                break;
		            case 6:
		                diaSemana = "S�bado";
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


