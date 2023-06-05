package com;
import java.util.Scanner;
public class Ejercicio8RMQG {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
		 * al lanzar un dado de seis caras y muestre por pantalla el n�mero en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el n�mero del dado introducido es menor que 1 o mayor que 6, se mostrar�
		 * el mensaje: �ERROR: n�mero incorrecto�.
		 */
        Scanner scanner = new Scanner(System.in);
        int resultado;
        String caraOpuesta;

        System.out.print("Ingresa el resultado obtenido en n�mero al lanzar el dado: ");
        resultado = scanner.nextInt();
        scanner.close();
        switch (resultado) {
            case 1:
                caraOpuesta = "seis";
                break;
            case 2:
                caraOpuesta = "cinco";
                break;
            case 3:
                caraOpuesta = "cuatro";
                break;
            case 4:
                caraOpuesta = "tres";
                break;
            case 5:
                caraOpuesta = "dos";
                break;
            case 6:
                caraOpuesta = "uno";
                break;
            default:
                System.out.println("ERROR: n�mero incorrecto");
                return;
        }

        System.out.println("La cara opuesta al resultado obtenido es la n�mero " + caraOpuesta + ".");
    }
	
}
