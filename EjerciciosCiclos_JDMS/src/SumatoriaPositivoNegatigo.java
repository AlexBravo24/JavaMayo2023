import java.util.Scanner;
import java.io.IOException;
public class SumatoriaPositivoNegatigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner sc = new Scanner(System.in);
        int numero;
        char respuesta;
        int sumap=0;
        int sumai=0;
        do {

            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero > 0) {
                    System.out.print("Positivo");
                       sumap=sumap+numero;                   
                } else {
                    System.out.print("Negativo");
                    
                }
                if (numero % 2 == 0) {
                    System.out.println(" Par");
                } else {
                    System.out.println(" Impar");
                    sumai=sumai+numero;
                }
            }

            System.out.print("Desea introducir más números? (S/N): ");                                  
            respuesta = sc.next().charAt(0);

        } while (respuesta != 'N' && respuesta != 'n');
        System.out.println("La sumatoria de los positivos es "+sumap+" la sumatoria de los impares es "+sumai);
	}

}
