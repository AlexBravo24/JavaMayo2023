import java.util.Scanner;

public class Ejercicio6_OBA {

	public static void main(String[] args) {  /*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
tamaño 2.
Precio inicial se recibe desde teclado*/
		
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese el precio inicial por kilo de uva: ");
		        double precioInicial = scanner.nextDouble();

		        System.out.print("Ingrese el tipo de uva (A o B): ");
		        String tipoUva = scanner.next();

		        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
		        int tamanoUva = scanner.nextInt();

		        double precioFinal = precioInicial;

		        if (tipoUva.equals("A")) {
		            if (tamanoUva == 1) {
		                precioFinal += 0.20;
		            } else if (tamanoUva == 2) {
		                precioFinal += 0.30;
		            }
		        } else if (tipoUva.equals("B")) {
		            if (tamanoUva == 1) {
		                precioFinal -= 0.30;
		            } else if (tamanoUva == 2) {
		                precioFinal -= 0.50;
		            }
		        }

		        System.out.println("El productor recibirá: " + precioFinal + " euros por kilo de uva.");
		    }
		


	}


