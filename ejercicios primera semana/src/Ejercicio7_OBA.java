import java.util.Scanner;

public class Ejercicio7_OBA {

	public static void main(String[] args) {  /*El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto
debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de
cobrar es la siguiente:
* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de
alumnos.
Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe
pagar cada alumno por el viaje.*/
		
		   Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el n�mero de alumnos: ");
		        int numeroAlumnos = scanner.nextInt();

		        int costoAlumno;
		        int costoTotalCompania;

		        if (numeroAlumnos >= 100) {
		            costoAlumno = 65;
		            costoTotalCompania = numeroAlumnos * costoAlumno;
		        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
		            costoAlumno = 70;
		            costoTotalCompania = numeroAlumnos * costoAlumno;
		        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
		            costoAlumno = 95;
		            costoTotalCompania = numeroAlumnos * costoAlumno;
		        } else {
		            costoAlumno = 0;
		            costoTotalCompania = 4000;
		        }

		        System.out.println("El costo por alumno es: " + costoAlumno + " euros.");
		        System.out.println("El pago a la compa��a de autobuses es: " + costoTotalCompania + " euros.");
		    }
		

		

	}


