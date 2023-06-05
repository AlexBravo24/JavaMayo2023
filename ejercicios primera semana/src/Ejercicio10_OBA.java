import java.util.Scanner;

public class Ejercicio10_OBA {

	public static void main(String[] args) {  /* Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
		mes correspondiente.*/
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese un número entre 1 y 12: ");
		        int numeroMes = scanner.nextInt();

		        int dias = obtenerDiasMes(numeroMes);

		        if (dias == -1) {
		            System.out.println("ERROR: número incorrecto");
		        } else {
		            System.out.println("El mes correspondiente al número ingresado tiene " + dias + " días.");
		        }
		    }

		    public static int obtenerDiasMes(int numeroMes) {
		        int dias;

		        switch (numeroMes) {
		            case 1: // Enero
		            case 3: // Marzo
		            case 5: // Mayo
		            case 7: // Julio
		            case 8: // Agosto
		            case 10: // Octubre
		            case 12: // Diciembre
		                dias = 31;
		                break;
		            case 4: // Abril
		            case 6: // Junio
		            case 9: // Septiembre
		            case 11: // Noviembre
		                dias = 30;
		                break;
		            case 2: // Febrero
		                dias = 28;
		                break;
		            default:
		                dias = -1; // Número inválido
		                break;
		        }

		        return dias;
		    }
		

	}


