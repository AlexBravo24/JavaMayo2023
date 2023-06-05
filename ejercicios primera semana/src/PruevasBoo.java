import java.util.Scanner;

public class PruevasBoo {

	public static void main(String[] args) {
		/*crear un algoritmo que reciba dos numeros por teclado e indique cual es mayor o iguales
		*/
		Scanner entrada = new Scanner (System.in);
		double numero1,numero2;
		System.out.println("digite los dos numeros:   ");
		numero1=entrada.nextDouble();
		numero2=entrada.nextDouble();
		
		if (numero1 > numero2 ) { // if = si es que se cumple esto: que numero1 sea mayor a numero2 entonces imprimimos:
			System.out.println("el primer numer es mayor que el segundo numer");
			
		} // debemos cerrar antes de continuar.  
		if (numero1 < numero2 ) {
			System.out.println("el primer numer es menor que el segundo");
			
			
		}
		else {
			System.out.println("son iguales.");
					
		}//cierre de else

	}// cierre de la clase main

}// public class PruebasBoo     es la clase publica
